package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
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
        Map<String, String> map = new HashMap<>();
        map.put("Бочаров", "Игорь");
        map.put("Сидоров", "");
        map.put("Козлов", "");
        map.put("Иванов", "");
        map.put("Петров", "");
        map.put("Васечкин", "");
        map.put("Глухарев", "");
        map.put("Миронов", "");
        map.put("Курочкин", "");
        map.put("Попов", "");

        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> paid : map.entrySet())
        {
            if (paid.getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> paid : map.entrySet())
        {
            if (paid.getKey().equals(lastName))
                count++;
        }
        return count;
    }
}
