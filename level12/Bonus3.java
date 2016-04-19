package com.javarush.test.level12;

/**
 * ��� ������ ���������� ����������� �� ���� ���������� � ���� �����
 * �������� public static ������: int min(int, int), long min(long, long), double min(double, double).
 * ������ ����� ������ ���������� ����������� �� ���� ���������� � ���� �����.
 */
public class Bonus3 {

    public static void main(String[] args)
    {
        System.out.println(min(0, 1));
        System.out.println(min(1L, 2L));
        System.out.println(min(1d, 2d));
    }
    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
    public static long min(long a, long b)
    {
        return a < b ? a : b;
    }
    public static double min(double a, double b)
    {
        return a < b ? a : b;
    }
}

