package com.javarush.test.level13.lesson11;

/**
 * ��������� SimpleObject
 1. ������ ����� StringObject.
 2. � ������ StringObject �������� ��������� SimpleObject � ���������� ���� String.
 3. ��������� ������ ���������������.
 */
public class Solution04 {

    public static void main(String[] args) throws Exception    {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }
    interface SimpleObject<T>{
        SimpleObject<T> getInstance();
    }
    public static class StringObject<Object> implements SimpleObject<String> {
        public SimpleObject<String> getInstance(){
            return (SimpleObject<String>) this;
        }
    }
}
