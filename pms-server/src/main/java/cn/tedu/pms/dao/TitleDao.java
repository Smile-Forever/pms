package cn.tedu.pms.dao;

import cn.tedu.pms.entity.TitleEntity;
import cn.tedu.pms.web.SysConfigQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/28
 */
@Mapper
public interface TitleDao {

    TitleEntity findByName(@Param("name") String name);
    TitleEntity findById(@Param("id") Integer id);
    List<TitleEntity> findAll(@Param("condition") SysConfigQueryParam param , @Param("start") Integer start , @Param("count") Integer count);
    long count(SysConfigQueryParam param);
    Integer insert(TitleEntity titleEntity);
    Integer deleteIds(Integer[] ids);
    Integer update(TitleEntity param);
}
