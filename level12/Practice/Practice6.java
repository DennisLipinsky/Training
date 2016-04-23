package com.javarush.test.level12.Practice;

/**
 * –одитель класса CTO ƒобавь такой класс-родитель к классу CTO(технический директор),
 * чтобы класс перестал быть абстрактным. ƒобавл€ть/реализовывать методы в классе CTO запрещаетс€.
 */
public class Practice6 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
        cto.workHard();
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Director implements Businessman {

        public void workHard() {
            System.out.println("I work hard.");
        }
    }

    public static class CTO extends Director {

    }

}
