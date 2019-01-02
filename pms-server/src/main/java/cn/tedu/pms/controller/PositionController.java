package cn.tedu.pms.controller;

import cn.tedu.pms.service.PositionService;
import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.PositionVO;
import cn.tedu.pms.vo.Resp;
import cn.tedu.pms.web.SysConfigQueryParam;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Resp<PageableVO<PositionVO>> getPositionAll(
            SysConfigQueryParam param,
            @RequestParam(name = "page", defaultValue = "1", required = false) Integer page,
            @RequestParam(name = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
        PageableVO<PositionVO> vo = positionService.findAll(param, page, pageSize);
        return Resp.success(vo);
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
