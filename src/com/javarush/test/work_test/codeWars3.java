package com.javarush.test.work_test;

import javax.swing.text.NumberFormatter;
import java.math.BigInteger;

import static java.math.BigInteger.ONE;

/**
 * Created by Δενθρ on 02.04.2016.
 */
public class codeWars3
{
    public String determineType(String number) {

        // determine type...
        String s = "";
        long i = Long.parseLong(number);
        if ((i > -129) && ( i < 128))  s = "byte";
        else if ((i >  -32769) && (i < 32768))  s = "short";
        else if ((i >=  -2147483648) && (i <= 2147483647))  s = "integer";
        else if ((i <  -2147483648) && (i > 2147483647))  s = "long";
        else if (number.length() > 19) s = "none";

        return s;
    }
}
