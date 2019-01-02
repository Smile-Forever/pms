package cn.tedu.pms.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Smile
 * Created at 2018/12/31
 */
public class PageableVO<T extends Serializable> {
    private Long totalCount;
    private List<T> data;

    public static <E extends Serializable> PageableVO<E> empty() {
        return new PageableVO<E>().setTotalCount(0L).setData(null);
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public PageableVO<T> setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<T> getData() {
        return data;
    }

    public PageableVO<T> setData(List<T> data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "PageableVO{" +
                "totalCount=" + totalCount +
                ", data=" + data +
                '}';
    }
}
