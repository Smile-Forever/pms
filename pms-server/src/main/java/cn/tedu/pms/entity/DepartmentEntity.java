package cn.tedu.pms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Smile
 * Created at 2018/12/29
 */
@Entity(name = "department")
public class DepartmentEntity {
    @Id
    private Integer id;
    private String name;
    private Boolean enable;
    private String path;
    private Integer parent_id;
    private Integer createdBy;

    public Integer getId() {
        return id;
    }

    public DepartmentEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DepartmentEntity setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public DepartmentEntity setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    public String getPath() {
        return path;
    }

    public DepartmentEntity setPath(String path) {
        this.path = path;
        return this;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public DepartmentEntity setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
        return this;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public DepartmentEntity setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public String toString() {
        return "DepartmentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                ", path='" + path + '\'' +
                ", parent_id=" + parent_id +
                ", createdBy=" + createdBy +
                '}';
    }
}
