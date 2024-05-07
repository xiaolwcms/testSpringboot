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
        String str="";
        String symbol="\n";
        String packagingSymbols="'";
        String segmentationSymbol=",";
        StrUtils.formatPrint(str,symbol,packagingSymbols,segmentationSymbol);
    }
}
