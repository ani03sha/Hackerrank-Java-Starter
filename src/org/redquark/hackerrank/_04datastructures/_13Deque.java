/*
 * You are given N integers. You need to find the maximum number of unique integers among all the possible
 * contiguous subarrays of size M.
 *
 * Note: Time limit is  second for this problem.
 */


package org.redquark.hackerrank._04datastructures;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class _13Deque {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int maxUniqueElements = Integer.MIN_VALUE;

        /* Iterate through all contiguous subarrays, keeping
         * track of the max number of unique elements in any */
        for (int i = 0; i < n; i++) {
            int element = in.nextInt();

            deque.add(element);
            set.add(element);

            if (deque.size() == m) {
                if (set.size() > maxUniqueElements) {
                    maxUniqueElements = set.size();
                }

                int firstElement = deque.removeFirst();
                if (!deque.contains(firstElement)) {
                    set.remove(firstElement);
                }
            }
        }
        in.close();

        System.out.println(maxUniqueElements);

    }
}
