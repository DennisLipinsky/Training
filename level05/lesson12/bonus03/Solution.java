package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;

        //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            String s;
            for (int i = 0; i < n; i++) {
                s = reader.readLine();
                if (maximum < Integer.parseInt(s)) {
                    maximum = Integer.parseInt(s);
                }
            }
        }
        System.out.println(maximum);
    }
}
