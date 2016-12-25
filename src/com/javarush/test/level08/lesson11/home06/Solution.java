package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human();
        child1.name = "Sveta";
        child1.sex = false;
        child1.age = 15;
        Human child2 = new Human();
        child2.name = "Vova";
        child2.sex = true;
        child2.age = 17;
        Human child3 = new Human();
        child3.name = "Igor";
        child3.sex = true;
        child3.age = 14;
        Human father = new Human();
        father.name = "Kolya";
        father.sex = true;
        father.age = 40;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        Human mother = new Human();
        mother.name = "Olya";
        mother.sex = false;
        mother.age = 35;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);
        Human grandFather1 = new Human();
        grandFather1.name = "Вася";
        grandFather1.sex = true;
        grandFather1.age = 80;
        grandFather1.children.add(father);
        Human grandFather2 = new Human();
        grandFather2.name = "Petya";
        grandFather2.sex = true;
        grandFather2.age = 70;
        grandFather2.children.add(mother);
        Human grandMother1 = new Human();
        grandMother1.name = "Dasha";
        grandMother1.sex = false;
        grandMother1.age = 75;
        grandMother1.children.add(father);
        Human grandMother2 = new Human();
        grandMother2.name = "Marfa";
        grandMother2.sex = false;
        grandMother2.age = 65;
        grandMother2.children.add(mother);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
