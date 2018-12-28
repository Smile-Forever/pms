package cn.tedu.pms.titletest;

import cn.tedu.pms.dao.TitleDao;
import cn.tedu.pms.entity.TitleEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TitleTestCase {
    @Autowired
    private TitleDao titleDao;
    @Test
    public void selectAll(){
        List<TitleEntity> all = titleDao.findAll();
            for(TitleEntity alls : all){
                System.out.println(alls);
        }
    }
    @Test
    public void selectByName(){
        TitleEntity name = titleDao.findByName("jack");
        System.out.println(name);
    }
    @Test
    public void selectById(){
//        "/test/xx.txt"
        // D://t/xxx.txxt  --> "D:"
        // FIXME 永远向Linux靠拢
        TitleEntity byId = titleDao.findById(2);
        System.out.println(byId);
    }
    @Test
    public void insert(){
        TitleEntity t = new TitleEntity();
        t.setName("Jack");
        Integer rows = titleDao.insert(t);
        System.out.println(rows);
    }
    @Test
    public void delete(){
        Integer[] ids = {1};
        Integer rows = titleDao.deleteIds(ids);
        System.out.println(rows);
    }

    @Test
    public void update(){
        TitleEntity t = new TitleEntity();
        t.setName("Tom");
        Integer rows = titleDao.update(t);
        System.out.println(rows);
    }
}
