package com.project03.springboot_jpa.pojo;
/*实体类：判断题*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "qb_judge")
public class Judge {
    @Id
    private Integer id;
    private String topic;

    @Column(name = "answer_right")
    private String answerRight;

    private String chapter;

    @Column(name = "indepropo_name")
    private String indepropoName;

    public Judge(Integer id, String topic, String answerRight, String chapter) {
        this.id = id;
        this.topic = topic;
        this.answerRight = answerRight;
        this.chapter = chapter;
    }

}
