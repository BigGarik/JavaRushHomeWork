package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> mapCat = new HashMap<>();
        Cat cat1 = new Cat("Vasya");
        Cat cat2 = new Cat("Petya");
        Cat cat3 = new Cat("Kolya");
        Cat cat4 = new Cat("Masha");
        Cat cat5 = new Cat("Dasha");
        Cat cat6 = new Cat("Murka");
        Cat cat7 = new Cat("Kurica");
        Cat cat8 = new Cat("Pusha");
        Cat cat9 = new Cat("Mosya");
        Cat cat10 = new Cat("Tom");
        mapCat.put(cat1.name, cat1);
        mapCat.put(cat2.name, cat2);
        mapCat.put(cat3.name, cat3);
        mapCat.put(cat4.name, cat4);
        mapCat.put(cat5.name, cat5);
        mapCat.put(cat6.name, cat6);
        mapCat.put(cat7.name, cat7);
        mapCat.put(cat8.name, cat8);
        mapCat.put(cat9.name, cat9);
        mapCat.put(cat10.name, cat10);
        return mapCat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}
