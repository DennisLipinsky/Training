package com.javarush.test.level12.Interfaces;

/**
 * Fly, Run, Swim ��� ������� Human, Duck, Penguin, Airplane
 * ���� public ���������� Fly(������), Run(������/������), Swim(�������).
 * ������ ��� ���������� ������� Human(�������), Duck(����), Penguin(�������), Airplane(�������).
 */
public class Inter5 {

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
    public class Human implements Run, Swim {
        public void run() {
            System.out.println("I can run.");
        }
        public void swim() {
            System.out.println("I can swim.");
        }
    }
    public class Penguin implements Run, Swim {

        public void run() {
            System.out.println("I can run.");
        }

        public void swim() {
            System.out.println("I can swim.");
        }


    }
    public class Duck implements Fly, Swim, Run {
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
