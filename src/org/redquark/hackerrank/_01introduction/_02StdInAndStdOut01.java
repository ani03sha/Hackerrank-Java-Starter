/*
 * In this challenge, you must read 3 integers from stdin and then print them to stdout.
 * Each integer must be printed on a new line.
 */


package org.redquark.hackerrank._01introduction;

import java.util.Scanner;

public class _02StdInAndStdOut01 {

    public static void main(String[] args) {

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Reading three integers
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        // Printing three integers
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
