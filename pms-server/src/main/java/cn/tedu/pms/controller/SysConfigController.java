package cn.tedu.pms.controller;

import cn.tedu.pms.service.NationalService;
import cn.tedu.pms.vo.Resp;
import cn.tedu.pms.vo.SysConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/26
 */
@RestController
@RequestMapping("/sys-config")
public class SysConfigController {

    @Autowired
    private RequestMappingHandlerMapping mappingHandlerMapping;

    @Autowired
    private NationalService nationalService;
    @RequestMapping("/national-list")
    public Resp<List<SysConfigVO>> getAllNational(){
        return Resp.success(nationalService.getAll());
    }
}
