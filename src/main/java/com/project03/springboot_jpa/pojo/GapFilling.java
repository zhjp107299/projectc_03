package com.project03.springboot_jpa.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


//数据表：qb_gap_filling
/*实体类：填空题*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "qb_gap_filling")
public class GapFilling {

    @Id
    private Integer id;//填空题的编号
    private String topic;//题目
    @Column(name = "answer_right1")
    private String answerRight1;//正确答案

    @Column(name = "answer_right2")
    private String answerRight2;//正确答案

    @Column(name = "answer_right3")
    private String answerRight3;//正确答案

    @Column(name = "answer_right4")
    private String answerRight4;//正确答

    private String chapter;//所属章节

    @Column(name = "c_level")
    private String cLevel;
    @Column(name = "indepropo_name")
    private String indepropoName;

    public GapFilling(Integer id, String topic, String answerRight1, String answerRight2, String answerRight3, String answerRight4, String chapter, String cLevel) {
        this.id = id;
        this.topic = topic;
        this.answerRight1 = answerRight1;
        this.answerRight2 = answerRight2;
        this.answerRight3 = answerRight3;
        this.answerRight4 = answerRight4;
        this.chapter = chapter;
        this.cLevel = cLevel;
    }

}
