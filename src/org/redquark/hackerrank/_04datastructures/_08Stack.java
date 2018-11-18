/*
 * A string containing only parentheses is balanced if the following is true:
 * 1. if it is an empty string
 * 2. if A and B are correct, AB is correct,
 * 3. if A is correct, (A) and {A} and [A] are also correct.
 *
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 *
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 *
 * Given a string, determine if it is balanced or not.
 */


package org.redquark.hackerrank._04datastructures;

import java.util.Scanner;
import java.util.Stack;

public class _08Stack {

    private static final char L_PAREN = '(';
    private static final char R_PAREN = ')';
    private static final char L_BRACE = '{';
    private static final char R_BRACE = '}';
    private static final char L_BRACKET = '[';
    private static final char R_BRACKET = ']';

    private static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == L_PAREN) stack.push(L_PAREN);

            else if (s.charAt(i) == L_BRACE) stack.push(L_BRACE);

            else if (s.charAt(i) == L_BRACKET) stack.push(L_BRACKET);

            else if (s.charAt(i) == R_PAREN) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != L_PAREN) return false;
            } else if (s.charAt(i) == R_BRACE) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != L_BRACE) return false;
            } else if (s.charAt(i) == R_BRACKET) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != L_BRACKET) return false;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.next();
            System.out.println(isBalanced(s));
        }
    }

}
