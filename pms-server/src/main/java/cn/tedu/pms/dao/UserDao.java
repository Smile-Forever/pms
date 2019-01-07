package cn.tedu.pms.dao;

import cn.tedu.pms.entity.UserEntity;
import cn.tedu.pms.web.SysConfigQueryParam;
import cn.tedu.pms.web.UserInsertParam;
import cn.tedu.pms.web.UserQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Smile
 * Created at 2019/1/4
 */
@Mapper
public interface UserDao {
    /**
     * 新增用户
     * @param entity
     * @return 受影响行数
     */
    Integer addnew(UserEntity entity);

    /**
     * 根据用户id查询用户数据
     * @param id
     * @return
     */
    UserEntity findById(Integer id);

    /**
     * 根据用户用户名查询用户数据
     * @param name
     * @return 匹配用户数据，若没有匹配到，则返回null
     */
    UserEntity findByUsername(String name);

    /**
     * 修改用户数据
     * @param userEntity
     * @return 受影响行数
     */
    Integer updateInfo(UserEntity userEntity);

    /**
     * 查询全部用户
     * @param param
     * @param start
     * @param count
     * @return
     */
    List<UserEntity> findAll(@Param("condition")UserQueryParam param , @Param("start") Integer start , @Param("count") Integer count);
    long count(UserQueryParam param);

    /**
     * 根据用户id删除用户
     * @param ids 用户id
     * @return 受影响的行数
     */
    Integer deleteIds(Integer[] ids);
}
