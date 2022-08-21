package com.project03.springboot_jpa.service;

import com.project03.springboot_jpa.pojo.Choice;
import com.project03.springboot_jpa.pojo.GapFilling;
import com.project03.springboot_jpa.pojo.Judge;
import com.project03.springboot_jpa.pojo.Programme;


import java.util.List;

public interface ExcelInputDBService {

    //各题型导入数据库
    boolean choiceInputDB(List<Choice> choiceList);   //选择
    boolean gapFillingInputDB(List<GapFilling> gapFillingList);   //填空
    boolean judgeInputDB(List<Judge> judgeList);        //判断
    boolean programmeInputDB(List<Programme> programmeList);        //编程题

    //导入自主命题
    // inde开头代指自主命题的意思
    boolean indeChoiceInputDB(List<Choice> choiceList);
    boolean indeGapFillingInputDB(List<GapFilling> gapFillingList);
    boolean indeJudgeInputDB(List<Judge> judgeList);
    boolean indeProgrammeInputDB(List<Programme> programmeList);




}
