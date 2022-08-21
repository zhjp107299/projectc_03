package com.project03.springboot_jpa.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Target;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "teacher")
public class Teacher {


    @Id
    @Column(name = "t_id")
    private Integer tId;//编号

    @Column(name = "t_name")
    private String tName;//姓名

    @Column(name = "t_password")
    private String tPassword;//密码

    @Column(name = "t_permission")
    private Integer tPermission;

    @Column(name = "t_deadline")
    private LocalDate tDeadline;

    @Column(name = "t_status")
    private String tStatus;

    @Transient
    private boolean status;

    //添加一个时
    public Teacher(Integer tId, String tName, String tPassword) {
        this.tId = tId;
        this.tName = tName;
        this.tPassword = tPassword;

        LocalDate now = LocalDate.now();
        this.tDeadline = now.plusMonths(6);
    }
}
