package com.javarush.test.level12.Practice;

/**
 * ������ ���� ����� � ����� Cat
 * ������ ���� ����� � ����� Cat ���, ����� ��������� ������ �� �������� �� �����.
 */
public class Practice1 {

    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("� - ��������");
        System.out.println(pet.getName());
    }

    public static class Pet {

        protected String name;

        public Pet() {
        }

        public final String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static class Cat extends Pet {

        public void setName(String name) {
            this.name = "";
        }
    }
}
