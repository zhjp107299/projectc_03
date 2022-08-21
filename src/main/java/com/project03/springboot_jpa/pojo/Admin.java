package com.project03.springboot_jpa.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "administrator")
public class Admin {

    @Id

    private String administrator;
    private String password;
    @Column(name = "a_permission")
    private String aPermission;

    @Transient
    private String preAdmin;

    public Admin(String administrator, String password, String preAdmin) {
        this.preAdmin = preAdmin;
        this.administrator = administrator;
        this.password = password;
    }

    public Admin(String administrator, String password) {
        this.administrator = administrator;
        this.password = password;
    }
}
