package com.project03.springboot_jpa.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "student")
public class Student {
    @Id  //表示指定实体类中用于数据映射的主键
    @Column(name = "s_id")
    private Integer sId;//学号
    @Column(name = "s_name")
    private String sName;//姓名
    @Column(name = "s_gender")
    private String sGender;//性别
    @Column(name = "s_password")
    private String sPassword;//密码
    @Column(name = "s_class")
    private String sClass;//班级
    @Column(name = "s_teacher")
    private String sTeacher;//所属教师
    @Column(name = "s_permission")
    private Integer sPermission;//学生 权限

    @Column(name = "s_deadline")
    private LocalDate sDeadline;
    @Transient
    private String sStatus;//激活状态

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "update_time")
    private Date updateTime;//更新时间
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "create_time")
    private Date createTime;//创建时间

    @Column(name = "s_status")
    private boolean status;

    /**
     * 添加、注册时   设置默认值
     *
     * @param sId
     * @param sName
     * @param sGender
     * @param sPassword
     * @param sClass
     * @param sTeacher
     */
    public Student(Integer sId, String sName, String sGender, String sPassword, String sClass, String sTeacher) {
        this.sId = sId;
        this.sName = sName;
        this.sGender = sGender;
        this.sPassword = sPassword;
        this.sClass = sClass;
        this.sTeacher = sTeacher;
        this.sPermission = 4;

        LocalDate now = LocalDate.now();//给默认值
        this.sDeadline = now.plusMonths(6);
        this.sStatus = "true";
        this.updateTime = new Date();
        this.createTime = new Date();
    }


    /**
     * 修改学生时   不能修改默认值
     */
    public Student(Integer id, String name, String gender, String password, String sClass, String teacher, Date updateTime) {
        this.sId = id;
        this.sName = name;
        this.sGender = gender;
        this.sPassword = password;
        this.sClass = sClass;
        this.sTeacher = teacher;
        this.updateTime = updateTime;
    }

}
