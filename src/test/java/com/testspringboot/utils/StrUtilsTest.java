package com.testspringboot.utils;

import org.junit.Test;

/**
 * @program: testSpringboot
 * @ClassName StrUtilsTest
 * @description:
 * @author: aaa
 * @create: 2023-07-24 14:48
 * @Version 1.0
 **/
public class StrUtilsTest {
    @Test
    public void formatPrint (){
        String str="1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n";
        String symbol="\n";
        String packagingSymbols="'";
        String segmentationSymbol=",";
        StrUtils.formatPrint(str,symbol,packagingSymbols,segmentationSymbol);
    }
}
