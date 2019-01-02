package cn.tedu.pms.controller;

import cn.tedu.pms.service.DepartmentService;
import cn.tedu.pms.utils.MapBuilder;
import cn.tedu.pms.vo.DepartmentVO;
import cn.tedu.pms.vo.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Smile
 * Created at 2019/1/2
 */
@RestController
@RequestMapping("/sys-config/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/tree")
    public Resp<DepartmentVO> tree() {
        return Resp.success(departmentService.tree());
    }

    @PostMapping("/new")
    public Resp createDept(
            @RequestParam("parentId") Integer parentId,
            @RequestParam("name") String name) {
        Integer newId = this.departmentService.createDept(parentId, name);
        return Resp.success(new MapBuilder().kv("newId", newId));
    }
}
