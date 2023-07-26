package com.testspringboot.utils;

import org.junit.Test;

/**
 * @program: testSpringboot
 * @ClassName StrUtilsTest
 * @description:
 * @author: 雷维昌
 * @create: 2023-07-24 14:48
 * @Version 1.0
 **/
public class StrUtilsTest {
    @Test
    public void formatPrint (){
        String str="ZFZ21135\n" +
                "1FZ30979\n" +
                "1FA21053\n" +
                "1FZ21025\n" +
                "1F030949\n" +
                "1FZ21181\n" +
                "1FZ21141\n" +
                "1FZ31267\n" +
                "ZFZ31291\n" +
                "1FZ31301\n" +
                "1FZ31347\n" +
                "9FZ31361\n" +
                "1FZ31142\n" +
                "1F060001\n" +
                "1FZ60013\n" +
                "1FZ61153\n" +
                "ZFZ61152\n" +
                "1FZ61283\n" +
                "1FZ61284\n" +
                "1FZ51261\n" +
                "1FZ31002\n" +
                "1FZ31086\n" +
                "1FZ51349\n" +
                "1FZ51327\n" +
                "1FZ51168\n" +
                "1FZ51122\n" +
                "1FZ51123\n" +
                "1FZ51187\n" +
                "1F030833\n" +
                "1FZ51144\n" +
                "1FZ51130\n" +
                "1Y030005\n" +
                "1YB51201\n" +
                "9FB51044\n" +
                "9FB30202\n" +
                "1FZ51145\n" +
                "1FZ51090\n" +
                "ZFZ51258\n" +
                "1FZ51233\n" +
                "ZFZ51254\n" +
                "1FZ51279\n" +
                "1FZ51363\n" +
                "ZFZ51326\n" +
                "1FZ51350\n" +
                "1FZ51295\n" +
                "1FZ51362\n" +
                "1F060007\n" +
                "ZFZ21332\n" +
                "1FZ51374\n" +
                "ZFZ51367\n" +
                "1FZ31384\n" +
                "1F030972\n" +
                "9FJ31287\n" +
                "1FZ51091\n" +
                "1FZ51234\n" +
                "1FZ51351\n" +
                "1FZ61253\n" +
                "ZFZ61393\n" +
                "ZFZ81343\n" +
                "1FZ61281\n";
        String symbol="\n";
        StrUtils.formatPrint(str,symbol);
    }
}
