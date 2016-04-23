package com.javarush.test.level12.Interfaces;

/**
 * ����� Human � ���������� Run, Swim. ������ public ����� Human(�������) � public ���������� Run(������/������),
 * Swim(�������). ������ � ������ ��������� �� ������ ������. ������ ��� ���������� ������ Human,
 * �� �� �������� ������. Declare class Human as abstract.
 */
public class Inter6 {

    public static void main(String[] args) {

    }

    public interface Run {
        public void run();
    }
    public interface Swim {
        public void swim();
    }

    public abstract class Human implements Run, Swim {
        public abstract void run();
        public abstract void swim();
    }

}
