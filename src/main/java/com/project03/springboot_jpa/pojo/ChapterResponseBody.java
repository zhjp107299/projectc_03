package com.project03.springboot_jpa.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 返回章节测试题型的数据结构
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChapterResponseBody {
    private List<Choice> choiceList;
    private List<GapFilling> gapFillingList;
    private List<Judge> judgeList;
    private List<Programme> programmeList;
}
