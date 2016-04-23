package com.javarush.test.level12.Practice;

/**
 * ��� ���? ����, �����, ����, ����, �������, ���������
 * ������ �����, ������� ����������, ����� ������ �������� � ����.
 * ��������� ������ �������� �� ����� ���� �� ��������:
 * ����, �����, ����, ����, �������, ���������.
 * ���������: ���������� ���������� ��� ��������� ��� ����� ����� �����.
 */
public class Practice2 {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {

        String s = "";
        if(o instanceof Tiger)
            s = "Tiger";
        else if(o instanceof Lion)
            s = "Lion";
        else if(o instanceof Cat)
            s = "Cat";
        else if(o instanceof Bull)
            s = "Bull";
        else if(o instanceof Cow)
            s = "Cow";
        else s = "Animal";

        return s;
    }

    public static class Cat  extends Animal   //<--������ �����������!!
    {
    }
    public static class Tiger  extends Cat
    {
    }
    public static class Lion  extends Cat
    {
    }
    public static class Bull  extends Animal
    {
    }
    public static class Cow  extends Animal
    {
    }
    public static class Animal
    {
    }

}
