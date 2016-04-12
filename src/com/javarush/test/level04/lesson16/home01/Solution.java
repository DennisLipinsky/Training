package com.javarush.test.level04.lesson16.home01;

/* Я никогда не буду работать за копейки
Используя цикл вывести на экран сто раз надпись:
«Я никогда не буду работать за копейки. Амиго»
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        for (int i = 2; i < 10; i = (i++) + i--, i++) {
            System.out.println(6^3);
        }

    }
}
