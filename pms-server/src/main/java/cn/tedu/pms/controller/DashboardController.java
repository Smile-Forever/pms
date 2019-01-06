package cn.tedu.pms.controller;

import cn.tedu.pms.vo.Resp;
import cn.tedu.pms.vo.SystemInfo;
import org.hyperic.sigar.Sigar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hylexus
 * createdAt 2019/1/4
 **/
@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    SystemInfo systemInfo = new SystemInfo(new Sigar());

    @GetMapping("/mem")
    public Resp memInfo() {
        return Resp.success(systemInfo);
    }
}
