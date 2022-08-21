package com.project03.springboot_jpa.pojo;

/*实体类：编程题*/


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "qb_programme")
public class Programme {
    @Id
    private Integer id;
    private String topic;
    private String answer1;
    private String answer2;
    private String answer3;
    private String chapter;

    @Column(name = "c_level")
    private String cLevel;

    @Column(name = "indepropo_name")
    private String indepropoName;

    public Programme(Integer id, String topic, String answer1, String answer2, String answer3, String chapter, String cLevel) {
        this.id = id;
        this.topic = topic;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.chapter = chapter;
        this.cLevel = cLevel;
    }

}
