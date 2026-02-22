

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // PART 1: Print multiplication table for a number
        // Prompt the user for a number
        System.out.println("Enter a number for the multiplication table (must be less than 20):");
        int num = sc.nextInt();
        
        // PART 2: Check if the number is less than 20
        if (num < 20) {
            // Print the multiplication table
            System.out.println("Multiplication table for " + num + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.print(num * i);
                // Print comma after each number except the last one
                if (i < 10) {
                    System.out.print(", ");
                }
            }
            System.out.println(); // Move to next line
            
            // PART 3: Simple calculator for area/perimeter of a square
            System.out.println("\nWhat would you like to calculate? (area/perimeter):");
            sc.nextLine(); // Consume the newline character
            String calculation = sc.nextLine();
            
            if (calculation.equals("area")) {
                // Prompt user for the length of a side of the square
                System.out.println("Enter the length of a side of the square:");
                double side = sc.nextDouble();
                
                // Calculate area: side * side
                double area = side * side;
                System.out.println("Area of the square: " + area);
            } else if (calculation.equals("perimeter")) {
                // Prompt user for the length of a side of the square
                System.out.println("Enter the length of a side of the square:");
                double side = sc.nextDouble();
                
                // Calculate perimeter: 4 * side
                double perimeter = 4 * side;
                System.out.println("Perimeter of the square: " + perimeter);
            }
            
            // PART 4: Extended calculator to handle two more shapes (Rectangle and Circle)
            System.out.println("\nNow let's calculate for more shapes!");
            System.out.println("Choose a shape (square/rectangle/circle):");
            sc.nextLine(); // Consume the newline character
            String shape = sc.nextLine();
            
            if (shape.equals("square")) {
                System.out.println("Enter the length of a side of the square:");
                double side = sc.nextDouble();
                
                System.out.println("Calculate area or perimeter?");
                sc.nextLine();
                String calc = sc.nextLine();
                
                if (calc.equals("area")) {
                    double area = side * side;
                    System.out.println("Area of the square: " + area);
                } else if (calc.equals("perimeter")) {
                    double perimeter = 4 * side;
                    System.out.println("Perimeter of the square: " + perimeter);
                }
            } else if (shape.equals("rectangle")) {
                System.out.println("Enter the length of the rectangle:");
                double length = sc.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double width = sc.nextDouble();
                
                System.out.println("Calculate area or perimeter?");
                sc.nextLine();
                String calc = sc.nextLine();
                
                if (calc.equals("area")) {
                    double area = length * width;
                    System.out.println("Area of the rectangle: " + area);
                } else if (calc.equals("perimeter")) {
                    double perimeter = 2 * (length + width);
                    System.out.println("Perimeter of the rectangle: " + perimeter);
                }
            } else if (shape.equals("circle")) {
                System.out.println("Enter the radius of the circle:");
                double radius = sc.nextDouble();
                
                System.out.println("Calculate area or perimeter?");
                sc.nextLine();
                String calc = sc.nextLine();
                
                if (calc.equals("area")) {
                    // Area of circle = π * radius * radius
                    double area = 3.14159 * radius * radius;
                    System.out.println("Area of the circle: " + area);
                } else if (calc.equals("perimeter")) {
                    // Perimeter (circumference) of circle = 2 * π * radius
                    double circumference = 2 * 3.14159 * radius;
                    System.out.println("Circumference of the circle: " + circumference);
                }
            }
        } else {
            System.out.println("Error: Number must be less than 20!");
        }
    }
}