package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int s = 10;
        while (s > 0) {
            int t = 10;
            while (t>0) {
                System.out.print("S");
                t--;
            }
            System.out.println();
            s--;
        }

    }
}
