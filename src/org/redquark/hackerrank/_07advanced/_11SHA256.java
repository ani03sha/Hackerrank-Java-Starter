/*
 * Cryptographic hash functions are mathematical operations run on digital data;
 * by comparing the computed hash (i.e., the output produced by executing a hashing algorithm)
 * to a known and expected hash value, a person can determine the data's integrity.
 *
 * For example, computing the hash of a downloaded file and comparing the result to a previously
 * published hash result can show whether the download has been modified or tampered with.
 * In addition, cryptographic hash functions are extremely collision-resistant; in other words,
 * it should be extremely difficult to produce the same hash output from two different input values
 * using a cryptographic hash function.
 */


package org.redquark.hackerrank._07advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class _11SHA256 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(s.getBytes());

            byte[] hash = md.digest();

            for (byte b : hash) {
                System.out.printf("%02x", b);
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
