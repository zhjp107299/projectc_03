package com.project03.springboot_jpa.service.impl;


import com.project03.springboot_jpa.pojo.GapFilling;
import com.project03.springboot_jpa.pojo.IndepropoShow;
import com.project03.springboot_jpa.pojo.*;
import com.project03.springboot_jpa.pojo.Programme;
import com.project03.springboot_jpa.respository.QbChoiceRepository;
import com.project03.springboot_jpa.service.IndePropoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndePropoServicelmpl implements IndePropoService {

    @Autowired
    QbChoiceRepository qbChoiceRepository;

    @Override
    public List<IndepropoShow> getIndepropoShowList(String teacher) {

       return qbChoiceRepository.getIndepropoShowList(teacher);
    }

    @Override
    public List<IndepropoShow> getIndepropoNameList(String teacher) {
        return qbChoiceRepository.getIndepropoNameList(teacher);
    }

    @Override
    public String getIndePropoNameStatus(String indeName) {
        return qbChoiceRepository.getIndePropoNameStatus(indeName);
    }

    @Override
    public List<Choice> getIndeChoices12(String indepropoName) {
        return qbChoiceRepository.getIndeChoices12(indepropoName);
    }

    @Override
    public List<GapFilling> getIndeGapFillings8(String indepropoName) {
        return qbChoiceRepository.getIndeGapFillings8(indepropoName);
    }

    @Override
    public List<Judge> getIndeJudges12(String indepropoName) {
        return qbChoiceRepository.getIndeJudges12(indepropoName);
    }

    @Override
    public List<Programme> getIndeProgrammes3(String indepropoName) {
        return qbChoiceRepository.getIndeProgrammes3(indepropoName);
    }

    @Override
    public boolean changeIndePropoStatus(String indeType, String newStatus,String indeName) {
        return qbChoiceRepository.changeIndePropoStatus(indeType,newStatus,indeName);
    }



}
