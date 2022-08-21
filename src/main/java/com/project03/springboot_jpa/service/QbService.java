package com.project03.springboot_jpa.service;

/**
 * 业务层 ：题库练习和模拟C的一些操作
 */


import com.project03.springboot_jpa.pojo.Choice;
import com.project03.springboot_jpa.pojo.GapFilling;
import com.project03.springboot_jpa.pojo.Judge;
import com.project03.springboot_jpa.pojo.Programme;

import java.util.List;

public interface QbService {

    //获取题库总数
    int getQbCount();

    //随机获取10/25/50选择题练习
    List<Choice> getQbChoiceNList(int count);
    //随机获取10/25/50填空题练习
    List<GapFilling> getQbGapFillingNList(int count);
    //随机获取10/25/50判断题练习
    List<Judge> getQbJudgeListN(int count);
    //随机获取10/25/50编程题练习
    List<Programme> getQbProgrammeListN(int count);

    //c模块
    List<Choice> getQbChoice_50(String type);
    List<GapFilling> getQbGapFilling_20(String type);
    List<Programme> getQbProgramme_4(String type);

}
