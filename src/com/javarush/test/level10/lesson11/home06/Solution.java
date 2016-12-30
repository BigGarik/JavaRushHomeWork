package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name, secondName;
        int age, wieght, height;
        boolean sex;

        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }
        public Human(String name, String secondName, boolean sex){
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
        }
        public Human(String name, String secondName, boolean sex, int age){
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int wieght, int height){
            this.name = name;
            this.sex = sex;
            this.wieght = wieght;
            this.height = height;
        }
        public Human(String name, boolean sex, int age, int wieght, int height){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.wieght = wieght;
            this.height = height;
        }
        public Human(String name, int wieght, int height){
            this.name = name;
            this.wieght = wieght;
            this.height = height;
        }
        public Human(String name){
            this.name = name;
        }
        public Human(String name, String secondName, int age, int height, boolean sex){
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }
        public Human(String name, String secondName, boolean sex, int age, int wieght){
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
            this.wieght = wieght;
        }
        public Human(String name, String secondName, boolean sex, int age, int wieght, int height){
            this.name = name;
            this.secondName = secondName;
            this.sex = sex;
            this.age = age;
            this.wieght = wieght;
            this.height = height;
        }

    }
}
