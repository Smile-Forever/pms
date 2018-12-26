package cn.tedu.pms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Smile
 * Created at 2018/12/26
 */
@Entity(name = "national")
public class NationalEntity {
    @Id
    private Integer id;
    private String name;
    private boolean enable;

    public Integer getId() {
        return id;
    }

    public NationalEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public NationalEntity setName(String name) {
        this.name = name;
        return this;
    }

    public boolean getEnable() {
        return enable;
    }

    public NationalEntity setEnable(boolean enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public String toString() {
        return "NationalEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                '}';
    }
}
