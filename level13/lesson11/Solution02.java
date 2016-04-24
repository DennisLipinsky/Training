package com.javarush.test.level13.lesson11;

/**
 * Neo 1. ����������� ��������� DBObject � ������ User.
 * 2. ����������� ����� initializeIdAndName ���, ����� ��������� �������� � ��������
 * �� ����� "User has name Neo, id = 1".
 * 3. ����� toString � ����� main ������ ������.
 * 4. �������, ��� ������ ���������� ����� initializeIdAndName � ������ User. /
 */
public class Solution02 {

    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public User() {
        }

        public DBObject initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }
    }

}