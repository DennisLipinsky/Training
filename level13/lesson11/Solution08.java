package com.javarush.test.level13.lesson11;

import java.util.List;
import java.util.ArrayList;


/**
 * Репка
 Сказка Репка:
 1. Реализовать интерфейс RepkaItem в классе Person.
 2. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
 Бабка за Дедку
 Дедка за Репку
 3. Исправить логическую ошибку цикла в методе tell класса RepkaStory.
 4. Выполнить метод main и наслаждаться сказкой!
 */
public class Solution08 {


    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();

        list.add(0, new Person("Repka", "Repky"));
        list.add(0, new Person("Dedka", "Dedky"));
        list.add(0, new Person("Babka", "Babky"));
        list.add(0, new Person("Vny4ka", "Vny4ky"));
        list.add(0, new Person(">|<y4ka", ">|<y4ky"));
        list.add(0, new Person("Kolllka", "Kolllky"));
        list.add(0, new Person("MbIlllka", "MbIlllky"));
        RepkaStory.tell(list);
    }

    public interface RepkaItem {
        public String getNamePadezh();
    }

    public static class Person implements RepkaItem {
        private String name;
        private String namePadezh;

        public Person(String name, String namePadezh) {
            this.name = name;
            this.namePadezh = namePadezh;
        }

        @Override
        public String getNamePadezh() {
            return namePadezh;
        }

        public void pull(Person personPulled) {
            System.out.println(name + " за " + personPulled.getNamePadezh());
        }
    }

    public static class RepkaStory {
        //your code here
        static void tell(List<Person> list) {
            for (int i = 1; i < list.size(); i++) {
                Person person = list.get(i - 1);
                Person nextPerson = list.get(i);
                person.pull(nextPerson);
            }
        }
    }
}
