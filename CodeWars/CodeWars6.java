package com.javarush.test.CodeWars;

/**
 * You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character.
 * If the word's length is even, return the middle 2 characters.
 */
public class CodeWars6 {

    public static void main(String[] args) {
        System.out.println(Kata.getMiddle("attribute"));
    }

    public static class Kata {
        public static String getMiddle(String word) {
            //Code goes here!
            String s = "";
            if (word.length()%2 != 0) {
                s = word.substring(word.length() / 2, word.length() / 2 + 1);
            } else  s = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
            return s;
        }
    }
}
