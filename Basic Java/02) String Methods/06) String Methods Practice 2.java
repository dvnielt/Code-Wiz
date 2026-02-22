/*
1. Print the substring of the variable str from variable start to variable end
*/

// Answer
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
  	String str = inp.nextLine();
  	int start = inp.nextInt();
  	int end = inp.nextInt();
    // Write your code below this line!
    
    System.out.println(str.substring(start,end + 1));
  }
}

// Template
/*
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
  	String str = inp.nextLine();
  	int start = inp.nextInt();
  	int end = inp.nextInt();

    // Print the substring of the variable str from variable start to variable end
    
  }
}
*/