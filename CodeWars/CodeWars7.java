package com.javarush.test.CodeWars;


import java.util.HashMap;
import java.util.Map;

/**
 * Given an array, find the int that appears an odd number of times.
 * There will always be only one integer that appears an odd number of times.
 */
public class CodeWars7 {

    public static void main(String[] args)
    {
        System.out.println(FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    }

    public static class FindOdd {
        public static int findIt(int[] A) {
            Map<Integer, Integer> map = new HashMap<>();
            int x = 1;
            for (int i = 0; i < A.length; i++) {
                x = 1;
                if (!map.containsKey(A[i])) {
                    for (int j = i + 1; j < A.length ; j++) {
                        if(A[i] == A[j]) x++;
                    }
                    map.put(A[i], x);
                }
            }
            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                int p = pair.getValue();
                if(p%2 != 0) x = pair.getKey();
            }
            return x;
        }
    }

}
