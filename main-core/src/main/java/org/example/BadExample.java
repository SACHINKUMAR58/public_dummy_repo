package org.example;

public class BadExample {
    public String s1 = "Hello ";
    public String s2 = "World!";
    public String s3;

    public void concatStrings() {
        s3 = s1 + s2; // Inefficient string concatenation
    }

    public void printMessage() {
        System.out.println(s3); // No null check, might cause NullPointerException
    }

    public static void main(String[] args) {
        BadExample be = new BadExample();
        be.concatStrings();
        be.printMessage();
    }
}
