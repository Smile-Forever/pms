package cn.tedu.pms.dao;

import cn.tedu.pms.PmsLabApplicationTests;
import cn.tedu.pms.entity.DepartmentEntity;
import cn.tedu.pms.vo.DepartmentVO;
import com.alibaba.fastjson.JSON;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author Smile
 * Created at 2019/1/2
 */
public class DeppartmentDaoTest extends PmsLabApplicationTests {

    @Autowired
    private DeppartmentDao dao;

    @Test
    public void findAll() {
        Map<Integer, DepartmentVO> mapping = new HashMap<>();
        List<DepartmentEntity> list = this.dao.findAll();
        List<DepartmentVO> voList = list.stream().map(e -> {
            DepartmentVO vo = new DepartmentVO();
            vo.setChildren(Lists.newArrayList());
            vo.setId(e.getId());
            vo.setName(e.getName());
            vo.setParentId(e.getParentId());
            return vo;
        }).peek(vo -> mapping.put(vo.getId(), vo))
                .collect(Collectors.toList());

        DepartmentVO root = null;

        for (DepartmentVO vo : voList) {
            if (isRoot(vo)) {
                root = vo;
            }
            DepartmentVO parent = mapping.get(vo.getParentId());
            if (parent != null) {
                parent.getChildren().add(vo);
            }
        }
        System.out.println(JSON.toJSONString(root, true));
    }

    private boolean isRoot(DepartmentVO vo) {
        return vo.getParentId() <= 0;
    }
}