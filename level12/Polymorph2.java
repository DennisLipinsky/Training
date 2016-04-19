package com.javarush.test.level12;

/**
 * ��� �������, ��� ����, ��� �������, ��� ������������ �������� �������� �����, ������� ����������,
 * ������ ������ ������ ��� ��������, � ���������� ��������� � ���� �������� ��: �������, ����, �������,
 * ������������ ��������.
 */
public class Polymorph2 {
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }
    public static String getObjectType(Object o)
    {
        String s = "";
        if (o instanceof Cow) {
            s = "������";
        } else if (o instanceof Whale) {
            s = "���";
        } else if (o instanceof Dog) {
            s = "������";
        } else if (o instanceof Pig) {
            s = "����������� ��������";
        }
        return s;
    }
    public static class Cow
    {
    }
    public static class Dog
    {
    }
    public static class Whale
    {
    }
    public static class Pig
    {
    }
}
