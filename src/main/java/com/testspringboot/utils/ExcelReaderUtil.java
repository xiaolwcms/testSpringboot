package com.testspringboot.utils;

import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: testSpringboot
 * @ClassName ExcelReaderUtil
 * @description:
 * @author: 雷维昌
 * @create: 2023-07-27 15:34
 * @Version 1.0
 **/
public class ExcelReaderUtil {

    /**
     * @methodName: readExcel 读取excel工具类
     * @param: [is, tClass]  传入的实体类,成员变量类型只能是基本类型和字符串
     * @return: java.util.List<T>
     * @auther: hwj
     * @date: 2019/8/9 11:24
     * @Description: 读取excel文件,将其转换为javabean
     */
    public static <T> List<T> readExcel2Bean(InputStream is, Class<T> tClass)
            throws IOException, IllegalAccessException, InstantiationException {
        List<List<String>> list = ExcelReaderUtil.readExcel(is);
        //-----------------------遍历数据到实体集合开始-----------------------------------
        List<T> listBean = new ArrayList<T>();
        Field[] fields = tClass.getDeclaredFields();
        T uBean = null;
        for (int i = 1; i < list.size(); i++) {// i=1是因为第一行不要
            uBean = (T) tClass.newInstance();
            List<String> listStr = list.get(i);
            for (int j = 0; j < listStr.size(); j++) {
                if (j>=fields.length){
                    break;
                }
                Field field = fields[j];
                String datastring = listStr.get(j);
                field.setAccessible(true);
                if (datastring.length()>0&&datastring!=null) {
                    Class<?> type = field.getType();
                    // 只支持8中基本类型和String类型 如有其他类型 请自行添加
                    if (type==String.class){
                        field.set(uBean,datastring);
                    }else  if(type==Integer.class||type==int.class){
                        field.set(uBean,Integer.parseInt(datastring));
                    }else  if(type==Double.class||type==double.class){
                        field.set(uBean,Double.parseDouble(datastring));
                    } else  if(type==Float.class||type==float.class){
                        field.set(uBean,Float.parseFloat(datastring));
                    } else  if(type==Long.class||type==long.class){
                        field.set(uBean,Long.parseLong(datastring));
                    }else if (type==Boolean.class||type==boolean.class){
                        field.set(uBean,Boolean.parseBoolean(datastring));
                    }else if (type==Short.class||type==short.class){
                        field.set(uBean,Short.parseShort(datastring));
                    }else if (type==Byte.class||type==byte.class){
                        field.set(uBean,Byte.parseByte(datastring));
                    }else if (type==Character.class ||type==char.class){
                        field.set(uBean,datastring.charAt(0));
                    }
                }
            }
            listBean.add(uBean);
        }
        return listBean;
    }

    /**
     * Excel读取 操作,返回内容
     */
    private static List<List<String>> readExcel(InputStream is)
            throws IOException {
        Workbook wb = null;
        try {
            wb = WorkbookFactory.create(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }
        /** 得到第一个sheet */
        Sheet sheet = wb.getSheetAt(0);
        /** 得到Excel的行数 */
        int totalRows = sheet.getPhysicalNumberOfRows();
        /** 得到Excel的列数 */
        int totalCells = 0;
        if (totalRows >= 1 && sheet.getRow(0) != null) {
            totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
        }
        List<List<String>> dataLst = new ArrayList<List<String>>();
        /** 循环Excel的行 */
        for (int r = 0; r < totalRows; r++) {
            Row row = sheet.getRow(r);
            if (row == null)
                continue;
            List<String> rowLst = new ArrayList<String>();
            /** 循环Excel的列 */
            for (int c = 0; c < totalCells; c++) {
                Cell cell = row.getCell(c);
                String cellValue = "";
                if (null != cell) {
                    HSSFDataFormatter hSSFDataFormatter = new HSSFDataFormatter();
                    cellValue = hSSFDataFormatter.formatCellValue(cell);
                }
                rowLst.add(cellValue);
            }
            /** 保存第r行的第c列 */
            dataLst.add(rowLst);
        }
        return dataLst;
    }
}




