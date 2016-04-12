package com.javarush.test.work_test;

/**
 * Created by Δενθρ on 14.02.2016.
 */
public class qwe

{

        public static void main(String[] args)
        {
            double[] s = {1, 1, 1};
            int n = 10;
            double[] array = new double[n];
            array = tribonacci(makeTribonacci(s, 15), n);
            for (int i = 0; i < n; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
    public static double[] makeTribonacci(double[] s, int n){
        double[] array = new double[n];
        for (int i = 0; i < s.length; i++)
        {
            array[i] = s[i];
        }
        for (int i = 3; i < n; i++)
        {
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }

        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println(" ");
        return array;
    }

    public static double[] tribonacci(double[] s, int n) {
        // hackonacci me
        double[] array = new double[n];
        if ((n == 0) || (n < 0)) {
            return array;
        }
        for (int i = 0; i < n; i++)
        {
            array[i] = s[i];
        }
        return array;
    }

}


