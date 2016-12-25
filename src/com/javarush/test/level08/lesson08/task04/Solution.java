package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1981"));
        map.put("Petrov", new Date("January 2 1982"));
        map.put("Sidorov", new Date("January 3 1983"));
        map.put("Ivanov", new Date("July 4 1984"));
        map.put("Belov", new Date("August 5 1985"));
        map.put("Bocharov", new Date("January 3 1979"));
        map.put("Kykyev", new Date("January 6 1986"));
        map.put("Herov", new Date("January 7 1987"));
        map.put("Smith", new Date("January 8 1970"));
        map.put("Li", new Date("JUNE 9 1990"));

        //напишите тут ваш код
//        removeAllSummerPeople(map);
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 & pair.getValue().getMonth() < 8)
                iterator.remove();
        }

    }
}
