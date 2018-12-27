package cn.tedu.pms.controller;

import cn.tedu.pms.service.PositionService;
import cn.tedu.pms.vo.PositionVO;
import cn.tedu.pms.vo.Resp;
import cn.tedu.pms.web.SysConfigQueryParam;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Smile
 * Created at 2018/12/27
 */
@RestController
@RequestMapping("/sys-config")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping("/position/list")
    public Resp<List<PositionVO>> getPositionAll() {
        return Resp.success(positionService.findAll());
    }

    @PostMapping("/position/new")
    public Resp getNewPosition(@RequestBody SysConfigQueryParam param) {
        Integer newId = positionService.insert(param);
        Map<String, Object> ret = Maps.newHashMap();
        ret.put("newId", newId);
        return Resp.success(ret);
    }

    @PostMapping("/position/update")
    public Resp<PositionVO> getUpdate(@RequestBody SysConfigQueryParam param) {
        positionService.update(param);
        return Resp.success();
    }

    @GetMapping("/position/delete")
    public Resp<PositionVO> getDelete(@RequestParam("id") Integer id) {
        positionService.deleteByIds(id);
        return Resp.success();
    }
}
