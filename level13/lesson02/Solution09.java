package com.javarush.test.level13.lesson02;

/**
 * ���������� � �����������
 * 1. ������� ����� EnglishTranslator, ������� ����������� �� Translator.
 * 2. ����������� ��� ����������� ������.
 * 3. �������, ��� ������ ���������� ����� getLanguage.
 * 4. ��������� ������ �������� �� ����� "� ���������� � �����������".
 * 5. ����� main ������ ������.
 *
 */
public class Solution09 {


    public static void main(String[] args) throws Exception {

        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate()
        {
            return "I am an " + getLanguage() + " translator";
        }
    }

    public static class EnglishTranslator extends Translator {

        public String getLanguage()
        {
            return "English";
        }
    }
}

