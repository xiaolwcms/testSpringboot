package com.testspringboot.utils;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 定时任务工具类
 */
public class QuartzUtil {
    public static String getCron(Date date){
        String dateFormat="0 0 0 dd MM * ?";
        return formatDateByPatten(date,dateFormat);
    }
    public static String formatDateByPatten(Date date,String dateFormat){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormat);
        String formatTimeStr=null;
        if(date!=null){
            formatTimeStr=simpleDateFormat.format(date);
        }
        return formatTimeStr;
    }

//    /**
//     * 每月循环一次
//     * @param timeStr 时间字符串
//     */
//    public static String everyMonth(String timeStr){
//        LocalTime time=LocalTime.parse(timeStr,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        return time.format(DateTimeFormatter.ofPattern("ss mm HH dd * ?"));
//    }
}

