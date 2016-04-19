package com.javarush.test.level12;

/**
 * ��� ������, ��� �������, ��� ������, ��� ������
 *  �������� �����, ������� ����������, ������ ������ ������ ��� ��������, � ������� �� ����� ���� �� ��������:
 *  ������, �������, ������, ������.
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
        //�������� ��� ���� �������
        if (o instanceof Cat) {
            System.out.println(o.getClass().getSimpleName() + " �����");
        } else if (o instanceof Bird) {
            System.out.println(o.getClass().getSimpleName() + " �����");
        } else if (o instanceof Dog) {
            System.out.println(o.getClass().getSimpleName() + " ������");
        } else if (o instanceof Lamp) {
            System.out.println(o.getClass().getSimpleName() + " �����");
        }
    }
    public static class Cat { }
    public static class Dog { }
    public static class Bird { }
    public static class Lamp { }

}
