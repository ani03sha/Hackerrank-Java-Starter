/*
 * Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass of your specified return type.
 * <p>
 * Method Overriding allows a subclass to override the behavior of an existing superclass method and specify a
 * return type that is some subclass of the original return type.
 * <p>
 * It is best practice to use the @Override annotation when overriding a superclass method.
 * <p>
 * You will be given a partially completed code in the editor where the main method takes the name
 * of a state (i.e., WestBengal, or AndhraPradesh) and prints the national flower of that state using
 * the classes and methods written by you.
 * <p>
 * Note: Do not use access modifiers in your class declarations.
 */


package org.redquark.hackerrank._07advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class _08CovariantReturnTypes {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = Objects.requireNonNull(region).yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

class Flower {

    String whatsYourName() {
        return "I have many names and return types";
    }
}

class Jasmine extends Flower {

    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {

    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Region {

    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {

    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {

    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}
