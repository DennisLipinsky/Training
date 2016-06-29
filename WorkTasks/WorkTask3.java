package com.javarush.test.WorkTasks;

import java.math.BigInteger;

/**
 *  Decision was taken from http://stackoverflow.com/
 *  Coded by engineer
 */
public class WorkTask3 {

    public static void main(String[] args)
    {
        // The first element is set as 1
        BigInteger factorial = BigInteger.ONE;

        // Calculating the 100!
        for (int i = 2; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        long sum = 0;

        // Calculating the sum of digits in the 100! number
        while (factorial.compareTo(BigInteger.ZERO) > 0) {
            sum += factorial.mod(BigInteger.TEN).longValue();
            factorial = factorial.divide(BigInteger.TEN);
        }

        System.out.println(sum);
    }
}


