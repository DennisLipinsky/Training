package com.javarush.test.level13.lesson02;

/**
 * ��� ��� ��� 1. ������ ��������� Person.
 * 2. ������ � ���� ����� isAlive(), ������� ���������, ��� ������� ��� ���.
 * 3. �������, ����� ��� ������ ���������� ���� �����.
 * 4. ������ ��������� Presidentable.
 * 5. ��������� ��������� Presidentable �� ���������� Person.
 */
public class Solution06 {



    public static void main(String[] args) throws Exception {}

    interface Person
    {
        boolean isAlive();
    }

    interface Presidentable extends Person
    {

    }

}
