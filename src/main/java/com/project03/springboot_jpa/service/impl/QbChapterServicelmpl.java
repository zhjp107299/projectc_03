package com.project03.springboot_jpa.service.impl;

import com.project03.springboot_jpa.pojo.*;
import com.project03.springboot_jpa.respository.JudgeRepository;
import com.project03.springboot_jpa.respository.ProgrammeRepository;
import com.project03.springboot_jpa.respository.QbChoiceRepository;
import com.project03.springboot_jpa.respository.QbGapFillingRepository;
import com.project03.springboot_jpa.service.QbChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QbChapterServicelmpl implements QbChapterService {

    @Autowired
    QbChoiceRepository qbChoiceRepository;

    @Autowired
    QbGapFillingRepository qbGapFillingRepository;

    @Autowired
    JudgeRepository judgeRepository;


    @Autowired
    ProgrammeRepository programmeRepository;

    @Override
    public List<Choice> getQbChoices12(int index) {
        return qbChoiceRepository.getQbChoices12(index);
    }

    @Override
    public List<GapFilling> getQbGapFillings8(int index) {
        return qbGapFillingRepository.getQbGapFillings8(index);
    }

    @Override
    public List<Judge> getQbJudges12(int index) {
        return judgeRepository.getQbJudges12(index);
    }

    @Override
    public List<Programme> getQbProgrammes3(int index) {
        return programmeRepository.getQbProgrammes3(1);
    }
}
