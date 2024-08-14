package org.example;

public class DeadCodeExample {

    // This method is never used, which makes it dead code
    public void unusedMethod() {
        System.out.println("This method is never used!");
    }

    public void activeMethod() {
        System.out.println("This method is used!");
    }
}

