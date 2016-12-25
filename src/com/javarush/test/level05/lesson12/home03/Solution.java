package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse nibblsMouse = new Mouse("Nibbls", 5 , 2);
        Mouse muscleMouse = new Mouse("Muscle", 13 , 7);
        Cat butchCat = new Cat("Butch", 20, 20);
        Cat tomCat = new Cat("Tom", 18, 15);
        Dog spikeDog = new Dog("Spike", 50, 30);


        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int teeth;
        int height;

        public Dog(String name, int height, int teeth)
        {
            this.name = name;
            this.height = height;
            this.teeth = teeth;
        }
    }
    public static class Cat
    {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

}
