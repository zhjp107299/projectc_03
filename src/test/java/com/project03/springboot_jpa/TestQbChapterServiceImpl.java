package com.project03.springboot_jpa;


import com.project03.springboot_jpa.service.impl.QbChapterServicelmpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//测试QbChapterService
@SpringBootTest
public class TestQbChapterServiceImpl {

    @Autowired
    QbChapterServicelmpl qbChapterServicelmpl;

    //获取12道选择题
    @Test
    void testGetQbChoices12() {
        System.out.println(qbChapterServicelmpl.getQbChoices12(1));
    }

    //获取8道填空题
    @Test
    void testGetQbGapFillings8() {
        System.out.println(qbChapterServicelmpl.getQbGapFillings8(1));
    }

    //获取12道判断题
    @Test
    void testGetQbJudges12() {

        System.out.println(qbChapterServicelmpl.getQbJudges12(1));
    }

    //获取3道编程题
    @Test
    void testGetQbProgrammes3() {
        System.out.println(qbChapterServicelmpl.getQbProgrammes3(1));
    }


}
