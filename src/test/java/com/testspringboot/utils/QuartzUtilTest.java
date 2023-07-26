package com.testspringboot.utils;


import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class QuartzUtilTest {
    @Test
    public void getCron(){
        System.out.println(QuartzUtil.getCron(new Date()));
    }


    /**
     * 每月循环一次
     */
    @Test
    public void everyMonth(){
//        String timeStr="2023-03-03";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
//        System.out.println(QuartzUtil.everyMonth(simpleDateFormat.format(new Date())));
    }
}
