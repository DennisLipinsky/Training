package com.javarush.test.level13.lesson11;

import java.awt.*;

/**
 *  ���� ����� � ������
 *  1. ������������ Fox �� ���������� Animal.
 *  2. ������� ��� ���, ����� � ������ Fox ��� ������ ���� ����� - getName.
 *  3. ������ ������� ������!
 */
public class Solution05 {


    public static void main(String[] args) throws Exception { }

    public interface Animal {
        Color getColor();
        Integer getAge();
    }


    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
