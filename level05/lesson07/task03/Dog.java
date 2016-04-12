package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    protected String name;
    protected int height;
    protected String colour;


    public void initialize (String name) {
        this.name = name;
        this.height = 5;
        this.colour = "grey";
    }

    public void initialize (String name, int height) {
        this.name = name;
        this.height = height;
        this.colour = "grey";
    }

    public void initialize (String name, int height, String colour) {
        this.name = name;
        this.height = height;
        this.colour = colour;
    }


}
