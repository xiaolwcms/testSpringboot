package com.testspringboot.utils;

/**
 * @program: testSpringboot
 * @ClassName StrUtils
 * @description:
 * @author: 雷维昌
 * @create: 2023-07-24 14:44
 * @Version 1.0
 **/
public class StrUtils {
    /**
     * 字符串处理
     * @param str  需要处理的字符串
     * @param symbol  字符串间隔判断符号
     */
    public static void formatPrint (String str,String symbol){
        String[] sArray =str.split(symbol);
        StringBuilder stringBuilder=new StringBuilder();
        for(String s:sArray){
            stringBuilder.append("'").append(s).append("',");
        }
        System.out.println(stringBuilder.toString());
    }
}
