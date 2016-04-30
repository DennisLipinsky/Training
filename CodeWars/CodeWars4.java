package com.javarush.test.CodeWars;

/**
 * Created by Денис on 30.04.2016.
 */
public class CodeWars4  {

    public static void main(String[] args)
    {
        System.out.println(Arrays.findSmallest(new int[]{1,2,3,4,5}, "value"));
        System.out.println(Arrays.findSmallest(new int[]{1, 2, 3, 4, 5}, "index"));

    }

    public static class Arrays {

        public static int findSmallest( final int[] numbers, final String toReturn ) {
            //TODO: Add solution here
            int value = numbers[0];
            int index = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (value > numbers[i]) {
                    value = numbers[i];
                    index = i;
                }
            }
            return toReturn.equals("value") ? value : index;
        }
    }
}
