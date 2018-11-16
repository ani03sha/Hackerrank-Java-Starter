/*
 * There are three lines of output:
 *
 * On the first line, print String: followed by the unaltered String read from stdin.
 * On the second line, print Double: followed by the unaltered double read from stdin.
 * On the third line, print Int: followed by the unaltered integer read from stdin
 */


package org.redquark.hackerrank._01introduction;

import java.util.Scanner;

public class _04StdInAndStdOut02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Reading the values
        int i = scan.nextInt();
        double d = scan.nextDouble();

        // This fucking piece of code gets rid of the hidden new line :)
        // As we need to clear the buffer before reading string from the new line
        scan.nextLine();
        String s = scan.nextLine();

        // Closing the scanner to avoid leaks - Always a good practice
        scan.close();

        // Printing the values
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
