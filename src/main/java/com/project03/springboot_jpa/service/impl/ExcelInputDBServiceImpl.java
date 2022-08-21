package com.project03.springboot_jpa.service.impl;


import com.project03.springboot_jpa.pojo.*;
import com.project03.springboot_jpa.respository.*;
import com.project03.springboot_jpa.service.ExcelInputDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ExcelInputDBServiceImpl implements ExcelInputDBService {

    @Autowired
    private QbChoiceRepository qbChoiceRepository;

    @Autowired
    private QbGapFillingRepository qbGapFillingRepository;


    @Autowired
    private JudgeRepository judgeRepository;

    @Autowired
    private ProgrammeRepository programmeRepository;

    //选择题导入数据库
    @Override
    public boolean choiceInputDB(List<Choice> choiceList) {

        List<Choice> choiceList2 = qbChoiceRepository.saveAll(choiceList);
        return choiceList2.size()==choiceList.size();
    }

    //自主命题的选择题导入数据库
    @Override
    //这里因为使用的是同一个数据层，故没写对应的注入对象
    public boolean indeChoiceInputDB(List<Choice> choiceList) {
        List<Choice> choiceList2 = qbChoiceRepository.saveAll(choiceList);
        return choiceList2.size()==choiceList.size();

    }


    //这些都没有经过测试
    //填空题导入数据库
    @Override
    public boolean gapFillingInputDB(List<GapFilling> gapFillingList) {

        List<GapFilling> gapFillingList2 =qbGapFillingRepository.saveAll(gapFillingList);
        return gapFillingList2.size()==gapFillingList.size();


    }

    //自主命题的填空题导入数据库
    @Override
    public boolean indeGapFillingInputDB(List<GapFilling> gapFillingList) {
        List<GapFilling> gapFillingList2 =qbGapFillingRepository.saveAll(gapFillingList);
        return gapFillingList2.size()==gapFillingList.size();
    }


    //以下皆未测试，平且都是跟上面一样的写法


    @Override
    public boolean judgeInputDB(List<Judge> judgeList) {

        List<Judge> judgeList2 =judgeRepository.saveAll(judgeList);
        return judgeList2.size()==judgeList.size();

    }


    @Override
    public boolean indeJudgeInputDB(List<Judge> judgeList) {
        List<Judge> judgeList2 =judgeRepository.saveAll(judgeList);
        return judgeList2.size()==judgeList.size();
    }




    @Override
    public boolean programmeInputDB(List<Programme> programmeList) {


        List<Programme> programmeList2 =programmeRepository.saveAll(programmeList);
        return programmeList2.size()==programmeList.size();

    }


    @Override
    public boolean indeProgrammeInputDB(List<Programme> programmeList) {
        List<Programme> programmeList2 =programmeRepository.saveAll(programmeList);
        return programmeList2.size()==programmeList.size();

    }


}
