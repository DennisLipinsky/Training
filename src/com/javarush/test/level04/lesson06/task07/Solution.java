package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int na = 1;
        int b = Integer.parseInt(reader.readLine());
        int nb = 2;
        int c = Integer.parseInt(reader.readLine());
        int nc = 3;

        if ((a == b) && (a!=c) &&(b!=c)) {
            System.out.println(nc);
        } else if ((a == c) && (a!=b) &&(c!=b)) {
            System.out.println(nb);
        } else if ((b == c) && (b!=a) &&(c!=a)) {
            System.out.println(na);
        }

    }
}
