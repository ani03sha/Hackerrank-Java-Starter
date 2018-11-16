/*
 * The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
 */


package org.redquark.hackerrank._01introduction;

import java.util.Scanner;

public class _09EndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (scanner.hasNext()) {

            System.out.println(++counter + " " + scanner.nextLine());
        }
    }
}
