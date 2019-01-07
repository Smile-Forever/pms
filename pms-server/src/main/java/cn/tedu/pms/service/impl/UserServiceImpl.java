package cn.tedu.pms.service.impl;

import cn.tedu.pms.dao.UserDao;
import cn.tedu.pms.entity.UserEntity;
import cn.tedu.pms.exception.ResourceRepeatException;
import cn.tedu.pms.service.UserService;
import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.UserVO;
import cn.tedu.pms.web.UserQueryParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


/**
 * @author Smile
 * Created at 2019/1/5
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public PageableVO<UserVO> findAll(UserQueryParam param, Integer page, Integer pageSize) {
        long totalPage = userDao.count(param);
        if (totalPage <= 0) {
            return PageableVO.empty();
        }

        List<UserVO> data = userDao.findAll(param, (page - 1) * pageSize, pageSize).stream().map(e ->{
            UserVO vo = new UserVO();
            BeanUtils.copyProperties(e,vo);
            return vo;
        }).collect(Collectors.toList());
        return new PageableVO<UserVO>().setData(data).setTotalCount(totalPage);
    }

    private String getMD5Password(String srcPassword , String salt){
        String str = salt + srcPassword + salt;
        for (int i = 0; i < 10 ; i++){
            str = DigestUtils.md5DigestAsHex(str.getBytes()).toUpperCase();
        }
        return str;
    }

    @Override
   @Transactional(rollbackFor = Exception.class)
    public UserEntity addUser(UserEntity entity) {
        UserEntity data = userDao.findByUsername(entity.getUsername());
        if(data != null){
            throw new ResourceRepeatException("已经存在名称为" + entity.getUsername() + "的用户");
        }
        entity.setIsDelete(0);
        String salt = UUID.randomUUID().toString().toUpperCase();
        String srcPassword = entity.getPassword();
        String md5Password = getMD5Password(srcPassword , salt);
        Date now = new Date();
        entity.setCreatedUser(entity.getUsername());
        entity.setCreatedTime(now);
        entity.setModifiedUser(entity.getUsername());
        entity.setCreatedTime(now);
        entity.setPassword(md5Password);
        entity.setSalt(salt);
        userDao.addnew(entity);
        return entity;
    }

    @Override
    public void changeInfo(UserQueryParam param) {

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteIds(Integer id) {
        return this.userDao.deleteIds(new Integer[]{id});
    }
}
