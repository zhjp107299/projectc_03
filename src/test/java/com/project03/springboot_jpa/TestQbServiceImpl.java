package com.project03.springboot_jpa;


import com.project03.springboot_jpa.service.impl.QbServicelmpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//测试QbServiceImpl
@SpringBootTest
public class TestQbServiceImpl {

    @Autowired
    QbServicelmpl qbServicelmpl;

    //获取题库总数
    @Test
    void testGetQbCount() {
        System.out.println(qbServicelmpl.getQbCount());
    }


    //随机获取10/25/50选择题练习
    @Test
    void testGetQbChoiceNList() {
        System.out.println(qbServicelmpl.getQbChoiceNList(10));
    }


    //随机获取10/25/50填空题练习
    @Test
    void testGetQbGapFillingNList() {
        System.out.println(qbServicelmpl.getQbGapFillingNList(10));
    }


    //随机获取10/25/50判断题练习
    @Test
    void testGetQbJudgeListN() {
        System.out.println(qbServicelmpl.getQbJudgeListN(10));
    }


    //随机获取10/25/50编程题练习
    @Test
    void testGetQbProgrammeListN() {
        System.out.println(qbServicelmpl.getQbProgrammeListN(10));

    }


    //c模块
    @Test
    void testGetQbChoice_50() {
        System.out.println(qbServicelmpl.getQbChoice_50("simple"));
    }


    @Test
    void testGetQbGapFilling_20() {
        System.out.println(qbServicelmpl.getQbGapFilling_20("simple"));
    }


    @Test
    void testGetQbProgramme_4() {
        System.out.println(qbServicelmpl.getQbProgramme_4("simple"));
    }


}
