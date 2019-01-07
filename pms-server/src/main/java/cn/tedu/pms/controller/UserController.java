package cn.tedu.pms.controller;

import cn.tedu.pms.entity.UserEntity;
import cn.tedu.pms.validator.UpdateValidatorIdentifier;
import cn.tedu.pms.service.UserService;
import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.Resp;
import cn.tedu.pms.vo.UserVO;
import cn.tedu.pms.web.UserInsertParam;
import cn.tedu.pms.web.UserQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author Smile
 * Created at 2019/1/4
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/all-list")
    public Resp<PageableVO<UserVO>> getUserAll(
            UserQueryParam param,
            @RequestParam(name = "page", defaultValue = "1", required = false) Integer page,
            @RequestParam(name = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
        PageableVO<UserVO> vo = userService.findAll(param, page, pageSize);
        return Resp.success(vo);
    }

    @PostMapping("/add")
    public Resp<Void> add(@Validated @RequestBody UserInsertParam param) {
      // userService.addUser(param);
        return Resp.success();
    }

    @PostMapping("/update")
    public Resp update(@Validated(UpdateValidatorIdentifier.class) @RequestBody UserVO param) {

        return Resp.success();
    }
    @GetMapping("/delete")
    public Resp getDelete(@RequestParam("id") Integer id){
        userService.deleteIds(id);
        return Resp.success();
    }
}
