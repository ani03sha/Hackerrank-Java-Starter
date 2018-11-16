/*
 * Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1<=i<=10 ) should be printed
 * on a new line in the form: N x i = result.
 */


package org.redquark.hackerrank._01introduction;

import java.util.Scanner;

public class _06Loops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }

        scanner.close();
    }
}
