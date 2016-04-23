package com.javarush.test.level12.Practice;

/**
 * Нужно исправить программу, чтобы компилировалась и работала
 * Расставить правильно ключевые слова abstract,
 * чтобы программа компилировалась (там где надо и не надо).
 */
public class Practice8 {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
        //horse.fly(); //<-- Horse can not fly
    }

    public interface Fly {
        void fly();
    }

    public static class Horse {
        public static void run(){
            System.out.println("I'm running.");
        }
    }

    public static class Pegasus extends Horse implements Fly {
        public void fly(){
            System.out.println("I'm flying.");
        }
    }

    public abstract class SwimPegasus extends Pegasus {

        public abstract void swim();
    }
}
