package com.javarush.test.work_test;

/**
 * Created by Δενθρ on 02.04.2016.
 */
public class qwe2
{
    public static void main(String[] args)
    {
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 3));
    }




    public static String longestConsec(String[] strarr, int k) {
        // your code
        String s = "";

        if ((strarr.length == 0) || (k > strarr.length) || (k <= 0)) {
            return "";
        } else if (k == 1)
            {
                s = strarr[0];
                for (int i = 0; i < strarr.length; i++)
                {
                    if (s.length() < strarr[i].length())
                    {
                        s = strarr[i];
                    }
                }
            }
        else {
            s = conStr(strarr, 0, k);
            for (int i = 0; i < strarr.length - k + 1; i++) {
                if ( s.length() < conStr(strarr, i, k).length()) {
                    s = conStr(strarr, i, k);
                }
            }

        }
        return s;
    }
    public static String conStr(String[] strarr, int i, int k) {
        String s = "";
        for (int j = 0; j < k; j++)
        {
            s = s.concat(strarr[i+j]);
        }
        return s;
    }

}
