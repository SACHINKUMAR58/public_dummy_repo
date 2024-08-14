package org.example;

public class DuplicateCodeExample {

    // Duplicate code in methodA and methodB
    public void methodA() {
        String result = "Result: " + "Hello";
        boolean flag = false;
        if (flag) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }

    public void methodB() {
        String result = "Result: " + "Hello";
        boolean flag = false;
        if (flag) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }
}

