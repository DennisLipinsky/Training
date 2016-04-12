package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int max = 0;
        int min = 0;

        if (( a > b ) && (a > c)){
            max = a;
        } else if (( b > a ) && (b > c)){
            max = b;
        } else if (( c > a ) && (c > b)){
            max = c;
        }

        if (( a < b ) && (a < c)){
            min = a;
        } else if (( b < a ) && (b < c)){
            min = b;
        } else if (( c < a ) && (c < b)){
            min = c;
        }

        if ((a!=min) && (a!=max)) {
            System.out.println(a);

        } else if ((b!=min)&&(b!=max)){
            System.out.println(b);

        } else if ((c!=min)&&(c!=max)){
            System.out.println(c);

        }

    }
}
