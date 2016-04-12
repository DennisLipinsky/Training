package com.javarush.test.level04.lesson04.task09;

/**
 * Created by Δενθρ on 07.02.2016.
 */
public class A
{
    void met () {
        System.out.println("Class A");
    }
}

class B extends A {
    void met () {
        System.out.println("Class B");
    }

}

class AB {
    public static void main(String[] args)
    {
        A a = new B ();
        a.met();
    }
}