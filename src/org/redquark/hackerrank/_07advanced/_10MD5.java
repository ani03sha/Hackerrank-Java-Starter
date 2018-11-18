/*
 * MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a -bit hash value.
 * Here are some common uses for MD5:
 *
 * To store a one-way hash of a password.
 * To provide some assurance that a transferred file has arrived intact.
 *
 * Given an alphanumeric string, , denoting a password, compute and print its MD5 encryption value.
 */


package org.redquark.hackerrank._07advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class _10MD5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        StringBuilder hash = new StringBuilder();

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest((s.getBytes()));
            BigInteger bigInteger = new BigInteger(1, messageDigest);
            hash = new StringBuilder(bigInteger.toString(16));

            while (hash.length() < 32) {
                hash.insert(0, "0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(hash);
    }
}
