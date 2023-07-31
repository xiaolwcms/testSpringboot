package com.testspringboot.utils;
import com.testspringboot.entity.ExeclEntity;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @program: testSpringboot
 * @ClassName ExcelReadrUtilTest
 * @description:
 * @author: 1111
 * @create: 2023-07-27 15:37
 * @Version 1.0
 **/
public class ExcelReadrUtilTest {

    @Test
    public void test()  {
        File file = new File("E:\\FUNO_leiweichang\\oneGrad.xlsx");
        List<ExeclEntity> excelUserEntities = null;
        try {
            excelUserEntities = ExcelReaderUtil.readExcel2Bean(new FileInputStream(file), ExeclEntity.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        for (ExeclEntity excelUserEntity : excelUserEntities) {
            System.out.println("update Priority set name ='"+excelUserEntity.getRowTwo()+"' where name='"+excelUserEntity.getRowOne()+"';");
        }

    }
}

