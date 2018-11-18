/*
 * Given 2 BitSets, B1 and B2, of size N where all bits in both BitSets are initialized to 0,
 * perform a series of M operations.
 * After each operation, print the number of set bits in the respective BitSets as two
 * space-separated integers on a new line.
 */


package org.redquark.hackerrank._04datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class _14Bitset {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet x = new BitSet(n);
        BitSet y = new BitSet(n);

        BitSet[] bs = new BitSet[3];
        bs[1] = x;
        bs[2] = y;

        while (m-- > 0) {
            String command = scanner.next();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            switch (command) {

                case "AND":
                    bs[a].and(bs[b]);
                    break;
                case "OR":
                    bs[a].or(bs[b]);
                    break;
                case "XOR":
                    bs[a].xor(bs[b]);
                    break;
                case "FLIP":
                    bs[a].flip(b);
                    break;
                case "SET":
                    bs[a].set(b);
            }

            System.out.println(bs[1].cardinality() + " " + bs[2].cardinality());
        }
    }
}
