/*
1. Print out the following: The first 3 letters of ___ is ___ where the first blank is the input and the second blank is the first 3 letters of the input

ERRORS
{
    Instructions for this lesson are completely incorrect.
    Correct instructions:
        Given 3 different inputs, print the first 3 characters of each input
}
*/

// Answer
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  	String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    String str3 = sc.nextLine();

    System.out.println(str1.substring(0,3));
    System.out.println(str2.substring(0,3));
    System.out.println(str3.substring(0,3));
  }
}

// Template
/*
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  	String str1 = sc.nextLine();
    String str2 = 
    String str3 = 

    // Print out the first 3 characters of each input
    System.out.println(str1.substring(0,3));
    
  }
}
*/