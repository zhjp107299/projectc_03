package com.project03.springboot_jpa;

import com.project03.springboot_jpa.commonDao.CommonMapper;
import com.project03.springboot_jpa.pojo.*;
import com.project03.springboot_jpa.respository.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootJpaApplicationTests {

//    ---------------------------------------------------------------------------------
    @Autowired
    CommonMapper commonMapper;

    @Autowired
    QbChoiceRepository qbChoiceRepository;

    @Autowired
    QbGapFillingRepository qbGapFillingRepository;

    @Autowired
    JudgeRepository judgeRepository;

    @Autowired
    ProgrammeRepository programmeRepository;

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    StudentRepository studentRepository;
    //正常
    @Test
    void testGetIndepropoShowList() {
        System.out.println(qbChoiceRepository.getIndepropoShowList("111").size());
        System.out.println();
}


    //正常
    @Test
    void testGetIndePropoNameStatus(){
        System.out.println(qbChoiceRepository.getIndePropoNameStatus("1111"));
    }

    //正常
    @Test
    void  testGetIndeChoices12(){
        List<Choice> choiceList =  qbChoiceRepository.getIndeChoices12(null);
        for (Choice choice: choiceList){
            System.out.println(choice);
        }
    }

    //正常
    @Test
    void  testGetIndeGapFillings8(){
        List<GapFilling> gapFillingList =  qbGapFillingRepository.getIndeGapFillings8(null);
        for (GapFilling gapFilling: gapFillingList){
            System.out.println(gapFilling);
        }
    }

    //正常
    @Test
    void  testgetIndeJudges12(){
        System.out.println(judgeRepository.getIndeJudges12(null));
    }

    //正常
    @Test
    void  testGetIndeProgrammes3(){
        System.out.println(programmeRepository.getIndeProgrammes3(null));
    }

    //正常
    @Test
    void testChangeIndePropoStatus(){
        System.out.println(commonMapper.changeIndePropoStatus("qb_choice","yes","111"));
//        System.out.println(qbChoiceRepository.changeIndePropoStatus("qb_choice","yes","111"));
    }


    @Test
    void  testSaveTeacher(){
        System.out.println(teacherRepository.save(new Teacher(2132312,"111","111")));
    }


    //正常
    @Test
    void testaveAll(){
        List<Programme> programmeList = new ArrayList<>();
        Programme programme =new Programme(11,"11","111","111","111","11","11");
        programmeList.add(programme);
        System.out.println(programmeRepository.saveAll(programmeList).size());
    }









}
