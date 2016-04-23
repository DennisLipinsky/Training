package com.javarush.test.level13.lesson02;

/**
 *
 * �������, ����� �� ���� ����������� ����� ����������� � ������ Beer.
 * ������ � ������ Beer ���� ��������� � ���������� ��� ��������������� ������.
 * �������, ��� ������� ���������� READY_TO_GO_HOME � ����� isReadyToGoHome.
 * ����� �������� ���������� READY_TO_GO_HOME � ������ isReadyToGoHome
 *
 */
public class Solution01 {

    public static void main(String[] args) throws Exception  {
    }

    public interface Drink {
        void askMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol {
        public void askMore(String message) {
            System.out.println("I want more.");
        }
        public void sayThankYou() {
            System.out.println("thank you!");
        }
        public void sleepOnTheFloor() {
            System.out.println("I am fine!");
        }
        public boolean isReadyToGoHome() {
            return this.READY_TO_GO_HOME;
        }
    }

}
