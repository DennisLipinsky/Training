package com.javarush.test.WorkTasks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class WorkTask1 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = -1;
        //Reading any positive number N from the console
        while (n <= 0) {
            System.out.println("Please enter positive number N.");
            n = Integer.parseInt(reader.readLine());
        }


        System.out.println("The number of regular bracket expressions for " + n + " opening and closing brackets is - "
                + expression(n));
        reader.close();
    }

    public static int expression(int n)
    {
        // Creating an array for m expressions, where n = m+1
        int[] array = new int [n + 1];

        // Number of right bracket expressions for N=0. Or expression without brackets.
        // The bracket expression having any brackets is a regular expression.
        array[0] = 1;

        // Calculating the number of regular expressions for m=1..n
        for(int m = 1; m <= n; m++) {
            array[m] = 0;
            for(int k = 0; k < m; k++) {
                array[m] += array[k] * array[m - k - 1];
            }
        }
        return array[n];
    }
}
