package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* ����� ������
��������� ������ � ���������� ��� ������ � ������� ��� ����� �� ����� � ����: �May is 5 month�.
����������� ���������.
*/

public class Solution1
{
    public static void main(String[] args) throws IOException
    {
        //�������� ��� ��� ���
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        List<String> month = new ArrayList<String>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

        for (int i = 0; i < month.size(); i++) {
            if(s.equalsIgnoreCase(month.get(i))) {
                System.out.println(s + " is " + (i+1) + " month.");
            }
        }
    }
}