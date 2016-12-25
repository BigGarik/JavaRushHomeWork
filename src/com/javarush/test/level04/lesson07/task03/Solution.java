package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stNum1 = reader.readLine();
        String stNum2 = reader.readLine();
        String stNum3 = reader.readLine();
        int num1 = Integer.parseInt(stNum1);
        int num2 = Integer.parseInt(stNum2);
        int num3 = Integer.parseInt(stNum3);
        int x = 0;
        if (num1 > 0)
            x++;
        if (num2 > 0)
            x++;
        if (num3 > 0)
            x++;
        System.out.print(x);


    }
}
