package com.javarush.test.level13.lesson02;

/**
 * 4 ������. ������� 4 ������ � ���������, ����� ��� ���������������.
 */
public class Solution03 {

    public static void main(String[] args) throws Exception {
        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().toString());
    }

    interface Desire {
    }

    interface Dream  {
        static Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie  implements Dream, Desire {
        static int INDEX = 1;
        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
