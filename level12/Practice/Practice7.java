package com.javarush.test.level12.Practice;

/**
 * �����, ������� ������� �� ����� ����� 10
 * ������ ��� ���� �����, ����� ��������� �������� �� ����� ����� 10. ���������: ��������� ���������� �������.
 */
public class Practice7 {



    public static void main(String[] args) {

        Integer i = 5;
        int x = transformValue(i);
        System.out.println(x);
    }

    public static int transformValue(Integer i) {
            return i*2;
    }

    public static int transformValue(int i) {
            return i*i;
    }
}
