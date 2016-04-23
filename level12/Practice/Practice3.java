package com.javarush.test.level12.Practice;

/**
 * Created on 23.04.2016.
 */
public class Practice3 {

    public class Cat implements Run, Climb {
        public void run() {
            System.out.println("I can run.");
        }
        public void climb() {
            System.out.println("I can climb.");
        }
    }

    public class Dog implements Run {
        public void run() {
            System.out.println("I can run.");
        }
    }

    public class Tiger extends Cat {
        public void run() {
            super.run();
        }
        public void climb() {
            super.climb();
        }
    }

    public class Duck implements Run, Fly {
        public void run() {
            System.out.println("I can run.");
        }
        public void fly() {
            System.out.println("I can fly.");
        }
    }

    public interface Fly {
        void fly();
    }

    public interface Climb {
        void climb();
    }

    public interface Run {
        void run();
    }
}
