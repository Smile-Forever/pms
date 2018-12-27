package cn.tedu.pms.inserttest;

import cn.tedu.pms.dao.PositionDao;
import cn.tedu.pms.entity.PositionEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Smile
 * Created at 2018/12/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InsertTestCase {
    @Autowired
    PositionDao positionDao;
    @Test
    public void test(){
        PositionEntity positionEntity = new PositionEntity();
        positionEntity.setName("JAVA工程师");
        Integer rows = positionDao.insert(positionEntity);
        System.out.println(rows);
    }
}
