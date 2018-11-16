/*
 * Given a string, s, and an integer, k, complete the function so that it finds the lexicographically
 * smallest and largest substrings of length k.
 */


package org.redquark.hackerrank._02strings;

import java.util.Scanner;

public class _03SubstringComparisons {

    private static String getSmallestAndLargest(String s, int k) {
        String smallest;
        String largest;

        int length = s.length();
        String[] substrings = new String[length - k + 1];

        for (int i = 0; i < substrings.length; i++) {

            substrings[i] = s.substring(i, k + i);
        }

        int l = substrings.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {

                if (substrings[j].compareTo(substrings[i]) > 0) {
                    String temp = substrings[j];
                    substrings[j] = substrings[i];
                    substrings[i] = temp;
                }
            }
        }

        smallest = substrings[0];
        largest = substrings[l - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
