package com.javarush.test.level13.lesson02;

/**
 * ����: �����������
 * ������ � ������ Beer ��������� Drink � �������� ��� ��������������� ������.
 */
public class Solution02 {

    public static void main(String[] args) throws Exception {
        Drink beer = new Beer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink
    {
        @Override
        public String toString()
        {
            if (isAlcoholic()) {
                return "It's alcoholic.";
            }
            else {
                return "It's non-alcoholic.";
            }
        }

        @Override
        public boolean isAlcoholic()
        {
            return false;
        }
    }

}
