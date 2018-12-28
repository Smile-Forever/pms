package cn.tedu.pms.service;

import cn.tedu.pms.vo.TitleVO;
import cn.tedu.pms.web.SysConfigQueryParam;

import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/28
 */
public interface TitleService {
    List<TitleVO> findAll();
    Integer insert(SysConfigQueryParam param);
    void deleteByIds(Integer id);
    void update(SysConfigQueryParam param);
}
