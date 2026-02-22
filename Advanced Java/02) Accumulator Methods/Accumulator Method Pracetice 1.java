/*
Instructions:
=====================================================
1. Write a method header on line two with the following specs:
    - Returns:
        - an integer named: sumToX
    - Parameters:
        - an integer called x
    - Purpose:
        - calculate the sum of the integers from 1 to x (including x)
    - Examples:
        - sumToX(5) ==> 15
        - sumToX(7) ==> 28
*/

// Template
class Main {
    // Define the sumToX method
    {
        // Return the sum of the integers from 1 to x (including x)
        return (x * (x + 1)) / 2;
    }
    public static void main(String[] args) {
        // Print the sumToX method (Use the examples)
        
    }
}

// Answer
/*
class Main {
    public static int sumToX(int x) {
        return (x * (x + 1)) / 2;
    }
    public static void main(String[] args) {
        // Print the sumToX method
        System.out.println(sumToX(5));
        System.out.println(sumToX(7));
    }
}
*/