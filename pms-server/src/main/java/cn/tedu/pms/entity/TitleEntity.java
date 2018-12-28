package cn.tedu.pms.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Smile
 * Created at 2018/12/28
 */
@Table(name = "title")
public class TitleEntity {
    @Id
    private Integer id;
    private String name;
    private Boolean enable;

    public Integer getId() {
        return id;
    }

    public TitleEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TitleEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public TitleEntity setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public String toString() {
        return "TitleEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                '}';
    }
}
