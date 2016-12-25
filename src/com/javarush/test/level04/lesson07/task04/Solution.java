package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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
        int x = 0, y = 0;
        if (num1 > 0)
            x++;
        else
            y++;
        if (num2 > 0)
            x++;
        else
            y++;
        if (num3 > 0)
            x++;
        else
            y++;
        System.out.println("количество отрицательных чисел: " + y);
        System.out.println("количество положительных чисел: " + x);

    }
}
