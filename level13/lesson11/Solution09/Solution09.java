package com.javarush.test.level13.lesson11.Solution09;

/**
 *  Битва роботов
 *
 *  6 Изменить код согласно новой архитектуре и добавить новую логику:
 *   6.1 Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
 *   6.2 Отредактировать класс Robot учитывая AbstractRobot.
 *   6.3 Расширить класс BodyPart новой частью тела "грудь".
 *   6.4 Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).
 *
 */

public class Solution09 {

    public static void main(String[] args)
    {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Decepticone");
        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defence();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }

}
