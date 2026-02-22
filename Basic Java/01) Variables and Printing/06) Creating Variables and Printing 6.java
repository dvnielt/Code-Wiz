/*
1. Prompt the user to enter 5 words
2. Print out each word that the user entered
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

    System.out.println(text1);
    System.out.println(text2);
    System.out.println(text3);
    System.out.println(text4);
    System.out.println(text5);
  }
}

// Template
/*
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // Declare a new scanner
    Scanner sc = new Scanner(System.in);

    // Use the scanner to read input 5 times
    String text1 = sc.nextLine();
    String text2 = 
    String text3 = 
    String text4 = 
    String text5 = 

    // Print out all 5 inputs
    System.out.println(text1);
    
  }
}
*/