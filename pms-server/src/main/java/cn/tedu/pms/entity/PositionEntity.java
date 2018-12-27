package cn.tedu.pms.entity;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Smile
 * Created at 2018/12/27
 */
@Table(name = "position")
public class PositionEntity {
    @Id
    private Integer id;
    private  String name;
    private Boolean enable;

    public Integer getId() {
        return id;
    }

    public PositionEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PositionEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public PositionEntity setEnable(boolean enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public String toString() {
        return "PositionEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                '}';
    }
}
