package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> set = new HashSet<>();
        set.add("Лук");
        set.add("Лампа");
        set.add("Лед");
        set.add("Лак");
        set.add("Лаг");
        set.add("Лента");
        set.add("Линия");
        set.add("Лилия");
        set.add("Лужа");
        set.add("Лопух");
        set.add("Ложка");
        set.add("Лунка");
        set.add("Льдина");
        set.add("Люк");
        set.add("Леший");
        set.add("Лес");
        set.add("Липа");
        set.add("Ледокол");
        set.add("Лесник");
        set.add("Люстра");
        return (HashSet<String>) set;
    }
}
