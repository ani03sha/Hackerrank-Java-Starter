/*
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens,
 * followed by each token on a new line.
 */


package org.redquark.hackerrank._02strings;

import java.util.Scanner;

public class _06Tokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().length() == 0 || s.trim().length() > 400000) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.trim().split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }
}
