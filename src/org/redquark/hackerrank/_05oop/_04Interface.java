/*
 * You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.
 *
 * divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
 *
 * Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.
 */


package org.redquark.hackerrank._05oop;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

public class _04Interface {

    public static void main(String[] args) {
        AdvancedArithmetic my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    private static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }

}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {

        if (n == 1) {
            return n;
        }

        int sum = 0;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        return sum + 1 + n;
    }
}

