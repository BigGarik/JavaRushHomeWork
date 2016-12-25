package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i <5; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Minimum = " + min(array));

    }


    public static int min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length ; i++){
            if (min > array[i]) min = array[i];
        }
        return min;
    }

}
