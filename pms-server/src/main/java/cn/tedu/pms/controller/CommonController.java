package cn.tedu.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Smile
 * Created at 2019/1/8
 */
@Controller
public class CommonController {

    @GetMapping({"/", "/index", "/index.html"})
    public String index() {
        return "index";
    }
}
