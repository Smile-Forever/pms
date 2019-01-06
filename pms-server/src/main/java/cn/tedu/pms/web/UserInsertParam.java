package cn.tedu.pms.web;

import java.util.Date;

/**
 * @author Smile
 * Created at 2019/1/6
 */
public class UserInsertParam {
    private String username;
    private String password;
    private String salt;
    private Integer gender;
    private String phone;
    private String email;
    private String avatar;
    private Integer isDelete;
    private String createdUser;
    private Date createdTime;
    private String modifiedUser;
    private Date modifiedTime;

    public String getUsername() {
        return username;
    }

    public UserInsertParam setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserInsertParam setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public UserInsertParam setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public UserInsertParam setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserInsertParam setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserInsertParam setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public UserInsertParam setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public UserInsertParam setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public UserInsertParam setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public UserInsertParam setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public UserInsertParam setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
        return this;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public UserInsertParam setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    @Override
    public String toString() {
        return "UserInsertParam{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", isDelete=" + isDelete +
                ", createdUser='" + createdUser + '\'' +
                ", createdTime=" + createdTime +
                ", modifiedUser='" + modifiedUser + '\'' +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
