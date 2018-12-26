package cn.tedu.pms.vo;

/**
 * @author Smile
 * Created at 2018/12/26
 */
public class SysConfigVO {
    private Integer id;
    private String name;
    private Boolean enable;

    public Integer getId() {
        return id;
    }

    public SysConfigVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SysConfigVO setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public SysConfigVO setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    @Override
    public String toString() {
        return "SysConfigVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", enable=" + enable +
                '}';
    }
}
