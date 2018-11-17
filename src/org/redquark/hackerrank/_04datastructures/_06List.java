/*
 * For this problem, we have 2 types of queries you can perform on a List:
 *
 * Insert y at index x:
 *
 * Insert
 * x y
 *
 * Delete the element at index x:
 *
 * Delete
 * x
 * Given a list, L, of N integers, perform Q queries on the list.
 *
 * Once all queries are completed, print the modified list as a single line of space-separated integers.
 */


package org.redquark.hackerrank._04datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06List {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {

            String command = scanner.next();

            if (command.equals("Insert")) {
                list.add(scanner.nextInt(), scanner.nextInt());
            } else {
                list.remove(scanner.nextInt());
            }
        }

        scanner.close();

        for (Integer a : list) {
            System.out.print(a + " ");
        }
    }
}
