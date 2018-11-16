/*
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 */


package org.redquark.hackerrank._02strings;

import java.util.Scanner;

public class _04Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
    }
}
