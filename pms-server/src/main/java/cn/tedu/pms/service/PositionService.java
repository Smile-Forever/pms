package cn.tedu.pms.service;


import cn.tedu.pms.vo.PageableVO;
import cn.tedu.pms.vo.PositionVO;
import cn.tedu.pms.web.SysConfigQueryParam;

/**
 * @author Smile
 * Created at 2018/12/27
 */
public interface PositionService {
    PageableVO<PositionVO> findAll(SysConfigQueryParam param, Integer page, Integer pageSize);
    Integer insert(SysConfigQueryParam param);
    void deleteByIds(Integer id);
    void update(SysConfigQueryParam param);
}
