package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stA = reader.readLine();
        String stB = reader.readLine();
        String stC = reader.readLine();
        int a = Integer.parseInt(stA);
        int b = Integer.parseInt(stB);
        int c = Integer.parseInt(stC);

        if ((a<b) && (a>c) || (a>b) && (a<c))
            System.out.print(a);
        if ((b<a) && (b>c) || (b>a) && (b<c))
            System.out.print(b);
        if ((c<a) && (c>b) || (c>a) && (c<b))
            System.out.print(c);
    }
}
