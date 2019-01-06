package cn.tedu.pms.vo;

import cn.tedu.pms.validator.IsValidUserName;
import cn.tedu.pms.validator.IsValidUserId;
import cn.tedu.pms.validator.UpdateValidatorIdentifier;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Smile
 * Created at 2019/1/5
 */
public class UserVO implements Serializable {
    @IsValidUserId(groups = {UpdateValidatorIdentifier.class})
    private Integer id;

    //    @NotEmpty(message = "空的") //TODO 尼玛 ？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？
    @IsValidUserName(message = "就不给丫的过")
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

    public Integer getId() {
        return id;
    }

    public UserVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserVO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserVO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public UserVO setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public UserVO setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserVO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserVO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public UserVO setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public UserVO setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public UserVO setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
        return this;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public UserVO setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public UserVO setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
        return this;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public UserVO setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    @Override
    public String toString() {
        return "UserVO{" +
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
