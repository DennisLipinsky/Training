package com.javarush.test.CodeWars;

/**
 *  Complete function saleHotdogs, function accept 1 parameters:n, n is the number of customers to buy hotdogs,
 *  different numbers have different prices (refer to the following table),
 *  return a number that the customer need to pay how much money.

 +---------------+-------------+
 |  numbers n    | price(cents)|
 +---------------+-------------+
 |n<5            |    100      |
 +---------------+-------------+
 |n>=5 and n<10  |     95      |
 +---------------+-------------+
 |n>=10          |     90      |
 +---------------+-------------+

 *
 */
public class CodeWars8 {

    public static void main(String[] args)
    {
        System.out.println(SaleHotdogs.saleHotdogs(4));
        System.out.println(SaleHotdogs.saleHotdogs(5));
        System.out.println(SaleHotdogs.saleHotdogs(11));
        System.out.println(SaleHotdogs.saleHotdogs(10));
        System.out.println(SaleHotdogs.saleHotdogs(9));
    }


    public static class SaleHotdogs{
        public static int saleHotdogs(final int n){
            // show me the code
            return (n < 5) ? n*100 : ((n >= 5) && (n < 10)) ? n*95 : (n >= 10) ? n*90 : n*95;

/**    Same decision using if..else operator
 *          if(n < 5) {
 *             return n*100;
 *          } else return ((n >= 5) && (n < 10)) ?  n*95 : n * 90;
 *
 */
        }
    }


}
