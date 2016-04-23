package com.javarush.test.level12.Practice;

/**
 * Интерфейсы к классу Human
 * Добавь как можно больше интерфейсов к классу Human, но чтобы он не стал абстрактным классом.
 */
public class Practice5 {

    public static void main(String[] args) {
        Human human = new Human();
        human.workHard();
        human.workLazy();
    }

    public static interface Worker {
        public void workLazy();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static interface Secretary {
        public void workLazy();
    }
    public  static interface Miner {
        public  void workVeryHard();
    }

    public static class Human implements  Businessman,Secretary {
        @Override
        public void workHard() {
            System.out.println("I work hard.");
        }

        @Override
        public void workLazy() {
            System.out.println("I don't wanna work.");
        }
    }
}
