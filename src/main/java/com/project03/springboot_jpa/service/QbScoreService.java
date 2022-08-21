package com.project03.springboot_jpa.service;

import com.project03.springboot_jpa.pojo.QbBank;
import com.project03.springboot_jpa.pojo.QbC;
import com.project03.springboot_jpa.pojo.QbChapter;

public interface QbScoreService {

    //存储自主命题
    boolean scoreStoreIndepropo(int sId, String indepropoString,String storeString) throws Exception;
    //存储C练习分数
    boolean scoreStoreC(int sId, String cString,String storeString);
    //存储题库练习分数
    boolean scoreStoreBank(int sId, String bankString,String storeString);
    //存储章节分数
    boolean scoreStoreChapter(int sId,String chapterIndexString,String storeString);




    //获取自主命题
    String getIndepropoScore(int id) throws Exception;

    //获取各模拟C的分数
    QbC getCScore(Integer id) throws Exception;
    //获取各类练习的分数
    QbBank getBankScore(Integer id) throws Exception;
    //获取各章节的分数
    QbChapter getChapterScore(Integer id) throws Exception;
}
