/*
 * Write the following methods that return a lambda expression performing a specified action:
 *
 * PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
 * PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
 * PerformOperation isPalindrome(): The lambda expression must return true if a number is a palindrome or false if it is not.
 */


package org.redquark.hackerrank._07advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}

public class _09LambdaExpressions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = MyMath.isOdd();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = MyMath.isPrime();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = MyMath.isPalindrome();
                ret = MyMath.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }

}

class MyMath {
    static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    static PerformOperation isOdd() {

        return (int a) -> a % 2 != 0;
    }

    static PerformOperation isPrime() {
        return (int a) -> BigInteger.valueOf(a).isProbablePrime(1);
    }

    static PerformOperation isPalindrome() {

        return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }
}