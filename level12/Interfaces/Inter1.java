package com.javarush.test.level12.Interfaces;

/**
 * ������� ���. ������ ������
 * ������� ���, ����� ��������� ���������������.
 */
public class Inter1 {

    public static void main( String[] args )
    {

    }
    public static abstract class Pet
    {
        public String getName()
        {
            return "� - �������";
        }
        public abstract Pet getChild();
    }

}
