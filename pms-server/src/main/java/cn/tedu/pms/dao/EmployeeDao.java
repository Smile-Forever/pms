package cn.tedu.pms.dao;

import cn.tedu.pms.entity.EmployeeEntity;

import java.util.List;

/**
 * @author Smile
 * Created at 2019/1/2
 */
public interface EmployeeDao {
    List<EmployeeEntity> findAll();
}
