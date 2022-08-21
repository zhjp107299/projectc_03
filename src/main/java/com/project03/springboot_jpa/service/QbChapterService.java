package com.project03.springboot_jpa.service;

import com.project03.springboot_jpa.pojo.Choice;
import com.project03.springboot_jpa.pojo.GapFilling;
import com.project03.springboot_jpa.pojo.Judge;
import com.project03.springboot_jpa.pojo.Programme;

import java.util.List;

public interface QbChapterService {

    //获取题库总数
 /*   int getQbCount();*/

    //获取12道选择题
    List<Choice> getQbChoices12(int index);
    //获取8道填空题
    List<GapFilling> getQbGapFillings8(int index);
    //获取12道判断题
    List<Judge> getQbJudges12(int index);
    //获取3道编程题
    List<Programme> getQbProgrammes3(int index);

}
