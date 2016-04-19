package com.javarush.test.level12;

/**
 * print(int) и print(Integer)
 * Написать два метода: print(int) и print(Integer).
 * Написать такой код в методе main, чтобы вызвались они оба.
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
