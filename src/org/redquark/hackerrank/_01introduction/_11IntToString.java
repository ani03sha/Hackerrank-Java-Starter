/*
 * You are given an integer n, you have to convert it into a string.
 *
 * If your code successfully converts n into a string s the code will print "Good job".
 * Otherwise it will print "Wrong answer".
 */

package org.redquark.hackerrank._01introduction;

import java.security.Permission;
import java.util.Scanner;

public class _11IntToString {

    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            String s = String.valueOf(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent us from terminating the code using exit(0)!
class DoNotTerminate {

    static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

    static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }
}

