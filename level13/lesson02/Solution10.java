package com.javarush.test.level13.lesson02;

import java.awt.*;

/**
 * Интерфейс Animal
 * Унаследовать Fox от интерфейса Animal.
 *
 */
public class Solution10 {

    public static void main(String[] args) throws Exception {
        Fox fox = new Fox();
        System.out.println(fox.getName());
        System.out.println(fox.getColor());
    }

    interface Animal {
        Color getColor();
    }


    public static class Fox implements Animal  {

        public String getName() {
            return "Fox";
        }

        @Override
        public Color getColor() {
            return Color.red;
        }
    }
}
