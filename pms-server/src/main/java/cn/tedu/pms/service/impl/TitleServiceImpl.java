package cn.tedu.pms.service.impl;

import cn.tedu.pms.dao.TitleDao;
import cn.tedu.pms.entity.TitleEntity;
import cn.tedu.pms.exception.ParamException;
import cn.tedu.pms.exception.ResourceNotFoundException;
import cn.tedu.pms.exception.ResourceRepeatException;
import cn.tedu.pms.service.TitleService;
import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.TitleVO;
import cn.tedu.pms.web.SysConfigQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Smile
 * Created at 2018/12/28
 */
@Service
public class TitleServiceImpl implements TitleService {
    @Autowired
    private TitleDao titleDao;

    @Override
    @Transactional(readOnly = true,rollbackFor = RuntimeException.class)
    public PageableVO<TitleVO> findAll(SysConfigQueryParam param, Integer page, Integer pageSize) {

        long totalCount = titleDao.count(param);
        if (totalCount <= 0){
            return PageableVO.empty();
        }

        List<TitleVO> data = titleDao.findAll(param , (page - 1) * pageSize, pageSize).stream().map(e -> {
            TitleVO vo = new TitleVO();
            vo.setId(e.getId());
            vo.setName(e.getName());
            vo.setEnable(e.getEnable());
            return vo;
        }).collect(Collectors.toList());
        return new PageableVO<TitleVO>().setData(data).setTotalCount(totalCount);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer insert(SysConfigQueryParam param) {
        TitleEntity oldName = this.titleDao.findByName(param.getName());
        if (oldName != null) {
            // failure-fast 快速失败
            throw new ResourceRepeatException("已经存在名称为" + param.getName() + "的部门");
        }

        TitleEntity entity = new TitleEntity();
        entity.setName(param.getName());
        entity.setEnable(true);
        this.titleDao.insert(entity);
        return entity.getId();
//
//        do {
//        }while (false){
//        }
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void deleteByIds(Integer id) {
        // TODO 限制 一下个数(200)  >=200 丢弃/报错
        this.titleDao.deleteIds(new Integer[]{id});
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void update(SysConfigQueryParam param) {
        if (param.getId() == null || param.getId() <= 0) {
            throw new ParamException("id为空或不合法");
        }

        TitleEntity oldEntity = this.titleDao.findById(param.getId());
        if (oldEntity == null) {
            throw new ResourceNotFoundException("不存在id为" + param.getId() + "职称");
        }
        if (StringUtils.isEmpty(param.getName())) {
            throw new ParamException("好好写个名字行不行");
        }

        TitleEntity entity = new TitleEntity();
        entity.setId(param.getId());
        entity.setName(param.getName());
        entity.setEnable(param.getEnable() == null ? true : param.getEnable());
        this.titleDao.update(entity);
    }
}
