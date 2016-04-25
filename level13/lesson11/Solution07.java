package com.javarush.test.level13.lesson11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Сортировка четных чисел из файла
 1. Ввести имя файла с консоли.
 2. Прочитать из него набор чисел.
 3. Вывести на консоль только четные, отсортированные по возрастанию.
 Пример ввода:
 5
 8
 11
 3
 2
 10
 Пример вывода:
 2
 8
 10
 */
public class Solution07 {

    final static String FILE =
            "E:\\Dennis\\JAVA\\_JAVA RUSH\\JavaRushHomeWork\\JavaRushHomeWork\\src\\com\\javarush\\test\\FileIn.txt";

    public static void main(String[] args) throws IOException
    {
        InputStream inReader = new FileInputStream(FILE);
        ArrayList<Integer> list = new ArrayList<>();

        String s = "";
        while (inReader.available() > 0) {
            char c = (char) inReader.read();
            if (c!='\n' && c!='\r' && c!=' ') {
                s += c;
            } else {
                if (s.length() > 0) {
                    list.add(Integer.parseInt(s));
                }
                s = "";
            }
        }

        printList(list);
        list = deleteOddNumbers(list);
        printList(list);
        Collections.sort(list);
        printList(list);
        inReader.close();
    }

    public static void printList (ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> deleteOddNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if(x%2 == 0) {
                evenList.add(list.get(i));
            }
        }
        evenList.trimToSize();
        return evenList;
    }

}
