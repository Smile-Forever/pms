package cn.tedu.pms.service;


import cn.tedu.pms.vo.PositionVO;
import cn.tedu.pms.web.SysConfigQueryParam;

import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/27
 */
public interface PositionService {
    List<PositionVO> findAll();
    Integer insert(SysConfigQueryParam param);
    void deleteByIds(Integer id);
    void update(SysConfigQueryParam param);
}
