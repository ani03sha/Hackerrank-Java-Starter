/*
 * You are updating the username policy on your company's internal networking platform.
 * According to the policy, a username is considered valid if all the following constraints are satisfied:
 *
 * 1. The username consists of 8 to 30 characters inclusive. If the username consists of less than
 *    8 or greater than 30 characters, then it is an invalid username.
 * 2. The username can only contain alphanumeric characters and underscores (_).
 *    Alphanumeric characters describe the character set consisting of lowercase characters [a-z],
 *    uppercase characters [A-Z], and digits [0-9].
 * 3. The first character of the username must be an alphabetic character, i.e., either lowercase character
 *    [a-z] or uppercase character [A-Z].
 */


package org.redquark.hackerrank._02strings;

import java.util.Scanner;

public class _10ValidUsernameRegex {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    static class UsernameValidator {
        /*
         * Write regular expression here.
         */
        static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
    }
}
