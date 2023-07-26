package com.testspringboot.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * 有关时间操作工具类
 */
public class TImeUtil {
    public static boolean compareMonthEqual(String formatStr) {
        String firstDateStr ="2023-05-01";
        String secondStr = "2023-04-30";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr);
        boolean result = true;
        try {
            result = simpleDateFormat.parse(firstDateStr).after(simpleDateFormat.parse(secondStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean judgeMonth(int month, String endDay, String formatStr) {
        //String endDay = DateUtils.parseDateToStr(formatStr, endDayDate);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, (~(month - 1)));
        String startDay = simpleDateFormat.format(calendar.getTime());
        boolean result = true;
        try {
            result = !simpleDateFormat.parse(startDay).after(simpleDateFormat.parse(endDay));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    //    Java8计算两个日期之间相差的月份
    private static long month(Date firstMonth, Date secondMonth, String formatStr){
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(formatStr);
        String firstMonthStr=simpleDateFormat.format(firstMonth);
        String secondMonthStr=simpleDateFormat.format(secondMonth);
        return ChronoUnit.MONTHS.between(LocalDate.parse(firstMonthStr),LocalDate.parse(secondMonthStr));
    }
    private static void compareToMonth(){
        Date date1=new Date();
        Date date2=new Date();

        System.out.println(date1.compareTo(date2));
    }

}
