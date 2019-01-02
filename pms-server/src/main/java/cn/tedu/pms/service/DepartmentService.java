package cn.tedu.pms.service;

import cn.tedu.pms.vo.DepartmentVO;

/**
 * @author Smile
 * Created at 2019/1/2
 */
public interface DepartmentService {
    DepartmentVO tree();

    Integer createDept(Integer parentId, String name);
}
