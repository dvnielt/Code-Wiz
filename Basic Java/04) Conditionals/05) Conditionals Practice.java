import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  	int temperature = sc.nextInt();
    boolean isRaining = sc.nextBoolean();
    
    // Write your code below this line!
    // Check if temperature is below freezing (< 0)
    if () {
        System.out.println();
    }
    // Check if temperature is extremely hot (>= 90)
    else if () {
        System.out.println();
    }
    // Check if temperature is between 70 and 90
    else if () {
        // If it's raining, print "rainy and hot"
        if () {
            System.out.println();
        }
        // Otherwise, print "mildly hot"
        else {
            System.out.println();
        }
    }
    // Check if temperature is between 60 and 70
    else if () {
        System.out.println();
    }
    // Handle temperatures below 60 (but above 0)
    else {
        // If it's raining, print "rainy and cold"
        
        // Otherwise, print "cold"
        
    }
  
  }
}

/* 
import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  	int temperature = sc.nextInt();
    boolean isRaining = sc.nextBoolean();
    
    if (temperature < 0) {
        System.out.println("The weather is below freezing!");
    }
    else if (temperature >= 90) {
        System.out.println("The weather is extremely hot!");
    }
    else if (temperature > 70 && temperature < 90) {
        if (isRaining) {
            System.out.println("The weather is rainy and hot");
        }
        else {
            System.out.println("The weather is mildly hot.");
        }
    }
    else if (temperature > 60 && temperature <= 70) {
        System.out.println("The weather is neutral.");
    }
    else {
        if (isRaining) {
            System.out.println("The weather is rainy and cold");
        }
        else {
            System.out.println("The weather is cold!");
        }
    }
  
  }
}
*/