/*
 Using a for loop, determine whether the integer variable max is prime or not. 
 If the number is prime, print out "prime". If it’s not, print out "not prime". 
 Keep in mind that 1 is NOT a prime number.
You can use the following to find the square root of a number (you may or may not use this): 
 Math.sqrt(x);
 */

 import java.util.Scanner;

 class Main {
   public static void main(String[] args) {
    // Create scanner and store it in a new int variable called n
    

    // If n < 2, print "not prime"
     if (n < 2) {
       System.out.println("not prime");
       return;
     }

    // Create a for loop that iterates through the input
     boolean isPrime = true;
     // Crearte a for loop that iterates through the input
     for (int i = 2; i * i <= n; i++) {
        // If n is divisible by i, set isPrime to false and break the loop
       if () {
         
         break;
       }
     }

    // If isPrime is true, print "prime", else print "not prime"
     if () {
       
     } else {
       
     }
   }
 }

/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n < 2) {
      System.out.println("not prime");
      return;
    }

    boolean isPrime = true;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      System.out.println("prime");
    } else {
      System.out.println("not prime");
    }
  }
}
     
*/