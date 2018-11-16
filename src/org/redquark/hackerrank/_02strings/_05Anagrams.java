/*
 * Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
 * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 *
 * Complete the function in the editor. If a and b are case-insensitive anagrams, print "Anagrams";
 * otherwise, print "Not Anagrams" instead.
 */


package org.redquark.hackerrank._02strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05Anagrams {

    private static boolean isAnagram(String a, String b) {

        if (a == null || b == null || a.equals("") || b.equals("")) {
            return false;
        }

        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {

            char c = a.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int f = map.get(c);
                map.put(c, ++f);
            }
        }

        for (int i = 0; i < b.length(); i++) {

            char c = b.charAt(i);

            if (!map.containsKey(c)) {
                return false;
            }

            int f = map.get(c);

            if (f == 0) {
                return false;
            } else {
                map.put(c, --f);
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
