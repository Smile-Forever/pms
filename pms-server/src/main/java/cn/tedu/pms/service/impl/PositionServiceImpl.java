package cn.tedu.pms.service.impl;

import cn.tedu.pms.dao.PositionDao;
import cn.tedu.pms.entity.PositionEntity;
import cn.tedu.pms.exception.ParamException;
import cn.tedu.pms.exception.ResourceNotFoundException;
import cn.tedu.pms.exception.ResourceRepeatException;
import cn.tedu.pms.service.PositionService;
import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.PositionVO;
import cn.tedu.pms.web.SysConfigQueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Smile
 * Created at 2018/12/27
 */
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionDao positionDao;

    @Override
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public PageableVO<PositionVO> findAll(SysConfigQueryParam param, Integer page, Integer pageSize) {

        long totalCount = positionDao.count(param);
        if (totalCount <= 0) {
            return PageableVO.empty();
        }

        List<PositionVO> data = positionDao.findAll(param, (page - 1) * pageSize, pageSize).stream().map(e -> {
            PositionVO vo = new PositionVO();
            vo.setId(e.getId());
            vo.setName(e.getName());
            vo.setEnable(e.getEnable());
            return vo;
        }).collect(Collectors.toList());

        return new PageableVO<PositionVO>().setData(data).setTotalCount(totalCount);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer insert(SysConfigQueryParam param) {
        PositionEntity old = this.positionDao.findByName(param.getName());
        if (old != null) {
            throw new ResourceRepeatException("已经存在名称为" + param.getName() + "的部门");
        }
        PositionEntity entity = new PositionEntity();
        entity.setName(param.getName());
        entity.setEnable(true);
        this.positionDao.insert(entity);
        return entity.getId();
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void deleteByIds(Integer id) {
        this.positionDao.deleteByIds(new Integer[]{id});
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void update(SysConfigQueryParam param) {
        if (param.getId() == null || param.getId() <= 0) {
            throw new ParamException("id为空或不合法");
        }

        PositionEntity old = this.positionDao.findById(param.getId());
        if (old == null) {
            throw new ResourceNotFoundException("不存在id为" + param.getId() + "部门");
        }

        if (StringUtils.isEmpty(param.getName())) {
            throw new ParamException("好好写个名字行不行");
        }
        PositionEntity entity = new PositionEntity();
        entity.setId(param.getId());
        entity.setName(param.getName());
        entity.setEnable(param.getEnable() == null ? true : param.getEnable());
        this.positionDao.update(entity);
    }
}
