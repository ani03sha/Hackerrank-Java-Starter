/**
 * The Java instanceof operator is used to test if the object or instance is an instanceof the specified type.
 * <p>
 * In this problem we have given you three classes in the editor:
 * <p>
 * Student class
 * Rockstar class
 * Hacker class
 * In the main method, we populated an ArrayList with several instances of these classes.
 * count method calculates how many instances of each type is present in the ArrayList.
 * The code prints three integers, the number of instance of Student class, the number of instance of
 * Rockstar class, the number of instance of Hacker class.
 */


package org.redquark.hackerrank._05oop;

import java.util.ArrayList;
import java.util.Scanner;

public class _07InstanceOfKeyword {

    private static String count(ArrayList<Object> mylist) {
        int a = 0, b = 0, c = 0;
        for (Object element : mylist) {
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }
        return Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) mylist.add(new Student());
            if (s.equals("Rockstar")) mylist.add(new Rockstar());
            if (s.equals("Hacker")) mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}

class Student {
}

class Rockstar {
}

class Hacker {
}
