package cn.tedu.pms.dao;

import cn.tedu.pms.entity.NationalEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/26
 */

@Mapper
public interface NationalDao {
    List<NationalEntity> findAll();
}
