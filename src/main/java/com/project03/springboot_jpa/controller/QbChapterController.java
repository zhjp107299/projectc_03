package com.project03.springboot_jpa.controller;


import com.alibaba.fastjson.JSONArray;
import com.project03.springboot_jpa.pojo.*;
import com.project03.springboot_jpa.service.QbChapterService;
import com.project03.springboot_jpa.utils.InfoMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 处理章节测试
 */
@RestController
@ResponseBody
@CrossOrigin
public class QbChapterController {

    @Autowired
    private QbChapterService qbChapterService;

    //章节测试题输出
    @RequestMapping(value = "/chapter",method = RequestMethod.POST,produces = "application/json;charset=utf-8")
    public String getChapterNTest(Integer chapterIndex){
        System.out.println(chapterIndex);
        ChapterResponseBody chapterResponseBody = null;
        InfoMsg infoMsg = new InfoMsg();
        com.project03.springboot_jpa.utils.ResponseBody<ChapterResponseBody> chapterResponseBodyResponseBody = new com.project03.springboot_jpa.utils.ResponseBody<>();
        //12选择题
        List<Choice> choices12 = qbChapterService.getQbChoices12(chapterIndex);
        //8填空题
        List<GapFilling> gapFillings8 = qbChapterService.getQbGapFillings8(chapterIndex);
        //12判断题
        List<Judge> judges12 = qbChapterService.getQbJudges12(chapterIndex);
        //3道编程题
        List<Programme> programmes3 = qbChapterService.getQbProgrammes3(chapterIndex);
       chapterResponseBody = new ChapterResponseBody(choices12,gapFillings8,judges12,programmes3);
        System.out.println(chapterResponseBody);

        infoMsg.setCode(200);
        infoMsg.setMsg("获取章节测试成功");
        chapterResponseBodyResponseBody.setInfo(infoMsg);
        chapterResponseBodyResponseBody.setData(chapterResponseBody);
        return JSONArray.toJSONString(chapterResponseBodyResponseBody);
    }

}
