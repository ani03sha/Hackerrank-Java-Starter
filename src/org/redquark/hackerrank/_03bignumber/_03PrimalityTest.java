/*
 * Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and
 * print whether it's prime or not prime.
 */


package org.redquark.hackerrank._03bignumber;

import java.math.BigInteger;
import java.util.Scanner;

public class _03PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        BigInteger integer = new BigInteger(String.valueOf(n));

        System.out.println(integer.isProbablePrime(1) ? "prime" : "not prime");

        scanner.close();
    }
}
