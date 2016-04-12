package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));


        //напишите тут ваш код
        int[] m = new int[5];
        for (int i = 0; i <5; i++) {
            m[i] = Integer.parseInt(reader.readLine());
        }
        int x;
        for (int i = 0; i<5; i++) {
            for (int j = i; j< 5; j++){
                if (m[i]>m[j]) {
                    x = m[j];
                    m[j]= m[i];
                    m[i]=x;
                }
            }
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(m[i]);
        }

    }
}