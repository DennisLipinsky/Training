package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Jack", new Date("JANUARY 2 1985"));
        map.put("Joe", new Date("FEBRUARY 3 1986"));
        map.put("Joseph", new Date("MARCH 4 1983"));
        map.put("Joshua", new Date("APRIL 4 1983"));
        map.put("Sam", new Date("MAY 4 1983"));
        map.put("Jo",  new Date("JUNE 4 1983"));
        map.put("Frank",  new Date("JULY 4 1983"));
        map.put("Jonny",  new Date("AUGUST 4 1983"));
        map.put("Jonatan",  new Date("SEPTEMBER 4 1983"));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        for (Map.Entry<String, Date> pair : map.entrySet()){
            if (pair.getValue().getMonth() >=5 && pair.getValue().getMonth() <= 7) {
                map.remove(pair.getKey());
            }
        }


    }
}
