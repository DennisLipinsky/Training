package com.javarush.test.level13.lesson11;

import java.io.*;

/**
 * ������ �����
 1. ������� � ������� ��� �����.
 2. ������� � �������(�� �����) ���������� �����.
 3. �� ������ ������� ���� � �����.
 */
public class Solution01 {

    final static String FILE =
            "E:\\Dennis\\JAVA\\_JAVA RUSH\\JavaRushHomeWork\\JavaRushHomeWork\\src\\com\\javarush\\test\\FileOut.txt";

    public static void main(String[] args) {
            //add your code here
            try {
                InputStream inStream = new FileInputStream(FILE);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

                while (inStream.available() > 0)
                {
                    int data = inStream.read();
                    writer.write(data);
                }
                inStream.close();
                writer.flush();
                writer.close();
            }
            catch (Exception e) {
                System.out.println("��� ������ �����");
            }

    }

}
