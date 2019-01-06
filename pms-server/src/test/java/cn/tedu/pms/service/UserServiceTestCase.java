package cn.tedu.pms.service;

import cn.tedu.pms.PmsLabApplicationTests;
import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.UserVO;
import cn.tedu.pms.web.UserInsertParam;
import cn.tedu.pms.web.UserQueryParam;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author Smile
 * Created at 2019/1/5
 */
public class UserServiceTestCase extends PmsLabApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        UserQueryParam param = new UserQueryParam();
        PageableVO<UserVO> all = userService.findAll(param, 1, 3);
        System.out.println(all);
    }

    @Test
    public void addnew() {
        Date now = new Date();
        UserInsertParam user = new UserInsertParam();
        user.setUsername("xiaobai");
        user.setPassword("1234");
        user.setGender(1);
        user.setIsDelete(1);
        user.setPhone("13800138001");
        user.setEmail("mybatis@tedu.cn");
        user.setSalt("Hello,MD5!");
        user.setCreatedUser("Admin");
        user.setModifiedUser("Admin");
        user.setCreatedTime(now);
        user.setModifiedTime(now);
        UserInsertParam result = userService.addUser(user);
        System.err.println("result=" + result);
    }
}
