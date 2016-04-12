package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution1 создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man john = new Man ("John", 21, "Chicago");
        Man bill = new Man ("Bill", 44, "Buffalo");
        Woman mary = new Woman("Mary", 20, "Minnesota");
        Woman suzy = new Woman("Suzy", 40, "Alabama");


        //выведи их на экран тут
        System.out.println(john.name + " " + john.age + " " + john.address);
        System.out.println(bill.name + " " + bill.age + " " + bill.address);
        System.out.println(mary.name + " " + mary.age + " " + mary.address);
        System.out.println(suzy.name + " " + suzy.age + " " + suzy.address);

    }

    //добавьте тут ваши классы
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name)
        {
            this.name = name;
            this.age = 20;
        }

        public Man(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;


        public Woman(String name)
        {
            this.name = name;
            this.age = 20;
        }

        public Woman(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }
}
