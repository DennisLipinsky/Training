package com.javarush.test.level13.lesson11;

/**
 *  ����������� ������
 *  1. ��������� ������������ � ������� � ����������� ���, ����� ��������� ���������������
 *  � ���������� ������ �� �� �����.
 *  2. ����� Hobbie ������ ������������� �� ����������� Desire, Dream.
 */
public class Solution03 {

    public static void main(String[] args) throws Exception {
        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        static Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Desire, Dream {
        static int INDEX = 1;
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
