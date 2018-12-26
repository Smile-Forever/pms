package cn.tedu.pms.service.impl;
import cn.tedu.pms.dao.NationalDao;
import cn.tedu.pms.service.NationalService;
import cn.tedu.pms.vo.SysConfigVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Smile
 * Created at 2018/12/26
 */
@Service
public class NationalServiceImpl implements NationalService {

    @Autowired
    private NationalDao nationalMapper;

    @Override
    public List<SysConfigVO> getAll() {
        return nationalMapper.findAll().stream().map(e -> {
            SysConfigVO vo = new SysConfigVO();
            vo.setEnable(e.getEnable());
            vo.setId(e.getId());
            vo.setName(e.getName());
            return vo;
        }).collect(Collectors.toList());
    }
}

