package cn.tedu.pms.service.impl;

import cn.tedu.pms.dao.DeppartmentDao;
import cn.tedu.pms.entity.DepartmentEntity;
import cn.tedu.pms.exception.ResourceRepeatException;
import cn.tedu.pms.service.DepartmentService;
import cn.tedu.pms.vo.DepartmentVO;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Smile
 * Created at 2019/1/2
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DeppartmentDao deppartmentDao;

    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public DepartmentVO tree() {
        Map<Integer, DepartmentVO> mapping = new HashMap<>();
        List<DepartmentVO> voList = deppartmentDao.findAll()
                .stream()
                .map(this::convert2VO)
                .peek(vo -> mapping.put(vo.getId(), vo))
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
        return root;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer createDept(Integer parentId, String name) {
        // 1. parentId 不存在 throw exp, select xxx from xxx where id=parentId
            if (parentId == null){
                throw new ResourceRepeatException("不存在父节点!");
            }
        // 2. insert 返回新纪录的自增id(newId)
        // 3. update path /parent/yyyy/xxx/newId where id=newId
        // 4. update parent.isParent = 1 where id=parentId
        return 100;
    }

    private boolean isRoot(DepartmentVO vo) {
        return vo.getParentId() <= 0;
    }

    private DepartmentVO convert2VO(DepartmentEntity e) {
        DepartmentVO vo = new DepartmentVO();
        vo.setChildren(Lists.newArrayList());
        vo.setId(e.getId());
        vo.setName(e.getName());
        vo.setParentId(e.getParentId());
        return vo;
    }
}
