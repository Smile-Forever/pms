package cn.tedu.pms.vo;

import java.io.Serializable;

/**
 * @author Smile
 * Created at 2018/12/27
 */
public class PositionVO implements Serializable {
    private Integer id;
    private String name;
    private Boolean enable;

    public Integer getId() {
        return id;
    }

    public PositionVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PositionVO setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public PositionVO setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public String toString() {
        return "PositionVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                '}';
    }
}
