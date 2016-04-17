package com.javarush.test.work_test;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Δενθρ on 14.04.2016.
 */
public class Tree_set
{
    public static void main(String[] args)
    {
        TreeSet<String> set = new TreeSet<>();
        set.add("123");
        //set.add("234");
        set.add("453");
        set.add("356");
        set.add("017");
        set.add("567");
        set.add("6");
        set.add("17");
        System.out.println();
        System.out.println(set);
        for(String s : set) {
            System.out.print(s + " ");
        }
    }
}
