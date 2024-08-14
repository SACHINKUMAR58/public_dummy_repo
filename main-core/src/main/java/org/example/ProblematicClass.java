package org.example;

public class ProblematicClass {

    private String myString;
    private int myInt;
    private boolean flag;

    // God Object Anti-pattern: This class has too many responsibilities
    public ProblematicClass() {
        // Bad object initialization
        myString = "Hello";
        myInt = 0;
        flag = false;
    }

    // Dead code: This method is never called
    public void unusedMethod() {
        System.out.println("This method is never used!");
    }

    // Duplicate code: methodA and methodB do the same thing
    public void methodA() {
        String result = "Result: " + myString;
        if (flag) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }

    public void methodB() {
        String result = "Result: " + myString;
        if (flag) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }
    }

    // Poor coding conventions and anti-patterns
    // - Magic Number
    // - Lava Flow: Old code or logic kept around that is no longer relevant
    // - Spaghetti Code: No clear structure or flow
    public void calculate(int x) {
        if (x == 42) { // Magic number
            System.out.println("The answer to everything!");
        } else if (x == 0) {
            System.out.println("Zero value");
        } else {
            for (int i = 0; i < 10; i++) { // Hardcoded loop limit
                System.out.println("Processing: " + i);
            }
        }

        // Lava Flow: Legacy logic that's no longer relevant
        boolean legacyFlag = false;
        if (legacyFlag) {
            System.out.println("Legacy code path");
        }

        // Spaghetti Code: Conditional logic that's hard to follow
        if (x > 0) {
            if (x < 10) {
                System.out.println("x is between 1 and 9");
            } else if (x < 20) {
                System.out.println("x is between 10 and 19");
            } else {
                System.out.println("x is 20 or more");
            }
        } else {
            System.out.println("x is zero or negative");
        }
    }

    // Excessive Logging (also a poor coding convention)
    public void excessiveLogging() {
        System.out.println("Step 1");
        System.out.println("Step 2");
        System.out.println("Step 3");
        System.out.println("Step 4");
        System.out.println("Step 5");
    }

    // Long method with multiple responsibilities (God Object Anti-pattern)
    public void process() {
        // Part 1: Logging
        for (int i = 0; i < 5; i++) {
            System.out.println("Log entry: " + i);
        }

        // Part 2: Simple computation
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println("Computation result: " + result);

        // Part 3: Conditional logic
        if (flag) {
            System.out.println("Flag is true");
        } else {
            System.out.println("Flag is false");
        }

        // Part 4: Potentially unnecessary null check
        if (myString != null) {
            System.out.println("String is not null");
        }

        // Dead code (never reached due to return statement above)
        if (false) {
            System.out.println("This will never print");
        }
    }

    // Anti-pattern: God Object - too many responsibilities in one method
    public void doEverything() {
        // Bad initialization
        int a = 1, b = 2, c = 3;

        // Spaghetti Code
        if (a > b) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > b <= c");
            }
        } else {
            if (c > b) {
                System.out.println("c > b >= a");
            } else {
                System.out.println("b >= c >= a");
            }
        }

        // Code Smell: Long method with multiple responsibilities
        int sum = a + b + c;
        if (sum > 10) {
            System.out.println("Sum is greater than 10");
        } else {
            System.out.println("Sum is less or equal to 10");
        }

        // More bad coding practices
        int x = 5; // Poorly named variable
        switch (x) { // Magic number usage
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Other");
                break;
        }

        // Lava Flow: Old code that has been left in the method
        boolean legacyFlag = false;
        if (legacyFlag) {
            System.out.println("Legacy code path");
        }
    }
}

