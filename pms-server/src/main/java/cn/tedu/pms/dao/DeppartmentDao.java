package cn.tedu.pms.dao;

import cn.tedu.pms.entity.DepartmentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/29
 */
@Mapper
public interface DeppartmentDao {
    DepartmentEntity findByName(@Param("name") String name);
    DepartmentEntity findById(@Param("id") Integer id);
    DepartmentEntity findByPath(@Param("path") String path);
    List<DepartmentEntity> findAll();
    Integer insert(DepartmentEntity departmentEntity);
    Integer delete(Integer[] ids);
    Integer update(DepartmentEntity pram);
}
