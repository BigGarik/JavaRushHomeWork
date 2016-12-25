package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/


public class Solution
{
    public static HashSet<Integer> createSet()
    {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(8);
        set.add(66);
        set.add(2);
        set.add(31);
        set.add(65);
        set.add(92);
        set.add(11);
        set.add(123);
        set.add(15);
        set.add(43);
        set.add(86);
        set.add(345);
        set.add(6);
        set.add(0);
        set.add(9);
        set.add(10);
        set.add(17);
        set.add(19);
        return (HashSet<Integer>) set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator it = set.iterator();
        while (it.hasNext())
        {
            int value = (int) it.next();
            if (value > 10)
                it.remove();
        }
        return set;
    }
}
