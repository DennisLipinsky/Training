package com.javarush.test.level12;

/**
 * Или «Кошка», или «Собака», или «Птица», или «Лампа»
 *  Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей:
 *  «Кошка», «Собака», «Птица», «Лампа».
 *  level12.lesson02.task04;
 */

public class Polymorph1 {

    public static void main(String[] args)
    {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }
    public static void printObjectType(Object o)
    {
        //Напишите тут ваше решение
        if (o instanceof Cat) {
            System.out.println(o.getClass().getSimpleName() + " Кошка");
        } else if (o instanceof Bird) {
            System.out.println(o.getClass().getSimpleName() + " Птица");
        } else if (o instanceof Dog) {
            System.out.println(o.getClass().getSimpleName() + " Собака");
        } else if (o instanceof Lamp) {
            System.out.println(o.getClass().getSimpleName() + " Лампа");
        }
    }
    public static class Cat { }
    public static class Dog { }
    public static class Bird { }
    public static class Lamp { }

}
