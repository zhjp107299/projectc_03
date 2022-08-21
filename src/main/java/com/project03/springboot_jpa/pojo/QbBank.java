package com.project03.springboot_jpa.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QbBank {

    private String scoreChoice10;
    private String scoreChoice25;
    private String scoreChoice50;
    private String scoreGapFilling10;
    private String scoreGapFilling25;
    private String scoreGapFilling50;
    private String scoreJudge10;
    private String scoreJudge25;
    private String scoreJudge50;
    private String scoreProgramme5;
    private String scoreProgramme10;
    private String scoreProgramme20;



    //这里不知道为什么要写构造方法
    public QbBank(String scoreChoice10, String scoreChoice25, String scoreChoice50, String scoreGapFilling10, String scoreGapFilling25, String scoreGapFilling50, String scoreJudge10, String scoreJudge25, String scoreJudge50) {
    }
}
