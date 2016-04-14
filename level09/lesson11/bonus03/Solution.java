package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        //напишите тут ваш код

        ArrayList<Integer> digArray = new ArrayList<>();
        ArrayList<String> letArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                digArray.add(Integer.parseInt(array[i]));
            } else {
                letArray.add(array[i]);
            }
        }

        //digits descending sort
        for (int i = 0; i < digArray.size(); i++) {
            for (int j = i; j < digArray.size(); j++) {
                int x = digArray.get(i);
                if (digArray.get(i) < digArray.get(j)) {
                    digArray.add(i, digArray.get(j));
                    digArray.remove(i + 1);
                    digArray.add(j, x);
                    digArray.remove(j+1);
                }
            }
        }
        //printList(digArray);

        //strings sort
        for (int i = 0; i < letArray.size(); i++) {
            for (int j = i; j < letArray.size(); j++) {
                String x = letArray.get(i);
                if (isGreaterThan(letArray.get(i), letArray.get(j))) {
                    letArray.add(i, letArray.get(j));
                    letArray.remove(i+1);
                    letArray.add(j, x);
                    letArray.remove(j+1);
                }
            }
        }
        //printList(letArray);

        //replacing Strings and digits in sorted order
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = String.valueOf(digArray.get(0));
                digArray.remove(0);
            } else {
                array[i] = letArray.get(0);
                letArray.remove(0);
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }

//    public static void printList(ArrayList list) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//    }
}
