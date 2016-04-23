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
            int data = inStream.read(); //������ ���� ���� �� ������ ��� ������
            outStream.write(data); //���������� ����������� ���� � ������ �����.
        }

        inStream.close(); //��������� ������
        outStream.close();
    }
}
