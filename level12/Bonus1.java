package com.javarush.test.level12;

/**
 * print(int) � print(String)
 * �������� ��� ������: print(int) � print(String).
 */
public class Bonus1 {


    public static void main(String[] args)
    {
        print(10);
        print("Ten");
    }

    public static void print(int a)
    {
        System.out.println(a);
    }
    public static void print (String s)
    {
        System.out.println(s);
    }

}
