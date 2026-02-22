/*
 * The code provided in your main method will take in five integers and save them into an array called arr. 
 * Print out the contents of the array using the following example as a guideline:
 * [1,2,3,4,5] prints: 1 2 3 4 5
 */

 // import scanner


 class Main {
  public static void main(String[] args) {
    // Create a new scanner object
    
    // Create a new array called arr
    
    // Create a for loop that iterates through the array and asks the user to enter the numbers
    
    // Print out the contents of the array in curly braces and separated by commas
    // HINT: use a for loop and an if statement to print the commas and braces
    
  }
}

/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
      for(int i = 0; i < 5; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.print("{");
      for(int i = 0; i < 5; i++) {
        System.out.print(arr[i]);
        if(i < 4) {
          System.out.print(",");
        } else {
          System.out.print("}");
        }
      }
    }
  }