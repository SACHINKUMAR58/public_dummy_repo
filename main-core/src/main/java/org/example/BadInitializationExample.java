package org.example;

public class BadInitializationExample {

    private String myString;
    private int myInt;
    private boolean flag;

    // Constructor with bad object initialization
    public BadInitializationExample() {
        // Initialization with trivial or default values without context
        myString = "Hello";
        myInt = 0;
        flag = false;
    }

    public void printValues() {
        System.out.println("String: " + myString);
        System.out.println("Int: " + myInt);
        System.out.println("Flag: " + flag);
    }
}

