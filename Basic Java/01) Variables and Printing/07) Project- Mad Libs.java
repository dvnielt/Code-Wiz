/*
1. Prompt the user to enter 5 words
2. Create your own Madlibs sentence
*/

// Answer
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String text3 = sc.nextLine();
        String text4 = sc.nextLine();
        String text5 = sc.nextLine();

        System.out.println("We had a " + text1 + " in " + text2 + ", and we " + text3 + " ourselves " + text4 + " until we couldn't " + text5 + " anymore!");
    }
}

// Template
/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Declare a new Scanner
        Scanner sc = new Scanner(System.in);

        // Use the scanner to read input 5 times
        String text1 = 
        String text2 = 
        String text3 = 
        String text4 = 
        String text5 = 

        // Print your on MadLibs sentence
        
    }
}
*/