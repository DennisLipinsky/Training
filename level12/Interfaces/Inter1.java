package com.javarush.test.level12.Interfaces;

/**
 * Исправь код. Вторая задача
 * Исправь код, чтобы программа компилировалась.
 */
public class Inter1 {

    public static void main( String[] args )
    {

    }
    public static abstract class Pet
    {
        public String getName()
        {
            return "Я - котенок";
        }
        public abstract Pet getChild();
    }

}
