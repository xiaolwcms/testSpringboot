package com.testspringboot.utils;

/**
 * @program: testSpringboot
 * @ClassName StrUtils
 * @description:
 * @author: aaa
 * @create: 2023-07-24 14:44
 * @Version 1.0
 **/
public class StrUtils {
    /**
     * 字符串处理
     * @param str  需要处理的字符串
     * @param symbol  字符串间隔判断符号
     * @param packagingSymbols  双引号类似的符号
     * @param segmentationSymbol  分割多个字符串符号
     */
    public static void formatPrint (String str,String symbol,String packagingSymbols,String segmentationSymbol){
        String[] sArray =str.split(symbol);
        StringBuilder stringBuilder=new StringBuilder();
        for(String s:sArray){
            stringBuilder.append(packagingSymbols).append(s).append(packagingSymbols).append(segmentationSymbol);
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        System.out.println(stringBuilder.toString());

    }
}
