package com.javarush.test.level12;

/**
 * print(int) � print(Integer)
 * �������� ��� ������: print(int) � print(Integer).
 * �������� ����� ��� � ������ main, ����� ��������� ��� ���.
 */
public class Bonus2 {

    public static void main(String[] args)
    {
        Bonus2 s = new Bonus2();
        s.print(1);
        Integer i = new Integer(10);
        s.print(i);
    }
    void print(int a)
    {
        System.out.println(a);
    }
    void print(Integer a)
    {
        System.out.println(a);
    }
}
