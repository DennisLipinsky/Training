package com.javarush.test.level04.lesson04.task07;

/* Количество дней в году
Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
"количество дней в году: x", где х - 366 для високосными года, х - 365 для обычного года.
Подсказка: В високосном году - 366 дней, тогда как в обычном  - 365.
Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 — високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 — невисокосные.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int x;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int y = Integer.parseInt(sYear);
        if (y%4 == 0) {
            if (y%100 == 0) {
                if (y%400 == 0)
                { x = 366; }
                else {x = 365; }  }
            else { x = 366; }  }
        else { x = 365; }
        System.out.println("количество дней в году: "+ x); ;












//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(reader.readLine());
//        int x = 0;
//        if (number%100 == 0) {
//            if (number%400 == 0) {
//                x = 366;
//            } else {
//               x = 365;
//            }
//        } else if (number%4 == 0) {
//            x = 366;
//        }
//        System.out.println("количество дней в году: " + x);
    }
}