package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a, b, c, d;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stA = reader.readLine();
        String stB = reader.readLine();
        String stC = reader.readLine();
        String stD = reader.readLine();
        a = Integer.parseInt(stA);
        b = Integer.parseInt(stB);
        c = Integer.parseInt(stC);
        d = Integer.parseInt(stD);
        if  ((a > b) && (a > c) && (a > d))
            System.out.println(a);
        if  ((b > a) && (b > c) && (b > d))
            System.out.println(b);
        if  ((c > b) && (c > a) && (c > d))
            System.out.println(c);
        if  ((d > b) && (d > c) && (d > a))
            System.out.println(d);



    }
}
