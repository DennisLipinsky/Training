package com.javarush.test.level13.lesson02;

import java.awt.*;

/**
 * ����� BigFox
 * 1. ������� ����� BigFox ���, ����� ��������� ���������������.
 * 2. ����� main ������ ������.
 */
public class Solution11 {


    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    //add your code below
    public static class BigFox extends Fox {
        @Override
        public Color getColor() {
            return Color.red;
        }
    }

}
