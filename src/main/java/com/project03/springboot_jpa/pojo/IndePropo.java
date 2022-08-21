package com.project03.springboot_jpa.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 自主命题结构
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndePropo {
    private Map<String,Choice> mapChoice;
    private Map<String,GapFilling> mapGapFilling;
    private Map<String,Judge> mapJudge;
    private Map<String,Programme> mapProgramme;
}
