package cn.tedu.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Smile
 * Created at 2019/1/4
 */
@Entity(name = "user")
public class UserEntity{
    @Id
    private Integer id;
    private String username;
    private String password;
    private String salt;
    private Integer gender;
    private String phone;
    private String email;
    private String avatar;
    @Column(name = "id_delete")
    private Integer isDelete;
    @Column(name = "created_user")
    private String createdUser;
    @Column(name = "created_time")
    private Date createdTime;
    @Column(name = "modified_user")
    private String modifiedUser;
    @Column(name = "modified_time")
    private Date modifiedTime;

    public Integer getId() {
        return id;
    }

    public UserEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public UserEntity setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public UserEntity setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public UserEntity setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public UserEntity setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public UserEntity setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public UserEntity setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public UserEntity setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
        return this;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public UserEntity setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
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
