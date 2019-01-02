package cn.tedu.pms.vo;

import java.io.Serializable;

/**
 * @author Smile
 * Created at 2018/12/28
 */
public class TitleVO implements Serializable {
    private Integer id;
    private String name;
    private Boolean enable;

    public Integer getId() {
        return id;
    }

    public TitleVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TitleVO setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public TitleVO setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public String toString() {
        return "TitleVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                '}';
    }
}
