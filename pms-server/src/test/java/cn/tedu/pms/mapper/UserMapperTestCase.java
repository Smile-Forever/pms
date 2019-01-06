package cn.tedu.pms.mapper;

import java.util.Date;

import cn.tedu.pms.PmsLabApplicationTests;
import cn.tedu.pms.dao.UserDao;
import cn.tedu.pms.entity.UserEntity;
import cn.tedu.pms.web.UserInsertParam;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperTestCase extends PmsLabApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void addnew() {
        Date now = new Date();
        UserInsertParam user = new UserInsertParam();
        user.setUsername("mybatis");
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
        Integer rows = userDao.addnew(user);
        System.err.println("rows=" + rows);
    }

    @Test
    public void findByUsername() {
        String username = "root";
        UserEntity user = userDao.findByUsername(username);
        System.err.println(user);
    }

    @Test
    public void findById() {
        Integer id = 1;
        UserEntity user = userDao.findById(id);
        System.err.println(user);
    }
    
    @Test
    public void updateInfo() {
    	UserEntity user = new UserEntity();
		user.setId(1);
		user.setUsername("Spring");
		user.setPassword("666");
		user.setGender(0);
		user.setPhone("13100131001");
		user.setEmail("liucs@tedu.cn");
		user.setModifiedUser("ChengHeng");
		user.setModifiedTime(new Date());
		Integer rows = userDao.updateInfo(user);
		System.err.println("rows=" + rows);
    }

}