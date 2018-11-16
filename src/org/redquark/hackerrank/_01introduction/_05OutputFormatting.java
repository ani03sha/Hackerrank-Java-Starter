/*
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly  characters.
 * The second column contains the integer, expressed in exactly  digits;
 * if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 */


package org.redquark.hackerrank._01introduction;

import java.util.Scanner;

public class _05OutputFormatting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            // Trailing upto 15 characters
            System.out.printf("%-15s", s1);

            // Adding zero if the number has less than 3 digits
            System.out.printf("%03d\n", x);
        }
        System.out.println("================================");
    }
}
