package com.project03.springboot_jpa.service.impl;

import com.project03.springboot_jpa.pojo.Choice;
import com.project03.springboot_jpa.pojo.GapFilling;
import com.project03.springboot_jpa.pojo.Judge;
import com.project03.springboot_jpa.pojo.Programme;
import com.project03.springboot_jpa.respository.JudgeRepository;
import com.project03.springboot_jpa.respository.ProgrammeRepository;
import com.project03.springboot_jpa.respository.QbChoiceRepository;
import com.project03.springboot_jpa.respository.QbGapFillingRepository;
import com.project03.springboot_jpa.service.QbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QbServicelmpl implements QbService {


    @Autowired
    QbChoiceRepository qbChoiceRepository;

    @Autowired
    QbGapFillingRepository qbGapFillingRepository;

    @Autowired
    JudgeRepository judgeRepository;


    @Autowired
    ProgrammeRepository programmeRepository;

    //获取选择题总数
    @Override
    public int getQbCount() {
        return (int) qbChoiceRepository.count();
    }

    //随机10/25/50选择题练习
    @Override
    public List<Choice> getQbChoiceNList(int count) {
        return qbChoiceRepository.getQbChoiceNList(count);
    }


    @Override
    public List<GapFilling> getQbGapFillingNList(int count) {
        return qbGapFillingRepository.getQbGapFillingNList(count);
    }

    @Override
    public List<Judge> getQbJudgeListN(int count) {
        return judgeRepository.getQbJudgeListN(count);
    }

    @Override
    public List<Programme> getQbProgrammeListN(int count) {
        return programmeRepository.getQbProgrammeListN(count);
    }

    @Override
    public List<Choice> getQbChoice_50(String type) {
        return qbChoiceRepository.getQbChoice_50(type);
    }

    @Override
    public List<GapFilling> getQbGapFilling_20(String type) {
        return qbGapFillingRepository.getQbGapFilling_20(type);
    }

    @Override
    public List<Programme> getQbProgramme_4(String type) {
        return programmeRepository.getQbProgramme_4(type);
    }


}
