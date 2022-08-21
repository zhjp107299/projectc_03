package com.project03.springboot_jpa.service.impl;

import com.project03.springboot_jpa.pojo.QbBank;
import com.project03.springboot_jpa.pojo.QbC;
import com.project03.springboot_jpa.pojo.QbChapter;
import com.project03.springboot_jpa.pojo.ScoreStudent;
import com.project03.springboot_jpa.respository.ScoreStudentRepository;
import com.project03.springboot_jpa.service.QbScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


//获取分数层的实现类
@Service
public class QbScoreServicelmpl implements QbScoreService {

    @Autowired
    private ScoreStudentRepository scoreStudentRepository;



    /**
     *   自主命题的实现方法
     */


    @Override
    //存储自主命题的分数
    public boolean scoreStoreIndepropo(int sId, String indepropoString, String storeString) throws Exception {
        Optional<ScoreStudent> scoreStudent = scoreStudentRepository.findById(sId);
        if (!scoreStudent.isPresent()) {
            return false;
        } else {
            ScoreStudent scoreStudent1 = scoreStudent.get();
            scoreStudent1.setScoreIndepropo(indepropoString);

            scoreStudentRepository.save(scoreStudent1);
            return true;
        }

    }


    //获取自主命题的分数和次数
        public String getIndepropoScore(int id) throws Exception {
            Optional<ScoreStudent> scoreStudent = scoreStudentRepository.findById(id);
            if (scoreStudent.isPresent()) {
                return scoreStudent.get().getScoreIndepropo();
            } else {
                throw new Exception("ID对应试题不存在");
            }
        }




        /**
         *   模拟二级C的实现方法
         */



        //存储模拟二级C的分数和次数

    public boolean scoreStoreC(int sId, String cString, String storeString) {
        Optional<ScoreStudent> scoreStudent = scoreStudentRepository.findById(sId);
        if (!scoreStudent.isPresent()) {
            return false;
        } else {
            ScoreStudent scoreStudent1 = scoreStudent.get();
            switch (cString) {
                case "score_c_simple":
                    scoreStudent1.setScoreCSimple(storeString);
                    break;
                case "score_c_middle":
                    scoreStudent1.setScoreCMiddle(storeString);
                    break;
                case "score_c_hard":
                    scoreStudent1.setScoreCHard(storeString);
                    break;
            }
            scoreStudentRepository.save(scoreStudent1);
            return true;

        }
    }


        //获取模拟二级C的分数
    public QbC getCScore(Integer id) throws Exception {
        Optional<ScoreStudent> scoreStudent = scoreStudentRepository.findById(id);
        if (!scoreStudent.isPresent()){
            throw new Exception("成绩不存在");
        }
        ScoreStudent scoreStudent1 = scoreStudent.get();
        QbC qbC1 = new QbC(scoreStudent1.getScoreCSimple(),scoreStudent1.getScoreCMiddle(),scoreStudent1.getScoreCHard());
        return qbC1;
    }



    /**
     *   题库的实现方法
     */


    @Override
    //存储题库的分数和次数
    public boolean scoreStoreBank(int sId, String bankString, String storeString) {

        Optional<ScoreStudent> scoreStudent = scoreStudentRepository.findById(sId);
        if (!scoreStudent.isPresent()) {
            return false;
        } else {
            ScoreStudent scoreStudent1 = scoreStudent.get();
            switch (bankString) {


                //bankString控制的数据表(score_student)中的字段是选择题，填空题以及判断题
                case "score_choice_10":
                    scoreStudent1.setScoreChoice10(storeString);
                    break;

                case "score_choice_25":
                    scoreStudent1.setScoreChoice25(storeString);
                    break;
                case "score_choice_50":
                    scoreStudent1.setScoreChoice50(storeString);
                    break;


                case "score_gap_filling_10":
                    scoreStudent1.setScoreGapFilling10(storeString);
                    break;

                case "score_gap_filling_25":
                    scoreStudent1.setScoreGapFilling25(storeString);
                    break;
                case "score_gap_filling_50":
                    scoreStudent1.setScoreGapFilling50(storeString);
                    break;
                case "score_judge_10":
                    scoreStudent1.setScoreJudge10(storeString);
                    break;
                case "score_judge_25":
                    scoreStudent1.setScoreJudge25(storeString);
                    break;

                case "score_judge_50":
                    scoreStudent1.setScoreJudge50(storeString);
                    break;
            }
            scoreStudentRepository.save(scoreStudent1);
            return true;
        }

    }


    //获取题库的分数
    public  QbBank getBankScore(Integer id) throws Exception {
        Optional<ScoreStudent> scoreStudent = scoreStudentRepository.findById(id);
        if (!scoreStudent.isPresent()) {
            throw new Exception("成绩不存在");
        }
       ScoreStudent scoreStudent1 = scoreStudent.get();
        QbBank qbBank1 = new QbBank(scoreStudent1.getScoreChoice10(),scoreStudent1.getScoreChoice25(),scoreStudent1.getScoreChoice50(),scoreStudent1.getScoreGapFilling10(),scoreStudent1.getScoreGapFilling25(),scoreStudent1.getScoreGapFilling50(),scoreStudent1.getScoreJudge10(),scoreStudent1.getScoreJudge25(),scoreStudent1.getScoreJudge50());
        return qbBank1;
    }




    /**
     *   章节次数
     */

    //存储章节的分数和次数
    public boolean scoreStoreChapter(int sId,String chapterIndexString,String storeString){
            Optional<ScoreStudent> scoreStudent = scoreStudentRepository.findById(sId);
            if (!scoreStudent.isPresent()) {
                return false;
            } else {
                ScoreStudent scoreStudent1 = scoreStudent.get();
                switch (chapterIndexString){
                    case "score_chapter_1":
                        scoreStudent1.setScoreChapter1(storeString);
                        break;

                    case "score_chapter_2":
                        scoreStudent1.setScoreChapter2(storeString);
                        break;
                    case "score_chapter_3":
                        scoreStudent1.setScoreChapter3(storeString);
                        break;
                    case "score_chapter_4":
                        scoreStudent1.setScoreChapter4(storeString);
                        break;

                    case "score_chapter_5":
                        scoreStudent1.setScoreChapter5(storeString);
                        break;


                    case "score_chapter_6":
                        scoreStudent1.setScoreChapter6(storeString);
                        break;

                    case "score_chapter_7":
                        scoreStudent1.setScoreChapter7(storeString);
                        break;


                    case "score_chapter_8":
                        scoreStudent1.setScoreChapter8(storeString);
                        break;

                    case "score_chapter_9":
                        scoreStudent1.setScoreChapter9(storeString);
                        break;
                }


                scoreStudentRepository.save(scoreStudent1);
                return true;
            }

        }



        //获取章节分数
      public  QbChapter getChapterScore(Integer id) throws Exception {
        Optional<ScoreStudent> scoreStudent = scoreStudentRepository.findById(id);
            if (!scoreStudent.isPresent()){
                throw new Exception("成绩不存在");
            }
            ScoreStudent scoreStudent1 = scoreStudent.get();
            QbChapter qbChapter1 = new QbChapter(scoreStudent1.getScoreChapter1(),scoreStudent1.getScoreChapter2(),scoreStudent1.getScoreChapter3(),scoreStudent1.getScoreChapter4(),scoreStudent1.getScoreChapter5(),scoreStudent1.getScoreChapter6(),scoreStudent1.getScoreChapter7(),scoreStudent1.getScoreChapter8(),scoreStudent1.getScoreChapter9());
            return qbChapter1;
        }


}
