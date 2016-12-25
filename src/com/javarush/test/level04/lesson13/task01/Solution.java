package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int x = 1; x <= 100; x++)
        {
            if (x % 2 == 0)
                System.out.println(x);
        }
    }
}
