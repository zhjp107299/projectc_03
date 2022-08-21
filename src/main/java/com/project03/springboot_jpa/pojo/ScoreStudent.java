package com.project03.springboot_jpa.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * score_student表的数据结构
 */
@Data
@Entity(name = "score_student")
@AllArgsConstructor
@NoArgsConstructor
public class ScoreStudent {

    public Integer getScoreId() {
        return scoreId;
    }

    @Id  //表示指定实体类中用于数据映射的主键
    private Integer scoreId;

    @Column(name = "score_chapter_1")
    private String scoreChapter1;
    @Column(name = "score_chapter_2")
    private String scoreChapter2;
    @Column(name = "score_chapter_3")
    private String scoreChapter3;
    @Column(name = "score_chapter_4")
    private String scoreChapter4;
    @Column(name = "score_chapter_5")
    private String scoreChapter5;
    @Column(name = "score_chapter_6")
    private String scoreChapter6;
    @Column(name = "score_chapter_7")
    private String scoreChapter7;
    @Column(name = "score_chapter_8")
    private String scoreChapter8;
    @Column(name = "score_chapter_9")
    private String scoreChapter9;



    @Column(name = "score_choice_10")
    private String scoreChoice10;
    @Column(name = "score_choice_25")
    private String scoreChoice25;
    @Column(name = "score_choice_50")
    private String scoreChoice50;

    @Column(name = "score_gap_filling_10")
    private String scoreGapFilling10;
    @Column(name = "score_gap_filling_25")
    private String scoreGapFilling25;
    @Column(name = "score_gap_filling_50")
    private String scoreGapFilling50;

    @Column(name = "score_judge_10")
    private String scoreJudge10;
    @Column(name = "score_judge_25")
    private String scoreJudge25;
    @Column(name = "score_judge_50")
    private String scoreJudge50;

    @Column(name = "score_programme_10")
    private String scoreProgramme10;
//    @Column(name = "score_chapter1")
//    private String scoreProgramme25;
//    @Column(name = "score_chapter1")
//    private String scoreProgramme50;

    @Column(name = "score_c_simple")
    private String scoreCSimple;
    @Column(name = "score_c_middle")
    private String scoreCMiddle;
    @Column(name = "score_c_hard")
    private String scoreCHard;

    @Column(name = "score_indepropo")
    private String scoreIndepropo;

    public ScoreStudent(Integer scoreId) {
        this.scoreId = scoreId;
    }
}
