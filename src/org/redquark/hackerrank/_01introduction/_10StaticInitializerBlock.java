/*
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
 *
 * It's time to test your knowledge of Static initialization blocks. You can read about it here.
 *
 * Write the code that outputs the area of a parallelogram with breadth B and height H.
 * You should read the variables from the standard input.
 *
 * If B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 */


package org.redquark.hackerrank._01introduction;

import java.util.Scanner;

public class _10StaticInitializerBlock {

    private static boolean flag = false;
    private static int B, H;

    static {

        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
