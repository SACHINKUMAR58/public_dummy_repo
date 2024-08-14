package org.example;

public class CodeSmellExample {

    // Code Smell: Magic Number
    public void calculate(int x) {
        if (x == 42) { // Magic number
            System.out.println("The answer to everything!");
        } else if (x == 0) {
            System.out.println("Zero value");
        } else {
            // Hardcoded loop limit, another code smell
            for (int i = 0; i < 10; i++) {
                System.out.println("Processing: " + i);
            }
        }
    }

    // Code Smell: Long method with multiple responsibilities
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
        boolean flag = true;
        if (flag) {
            System.out.println("Flag is true");
        } else {
            System.out.println("Flag is false");
        }

        // Part 4: Potentially unnecessary null check
        String myString = "Hello";
        if (myString != null) {
            System.out.println("String is not null");
        }
    }
}

