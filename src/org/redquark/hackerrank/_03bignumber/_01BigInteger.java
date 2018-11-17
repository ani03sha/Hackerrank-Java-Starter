/*
 * In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't
 * contain them in any ordinary data types like a long integer.
 *
 * Use the power of Java's BigInteger class and solve this problem.
 */


package org.redquark.hackerrank._03bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class _01BigInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }
}
