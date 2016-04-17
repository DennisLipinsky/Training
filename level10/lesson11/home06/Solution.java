package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private int age;
        private boolean sex;
        private String address;
        private String occupation;


        public Human() {}

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = name;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = name;
            this.age = age;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String lastName, int age, boolean sex) {
            this.name = name;
            this.lastName = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String lastName, int age, boolean sex, String address) {
            this.name = name;
            this.lastName = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, String lastName, int age, boolean sex, String address, String occupation) {
            this.name = name;
            this.lastName = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.occupation = occupation;
        }

        public Human(String name, int age, boolean sex, String address, String occupation) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
            this.occupation = occupation;
        }

        public Human(String name, int age, boolean sex, String address) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.address = address;
        }
    }
}
