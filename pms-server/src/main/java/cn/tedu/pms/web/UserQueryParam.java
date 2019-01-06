package cn.tedu.pms.web;

import java.util.Date;

/**
 * @author Smile
 * Created at 2019/1/5
 */
public class UserQueryParam {
    private Integer id;
    private String username;
    private Integer gender;
    private String phone;
    private String email;
    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public UserQueryParam setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserQueryParam setUsername(String username) {
        this.username = username;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public UserQueryParam setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserQueryParam setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserQueryParam setEmail(String email) {
        this.email = email;
        return this;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public UserQueryParam setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    @Override
    public String toString() {
        return "UserQueryParam{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
