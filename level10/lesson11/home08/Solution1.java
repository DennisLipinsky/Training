package com.javarush.test.level10.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution1

{

    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input array length.");
        int arLength = 0 ;
        try {
            arLength = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        ArrayList<String>[] array = new ArrayList[arLength];

        for (int i = 0; i < arLength; i++) {
            int listLength = 0;
            array[i] = new ArrayList<>();
            try {
                System.out.println("Please input list length.");
                listLength = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            for (int j = 0; j < listLength; j++) {
                String s = "";
                try {
                    System.out.println("Please input some text.");
                    s = reader.readLine();
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                array[i].add(s);
            }
        }
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }

}
