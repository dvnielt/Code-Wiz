/*
1. If name is equal to "Chen", print "teacher"
2. For any other input, print "student"
*/

// Answer
import java.util.Scanner;

class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (name.equals("Chen"))
        {
            System.out.println("teacher");
        }
        else
        {
            System.out.println("student");
        }
    }
}

// Template
/*
import java.util.Scanner;

class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // IF name EQUALS Chen THEN
        //     PRINT teacher
        // ELSE
        //     PRINT student
        
    }
}
*/