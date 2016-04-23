package com.javarush.test.work_test;

import java.io.*;

/**
 * FileInputStream / FileOutputStream Example
 */
public class IOExample {


    public static void main(String[] args) throws IOException
    {
        InputStream inStream = new FileInputStream
                ("E:\\Dennis\\JAVA\\_JAVA RUSH\\JavaRushHomeWork\\JavaRushHomeWork\\src\\com\\javarush\\test\\FileIn.txt");
        OutputStream outStream = new FileOutputStream
                ("E:\\Dennis\\JAVA\\_JAVA RUSH\\JavaRushHomeWork\\JavaRushHomeWork\\src\\com\\javarush\\test\\FileOut.txt");

        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            outStream.write(data); //записываем прочитанный байт в другой поток.
        }

        inStream.close(); //закрываем потоки
        outStream.close();
    }
}
