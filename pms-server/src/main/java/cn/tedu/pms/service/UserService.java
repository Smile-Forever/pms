package cn.tedu.pms.service;

import cn.tedu.pms.entity.UserEntity;
import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.UserVO;
import cn.tedu.pms.web.UserInsertParam;
import cn.tedu.pms.web.UserQueryParam;

/**
 * @author Smile
 * Created at 2019/1/5
 */
public interface UserService {
    /**
     * 查询用户
     * @param param
     * @param page
     * @param pageSize
     * @return
     */
    PageableVO<UserVO> findAll(UserQueryParam param , Integer page , Integer pageSize);

    /**
     * 添加新用户
     * @param param
     * @return
     */
    UserInsertParam addUser(UserInsertParam param);
    /**
     * 修改用户资料
     * @param param
     */
    void changeInfo(UserQueryParam param);

    /**
     * 删除用户
     * @param id
     */
    void deleteIds(Integer id);
}
