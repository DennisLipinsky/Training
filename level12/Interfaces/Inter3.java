package com.javarush.test.level12.Interfaces;


/**
 * Классы Cat и Dog от Pet Унаследуй классы Cat и Dog от Pet. Реализуй недостающие методы.
 * Классы Cat и Dog не должны быть абстрактными.
 */
public class Inter3 {

    public static void main(String[] args) {
        Cat cat = new Cat("Vaska");
        Dog dog = new Dog ("Barbos");
        Cat cat1 = cat.getChild();
        Dog dog1 = dog.getChild();
        System.out.println(cat1.getClass().getSimpleName());
        System.out.println(dog1.getClass().getSimpleName());

    }

    public static abstract class Pet {
        public abstract String getName();
        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        private String name;

        public Cat(){}

        public Cat(String name) {
            this.name = name;
        }

        public  String getName() {
            return name;
        }

        public  Cat getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        private String name;

        public Dog() {}

        public Dog(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Dog getChild() {
            return new Dog();
        }
    }
}
