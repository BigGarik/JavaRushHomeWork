package com.javarush.test.level03.lesson03.task01;

/* Реализация метода
Добавьте метод public static void printString(String s) который будет выводить переданную строку на экран.
*/
public class Solution
{
    //напишите тут ваш код

    public static void main(String[] args) {

        System.out.println(multiply("Ha"));

        printString("Hello Amigo!");
    }
    public static String multiply(String s)
    {
        String result = "";
        for (int i = 0; i <5; i++)
        {
            result = new String(new char[5]).replace("\0", s);
        }
        return result;
    }

    public static void printString(String s){
        System.out.println(s);
    }
}