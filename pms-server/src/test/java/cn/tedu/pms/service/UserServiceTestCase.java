package cn.tedu.pms.service;

import cn.tedu.pms.PmsLabApplicationTests;
import cn.tedu.pms.entity.UserEntity;
import cn.tedu.pms.exception.ResourceRepeatException;
import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.UserVO;
import cn.tedu.pms.web.UserInsertParam;
import cn.tedu.pms.web.UserQueryParam;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author Smile
 * Created at 2019/1/5
 */
public class UserServiceTestCase extends PmsLabApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    public void test() {
        UserQueryParam param = new UserQueryParam();
        PageableVO<UserVO> all = userService.findAll(param, 1, 3);
        System.out.println(all);
    }

    @Test
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addnew() {
        Date now = new Date();
        UserEntity user = new UserEntity();
        user.setUsername("xiaoabaixxxxxxxxx");
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
        UserEntity entity = userService.addUser(user);
        System.err.println("result=" + entity);
    }

    @Test(expected = ResourceRepeatException.class)
    @Transactional
    public void testUserExists() {
        addnew();
        addnew();
    }

    @Test
    public void testDeleteNotExistsUser() {
        int effectedLines = this.userService.deleteIds(-1111);
        Assert.assertEquals("删除不存在的资源，返回0", 0, effectedLines);
    }

    @Test
    @Transactional
    public void testDeleteExistsUser() {
        Date now = new Date();
        UserEntity user = new UserEntity();
        user.setUsername("xiaoabaixxxxxxxxx");
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
        UserEntity entity = userService.addUser(user);

        int effectedLines = this.userService.deleteIds(entity.getId());
        Assert.assertEquals("删除存在的资源，返回1", 1, effectedLines);
    }
}
