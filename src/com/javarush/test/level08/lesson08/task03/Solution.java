package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Black", "Jack");
        map.put("Smiths", "Joe");
        map.put("Smeeth","Joseph");
        map.put( "Walsh", "Joshua");
        map.put("Smithers", "Sam");
        map.put("Doe", "John");
        map.put("Samson", "Frank");
        map.put("Willson", "Jonny");
        map.put("Parker", "John");
        return map;


    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int count = 0;
        Iterator <Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {

            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (name.equals(value)) {
                count++;
            }
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {

        int count = 0;
        Iterator <Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (lastName.equals(key)) {
                count++;
            }
        }
        return count;

    }
}
