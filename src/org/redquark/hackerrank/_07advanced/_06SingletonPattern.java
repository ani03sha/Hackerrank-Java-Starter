/*
 * "The singleton pattern is a design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system."
 * - Wikipedia: Singleton Pattern
 *
 * Complete the Singleton class in your editor which contains the following components:
 *
 * A private Singleton non parameterized constructor.
 * A public String instance variable named str.
 * Write a static method named getSingleInstance that returns the single instance of the Singleton class.
 * Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton class to print a line.
 */


package org.redquark.hackerrank._07advanced;

public class _06SingletonPattern {

    private static volatile _06SingletonPattern instance;

    public String str;

    private _06SingletonPattern() {

    }

    public static _06SingletonPattern getSingleInstance() {

        if (instance == null) {
            synchronized (_06SingletonPattern.class) {
                if (instance == null) {
                    instance = new _06SingletonPattern();
                }
            }
        }
        return instance;
    }

}
