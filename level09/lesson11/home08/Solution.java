package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0
соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {1, 2};
        int[] arr3 = new int[] {1, 2, 3, 4};
        int[] arr4 = new int[] {1, 2, 2, 4, 5, 6, 7};
        int[] arr5 = new int[0];
        ArrayList<int[]> arList = new ArrayList<>();
        arList.add(arr1);
        arList.add(arr2);
        arList.add(arr3);
        arList.add(arr4);
        arList.add(arr5);
        return arList;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
