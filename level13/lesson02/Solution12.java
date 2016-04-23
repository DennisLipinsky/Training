package com.javarush.test.level13.lesson02;

import java.io.*;
import java.util.ArrayList;

/**
 * ������ � ����
 1. �������� � ������� ��� �����.
 2. ��������� ������ � �������, ���� ������������ �� ������ ������ "exit".
 3. ������� ��� ������ � ����, ������ ������� � ����� �������.
 */
public class Solution12 {

    final static String FILE =
            "E:\\Dennis\\JAVA\\_JAVA RUSH\\JavaRushHomeWork\\JavaRushHomeWork\\src\\com\\javarush\\test\\FileOut.txt";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strArray = new ArrayList<String>();

        String buffer = reader.readLine();
        while(!buffer.equals("exit")) {
            strArray.add(buffer);
            buffer=reader.readLine();
        }

        PrintWriter printWriter = new PrintWriter(FILE);
        while (!strArray.isEmpty()) {
            String s = strArray.get(0);
            printWriter.write(s);
            printWriter.println();
            strArray.remove(0);
        }
        printWriter.flush();
        printWriter.close();
    }
}
