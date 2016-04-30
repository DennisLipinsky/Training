package com.javarush.test.CodeWars;

/**
 * Welcome! To the world of robots.
 * You need to create your own simple robot and make your robot tell you the reverse of every word you tell
 * to the robot.
 * Eg. If you say "hello" to your robot, your robot will say "olleh". That's it! Simple Enjoy!!
 */
public class CodeWars9 {


    public static void main(String[] args)
    {
        System.out.println(Robot.reverse("Welcome!"));
    }


    public static class Robot
    {
        public static String reverse(String str)
        {
            //your code here
            StringBuilder stringBuilder = new StringBuilder(str);
            return stringBuilder.reverse().toString();
        }
    }

}
