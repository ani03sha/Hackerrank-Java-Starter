/*
 * 1. Create an array, a, capable of holding  integers.
 * 2. Modify the code in the loop so that it saves each sequential value to its corresponding
 *    location in the array. For example, the first value must be stored in a0, the second value must be stored in a1,
 *    and so on.
 */


package org.redquark.hackerrank._04datastructures;

import java.util.Scanner;

public class _01_1DArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = scan.nextInt();
        }

        scan.close();

        // Prints each sequential element in array a
        for (int x : a) {
            System.out.println(x);
        }
    }
}