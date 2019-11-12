package com.kevin.designpattern.other.decorator;

import java.io.*;
import java.util.zip.ZipInputStream;

/**
 *  InputStream 装饰器模式
 * @author kevin
 * @date 2019/11/12 16:49
 * @since 1.0.0
 */
public class ImputDecoratorTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InputStream inputStream = new FileInputStream(new File(""));
        // FileInputStream特有的功能
        FileInputStream fileInputStream = (FileInputStream) inputStream;
        fileInputStream.getChannel();
        fileInputStream.getFD();
        // ZipInputStream特有的功能
        inputStream = new ZipInputStream(inputStream);
        ZipInputStream zipInputStream = (ZipInputStream) inputStream;
        zipInputStream.getNextEntry();
        // ObjectInputStream用于反序列化的能力
        inputStream = new ObjectInputStream(zipInputStream);
        ObjectInputStream objectInputStream = (ObjectInputStream) inputStream;
        objectInputStream.readObject();
    }
}
