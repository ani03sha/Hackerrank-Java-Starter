/*
 * You are given n lines. In each line there are zero or more integers. You need to answer a few queries
 * where you need to tell the number located in yth position of xth line.
 *
 * Input Format
 *
 * 1. The first line has an integer n.
 * 2. In each of the next  lines there will be an integer d denoting number of integers on that line and
 *    then there will be d space-separated integers.
 * 3. In the next line there will be an integer q denoting number of queries. Each query will consist of
 *    two integers x and y.
 */


package org.redquark.hackerrank._04datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class _04ArrayList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList[] lists = new ArrayList[n];

        for (int i = 0; i < n; i++) {

            int d = scanner.nextInt();
            lists[i] = new ArrayList<>();
            for (int j = 0; j < d; j++) {

                lists[i].add(scanner.nextInt());
            }
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            try {
                System.out.println(lists[scanner.nextInt() - 1].get(scanner.nextInt() - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
