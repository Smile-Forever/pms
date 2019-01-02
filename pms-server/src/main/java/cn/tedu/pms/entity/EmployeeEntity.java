package cn.tedu.pms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Smile
 * Created at 2019/1/2
 */
public class EmployeeEntity implements Serializable {
    private Integer id;
    private String id_card_no;
    private String name;
    private String email;
    private String phone;
    private Integer gender;
    private Date birthday;
    private Integer political_position_id;
    private Integer position_id;
    private Integer title_id;
    private Integer degree_id;
    private Integer department_id;
    private Integer national_id;
    private Integer salary_id;
    private String address;
    private String school;
    private String profession;
    private Integer status;
    private Date entry_date;
    private Date official_staff_date;
    private Date contract_start_date;
    private Date contract_end_date;
    private Date created_date;
    private Integer created_by;

    public Integer getId() {
        return id;
    }

    public EmployeeEntity setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getId_card_no() {
        return id_card_no;
    }

    public EmployeeEntity setId_card_no(String id_card_no) {
        this.id_card_no = id_card_no;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeeEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public EmployeeEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public EmployeeEntity setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public EmployeeEntity setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public EmployeeEntity setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public Integer getPolitical_position_id() {
        return political_position_id;
    }

    public EmployeeEntity setPolitical_position_id(Integer political_position_id) {
        this.political_position_id = political_position_id;
        return this;
    }

    public Integer getPosition_id() {
        return position_id;
    }

    public EmployeeEntity setPosition_id(Integer position_id) {
        this.position_id = position_id;
        return this;
    }

    public Integer getTitle_id() {
        return title_id;
    }

    public EmployeeEntity setTitle_id(Integer title_id) {
        this.title_id = title_id;
        return this;
    }

    public Integer getDegree_id() {
        return degree_id;
    }

    public EmployeeEntity setDegree_id(Integer degree_id) {
        this.degree_id = degree_id;
        return this;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public EmployeeEntity setDepartment_id(Integer department_id) {
        this.department_id = department_id;
        return this;
    }

    public Integer getNational_id() {
        return national_id;
    }

    public EmployeeEntity setNational_id(Integer national_id) {
        this.national_id = national_id;
        return this;
    }

    public Integer getSalary_id() {
        return salary_id;
    }

    public EmployeeEntity setSalary_id(Integer salary_id) {
        this.salary_id = salary_id;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public EmployeeEntity setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getSchool() {
        return school;
    }

    public EmployeeEntity setSchool(String school) {
        this.school = school;
        return this;
    }

    public String getProfession() {
        return profession;
    }

    public EmployeeEntity setProfession(String profession) {
        this.profession = profession;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public EmployeeEntity setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getEntry_date() {
        return entry_date;
    }

    public EmployeeEntity setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
        return this;
    }

    public Date getOfficial_staff_date() {
        return official_staff_date;
    }

    public EmployeeEntity setOfficial_staff_date(Date official_staff_date) {
        this.official_staff_date = official_staff_date;
        return this;
    }

    public Date getContract_start_date() {
        return contract_start_date;
    }

    public EmployeeEntity setContract_start_date(Date contract_start_date) {
        this.contract_start_date = contract_start_date;
        return this;
    }

    public Date getContract_end_date() {
        return contract_end_date;
    }

    public EmployeeEntity setContract_end_date(Date contract_end_date) {
        this.contract_end_date = contract_end_date;
        return this;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public EmployeeEntity setCreated_date(Date created_date) {
        this.created_date = created_date;
        return this;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public EmployeeEntity setCreated_by(Integer created_by) {
        this.created_by = created_by;
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", id_card_no='" + id_card_no + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", political_position_id=" + political_position_id +
                ", position_id=" + position_id +
                ", title_id=" + title_id +
                ", degree_id=" + degree_id +
                ", department_id=" + department_id +
                ", national_id=" + national_id +
                ", salary_id=" + salary_id +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", profession='" + profession + '\'' +
                ", status=" + status +
                ", entry_date=" + entry_date +
                ", official_staff_date=" + official_staff_date +
                ", contract_start_date=" + contract_start_date +
                ", contract_end_date=" + contract_end_date +
                ", created_date=" + created_date +
                ", created_by=" + created_by +
                '}';
    }
}
