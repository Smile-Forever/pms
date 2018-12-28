package cn.tedu.pms.controller;

import cn.tedu.pms.service.TitleService;
import cn.tedu.pms.utils.MapBuilder;
import cn.tedu.pms.vo.PositionVO;
import cn.tedu.pms.vo.Resp;
import cn.tedu.pms.vo.TitleVO;
import cn.tedu.pms.web.SysConfigQueryParam;
import com.google.common.collect.Maps;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/28
 */
@RestController("the-name-is-spring-beans, 不是mapping的地址")
@RequestMapping("/sys-config")
public class TitleController {
    @Autowired
    private TitleService titleService;

    @GetMapping("/title/list")
    public Resp<List<TitleVO>> getTitleAll() {
        return Resp.success(titleService.findAll());
    }

    @PostMapping("/title/new")
    public Resp getNewTitle(@RequestBody SysConfigQueryParam param) {
        Integer newId = titleService.insert(param);
//        HashMap<String, Object> ret = Maps.newHashMap();
//        ret.put("newId" , newId);
        return Resp.success(new MapBuilder().kv("newId", newId));
    }

    @PostMapping("/title/update")
    public Resp<PositionVO> getUpdate(@RequestBody SysConfigQueryParam param) {
        titleService.update(param);
        return Resp.success();
    }

    @GetMapping("/title/delete")
    public Resp<PositionVO> getDelete(@RequestParam("xxx") Integer id) {
        titleService.deleteByIds(id);
        return Resp.success();
    }
}
