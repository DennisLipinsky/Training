package com.javarush.test.level13.lesson02;

/**
 * ���������������� ��������� � ������ StringObject �������� ��������� SimpleObject � ���������� ���� String.
 */
public class Solution05 {

    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public abstract class StringObject implements SimpleObject<String> {

        public SimpleObject<String> getInstance() {
            return null;
        }

    }


}

