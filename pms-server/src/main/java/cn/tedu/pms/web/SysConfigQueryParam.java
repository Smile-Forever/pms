package cn.tedu.pms.web;

/**
 * @author Smile
 * Created at 2018/12/27
 */
public class SysConfigQueryParam {
    private Integer id;
    private Boolean enable;
    private String name;

    public String getName() {
        return name;
    }

    public SysConfigQueryParam setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public SysConfigQueryParam setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getEnable() {
        return enable;
    }

    public SysConfigQueryParam setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
}
