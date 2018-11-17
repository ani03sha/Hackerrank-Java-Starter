/*
 * You are given a phone book that consists of people's names and their phone number.
 * After that you will be given some person's name as query. For each query, print the phone number of that person.
 */


package org.redquark.hackerrank._04datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _07Map {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phonebook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phonebook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
