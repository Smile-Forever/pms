package cn.tedu.pms.vo;

import java.util.List;

/**
 * @author Smile
 * Created at 2019/1/2
 */
public class DepartmentVO {
    private Integer id;
    private String name;
    private Integer parentId;

    private List<DepartmentVO> children;

    public Integer getId() {
        return id;
    }

    public DepartmentVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DepartmentVO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public DepartmentVO setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public List<DepartmentVO> getChildren() {
        return children;
    }

    public DepartmentVO setChildren(List<DepartmentVO> children) {
        this.children = children;
        return this;
    }
}
