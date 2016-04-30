package com.javarush.test.CodeWars;

/**
 * If you have completed the Tribonacci sequence kata, you would know by now that mister Fibonacci has
 * at least a bigger brother. If not, give it a quick look to get how things work.
 * Well, time to expand the family a little more: think of a Quadribonacci starting with a signature of 4 elements
 * and each following element is the sum of the 4 previous, a Pentabonacci
 * (well Cinquebonacci would probably sound a bit more italian, but it would also sound really awful)
 * with a signature of 5 elements and each following element is the sum of the 5 previous, and so on.
 * Well, guess what? You have to build a Xbonacci function that takes a signature of X elements -
 * and remember each next element is the sum of the last X elements - and returns the first n elements of the
 * so seeded sequence.

 Xbonacci([1,1,1,1],10)==[1,1,1,1,4,7,13,25,49,94]
 Xbonacci([0,0,0,0,1],10)==[0,0,0,0,1,1,2,4,8,16]
 Xbonacci([1,0,0,0,0,0,1],10)==[1,0,0,0,0,0,1,1,2,4]


 */
public class CodeWars10 {

    public static void main(String[] args) {
        Xbonacci.xbonacci(new double []{1,0,0,0,0,0,1}, 15);
    }

    public static class Xbonacci {

        public static double[] xbonacci(double[] signature, int n) {
            // hackonacci me
            if ((n == 0) || (signature.equals(null))) {
                return new double[0];
            }
            double[] array = new double[n];

            for (int i = 0; i < signature.length; i++) {
                array[i] = signature[i];
            }

            for (int i = signature.length; i < n ; i++) {
                for (int j = i - signature.length; j < i; j++) {
                    array[i] += array[j];
                }
            }
            for(double d : array) {
                System.out.print(d + " ");
            }
            return array;
        }
    }
}
