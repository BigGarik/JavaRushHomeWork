package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a, b, c, min = 0, mid = 0, max = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stA = reader.readLine();
        String stB = reader.readLine();
        String stC = reader.readLine();
        a = Integer.parseInt(stA);
        b = Integer.parseInt(stB);
        c = Integer.parseInt(stC);

        if ((a <= b) && (a <= c)) min = a;
        if ((b <= a) && (b <= c)) min = b;
        if ((c <= b) && (c <= a)) min = c;

        if (((a <= b) && (a >= c)) || ((a >= b) && (a <= c))) mid = a;
        if (((b <= a) && (b >= c)) || ((b >= a) && (b <= c))) mid = b;
        if (((c <= b) && (c >= a)) || ((c >= b) && (c <= a))) mid = c;

        if ((a >= b) && (a >= c)) max = a;
        if ((b >= a) && (b >= c)) max = b;
        if ((c >= b) && (c >= a)) max = c;

        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);


    }
}
