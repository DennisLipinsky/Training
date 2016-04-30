package com.javarush.test.CodeWars;

/**
 * Find the number of divisors of a positive integer n.
 */
public class CodeWars5 {

    public static void main(String[] args)
    {
        System.out.println(FindDivisor.numberOfDivisors(100));
    }

    public static class FindDivisor {

        public static long numberOfDivisors(int n) {
            // TODO please write your code below this comment
            long divisorsNum = 1;
            if (n > 0) {
                for (int i = 1; i < n; i++) {
                    if(n%i == 0) {
                        divisorsNum++;
                    }
                }
                return divisorsNum;
            } else {
                System.out.println("N is non-positive.");
                return 0;
            }
        }
    }
}
