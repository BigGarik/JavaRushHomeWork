package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<>();
        map.put("Бочаров", "Игорь");
        map.put("Сидоров", "Ваня");
        map.put("Козлов", "Сережа");
        map.put("Иванов", "Игорь");
        map.put("Петров", "Игорь");
        map.put("Васечкин", "ыее");
        map.put("Глухарев", "Игорь");
        map.put("Миронов", "врао");
        map.put("Курочкин", "вреленук");
        map.put("Попов", "ыке");
        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Set<String> names = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (names.contains(pair.getValue()))
                duplicate.add(pair.getValue());
            else
                names.add(pair.getValue());
        }
        for (String name : duplicate)
        {
            removeItemFromMapByValue(map, name);
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
