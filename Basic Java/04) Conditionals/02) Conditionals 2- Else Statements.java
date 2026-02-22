/*
1. If num is even (divisible by 2), print "__ is even"
2. If num is odd, print "__ is odd"
*/

// Answer
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0)
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + " is odd");
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

        // IF num IS DIVISIBLE BY 2 THEN
        //     PRINT {num} is even
        // ELSE
        //     PRINT {num} is odd
        
    }
}
*/