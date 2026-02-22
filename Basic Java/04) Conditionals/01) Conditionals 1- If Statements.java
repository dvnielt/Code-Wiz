/*
1. If num is positive (greater than 0), print "__ is positive"
2. If num is negative (less than 0), print "__ is negative"
3. If num is equal to 0, don't print anything
*/

// Answer
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0)
        {
            System.out.println(num + " is positive");
        }
        
        if (num < 0)
        {
            System.out.println(num + " is negative");
        }
    }
}

// Template
/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // IF num IS GREATER THAN 0 THEN
        //     PRINT {num} is positive
        
        // IF num is LESS THAN 0 THEN
        //    PRINT {num} is negative
        
    }
}
*/