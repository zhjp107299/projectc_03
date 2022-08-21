package com.project03.springboot_jpa.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装响应体
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InfoMsg {
    private int code;
    private  String msg;
}
