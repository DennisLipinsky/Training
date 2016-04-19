package com.javarush.test.level11;

/**
 * ������������ ��� ������� Cat � Dog. ������ ��� ���������� ���������� ������ Cat � Dog.
 *
 */
public class Incapsulation2 {

    public static void main(String[] args) {
        Cat cat = new Cat("Vaska",5);
        Dog dog = new Dog("Sharik", 4);
        System.out.println(cat.isDogNear(dog));
        System.out.println(dog.isCatNear(cat));
    }

    public static class Cat {

        private String name;
        private int speed;

        public Cat(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        private boolean isDogNear(Dog dog) {
            return this.speed > dog.getSpeed();
        }
    }

    public static  class Dog {

        private String name;
        private int speed;

        public Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        private boolean isCatNear(Cat cat) {
            return this.speed > cat.getSpeed();
        }
    }
}
