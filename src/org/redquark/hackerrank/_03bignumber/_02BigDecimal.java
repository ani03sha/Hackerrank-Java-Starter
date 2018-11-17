/*
 * Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
 *
 * Given an array, s, of n real number strings, sort them in descending order — but wait, there's more!
 * Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1,
 * and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values (e.g.,.1 = 0.1 ),
 * then they must be listed in the same order as they were received as input).
 */


package org.redquark.hackerrank._03bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _02BigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Comparator<String> comparator = (o1, o2) -> {
            return ((new BigDecimal(o2).compareTo(new BigDecimal(o1))));
        };

        Arrays.sort(s, 0, n, comparator);


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
