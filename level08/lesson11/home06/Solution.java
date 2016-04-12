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
        //напишите тут ваш код
        ArrayList<Human> children0 = new ArrayList<>();
        Human kid1 = new Human("Kid1", true, 5, children0);
        Human kid2 = new Human("Kid2", false, 10, children0);
        Human kid3 = new Human("Kid3", true, 15, children0);

        ArrayList<Human> children = new ArrayList<>();
        children.add(kid1);
        children.add(kid2);
        children.add(kid3);

        Human father = new Human("Papa", true, 45, children);
        Human mother = new Human("Mama", false, 40, children);

        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(father);

        ArrayList<Human> children3 = new ArrayList<>();
        children3.add(mother);

        Human ded1 = new Human("Ivan", true, 75, children2);
        Human ded2 = new Human("Petr", true, 70, children3);
        Human baba1 = new Human("Manja", false, 75, children2);
        Human baba2 = new Human("Zina", false, 71, children3);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());


    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<Human>();

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = null;
        }

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

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
