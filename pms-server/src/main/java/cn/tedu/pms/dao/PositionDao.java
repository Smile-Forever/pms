package cn.tedu.pms.dao;

import cn.tedu.pms.entity.PositionEntity;
import cn.tedu.pms.web.SysConfigQueryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/27
 */
@Mapper
public interface PositionDao {
    PositionEntity findByName(@Param("name") String name);
    PositionEntity findById(@Param("id") Integer id);
    List<PositionEntity> findAll(@Param("condition") SysConfigQueryParam param, @Param("start") Integer start, @Param("count") Integer count);
    long count(SysConfigQueryParam param);
    Integer insert(PositionEntity positionEntity);
    Integer deleteByIds(Integer[] ids);
    Integer update(PositionEntity param);

}
