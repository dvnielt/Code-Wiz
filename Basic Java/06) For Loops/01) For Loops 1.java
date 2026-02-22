//import goes here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      // Write your code below this line!
      Scanner sc = new Scanner(System.in);
      // Get the ending number from the user
      int num = sc.nextInt();
      // For loop to print out the numbers starting at 1 and ends at the ending number our user put in. 
      // The numbers printed should all be on the same line separated by a space.
      for (int i = 1; i <= num; i++) {
        // Print the numbers on the same line separated by a space
        System.out.print(i + " ");
      } 
    }
  }

/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for (int i = 1; i <= num; i++) {
        System.out.print(i + " ");
      }
    }
  }
 */