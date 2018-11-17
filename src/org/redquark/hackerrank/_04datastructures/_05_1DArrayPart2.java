/*
 * You can move from index i to index 1-1, i+1, or i=leap as long as the destination index is a cell containing a 0.
 * If the destination index is greater than n-1, you win the game.
 */


package org.redquark.hackerrank._04datastructures;

import java.util.Scanner;

public class _05_1DArrayPart2 {

    private static boolean canWin(int leap, int[] game) {

        return solvable(leap, game, 0);
    }

    private static boolean solvable(int leap, int[] game, int i) {

        if (i < 0 || game[i] == 1) {
            return false;
        } else if (i + 1 >= game.length || i + leap >= game.length) {
            return true;
        }

        game[i] = 1;

        return solvable(leap, game, i + 1) || solvable(leap, game, i - 1) || solvable(leap, game, i + leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
