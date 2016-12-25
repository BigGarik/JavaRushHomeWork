package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a, b;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stA = reader.readLine();
        String stB = reader.readLine();
        a = Integer.parseInt(stA);
        b = Integer.parseInt(stB);
        if (a < b)
            System.out.println(a);
        else
            System.out.println(b);

    }
}