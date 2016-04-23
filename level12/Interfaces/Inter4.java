package com.javarush.test.level12.Interfaces;

/**
 * Fly, Run, Swim ��� ������� Dog, Fish, Bird, Airplane ���� public ���������� Fly(������), Run(������/������),
 * Swim(�������). ������ ��� ���������� ������� Dog(������), Fish(����), Bird(�����), Airplane(�������).
 */
public class Inter4 {
    public static void main(String[] args) {

    }
    public interface Fly {
        public void fly();
    }
    public interface Run {
        public void run();
    }
    public interface Swim {
        public void swim();
    }
    public class Dog implements Run,Swim {
        public void run() {
            System.out.println("I can run.");
        }
        public void swim() {
            System.out.println("I can swim.");
        }
    }
    public class Fish implements Swim {
        public void swim() {
            System.out.println("I can swim.");
        }
    }
    public class Bird implements Fly,Swim,Run {
        public void fly() {
            System.out.println("I can fly.");
        }
        public void swim() {
            System.out.println("I can swim.");
        }
        public void run() {
            System.out.println("I can run.");
        }
    }
    public class Airplane implements Fly, Run {
        public void fly() {
            System.out.println("I can fly.");
        }
        public void run() {
            System.out.println("I can run.");
        }
    }
}
