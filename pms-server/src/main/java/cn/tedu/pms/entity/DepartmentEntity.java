package cn.tedu.pms.entity;

import javax.persistence.Column;
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
    @Column(name = "parent_id")
    private Integer parentId;
    @Column(name = "created_by")
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

    public Integer getParentId() {
        return parentId;
    }

    public DepartmentEntity setParentId(Integer parentId) {
        this.parentId = parentId;
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
                ", parentId=" + parentId +
                ", createdBy=" + createdBy +
                '}';
    }
}
