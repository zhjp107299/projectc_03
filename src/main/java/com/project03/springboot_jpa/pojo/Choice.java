package com.project03.springboot_jpa.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*实体类 ：选择题*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "qb_choice")
public class Choice {

    @Id
    private Integer id;//选择题的编号

    private String topic;//题目
    @Column(name = "choice_A")
    private String choiceA;//A选项
    @Column(name = "choice_B")
    private String choiceB;//B选项
    @Column(name = "choice_C")
    private String choiceC;//C选项
    @Column(name = "choice_D")
    private String choiceD;//D选项
    private String chapter;//所属章节
    @Column(name = "choice_right")
    private String choiceRight;//正确答案
    @Column(name = "c_level")
    private String cLevel;
    @Column(name = "indepropo_name")
    private String indepropoName;
    @Column(name = "indepropo_switch")
    private String indepropoSwitch;
    public Choice(Integer id, String topic, String choiceA, String choiceB, String choiceC, String choiceD, String chapter, String choiceRight, String cLevel) {
        this.id = id;
        this.topic = topic;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
        this.chapter = chapter;
        this.choiceRight = choiceRight;
        this.cLevel = cLevel;
    }

}
