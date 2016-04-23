package com.javarush.test.level12.Practice;

/**
 * Fly, Run, Swim ��� ������� Duck, Penguin, Toad
 * ���� ���������� Fly(������), Swim(�������), Run(������).
 * ������ ��� ���������� ������� Duck(����), Penguin(�������), Toad(����)
 */
public class Practice4 {

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

    public class Duck implements Fly, Run, Swim {
        public void run(){
        }
        public void swim(){
        }
        public void fly(){
        }
    }

    public class Penguin implements Swim, Run {
        public void swim(){
        }
        public void run(){
        }
    }

    public class Toad implements Swim {
        public void swim(){}
    }

}
