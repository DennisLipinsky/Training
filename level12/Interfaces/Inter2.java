package com.javarush.test.level12.Interfaces;

/**
 * ����� Cow �� Animal
 * ��������� ����� Cow �� Animal.
 * �������� ��� ����������� ������ � ������ Cow.
 */
public class Inter2 {

    public static void main(String[] args) {
        Cow cow = new Cow("Milka");
        System.out.println(cow.getClass().getSimpleName() + " " + cow.getName());
    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends  Animal {
        private String name;

        public Cow(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
