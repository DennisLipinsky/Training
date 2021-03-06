package com.javarush.test.level13.lesson02;

/**
 * ��� � initializeIdAndName
 * 1. ��������, ��� � ��������� �����������.
 * 2. ������� ���������� ������ initializeIdAndName � ����� User.
 * 3. initializeIdAndName � ������ User ������ ���������� ��� User.
 * 4. ��������� ���������, ����� ��������������� � ��������.
 */
public class Solution04 {

    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        public User initializeIdAndName(long id, String name) {
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
