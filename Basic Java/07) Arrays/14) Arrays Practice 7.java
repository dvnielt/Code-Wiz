/*
 * Take in 5 Strings and store them in an array
 * Print out the longest string in the array
 * Print out the shortest string in the array
 * Print out the string with the most vowels (Upper and lowercase!)
 */

 // import scanner
 import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
      // Create a new scanner object
      
      // Create a new array called arr with a size of 5
      
      // Create a for loop that iterates through that array and asks the user to enter the strings one by one
      for() {
        arr[i] = 
      }
      // Create a variable called longest, shortest, and mostVowels and set them to the first element of the array
      String longest = 
      String shortest = 
      String mostVowels = 
      // Create a for loop that iterates through the array and finds the longest string
      for() {
        if() {
          
        }
      }
      // Create a for loop that iterates through the array and finds the shortest string
      for() {
        if() {
          
        }
      }
      // Count vowels in the first string to use for comparison
      int mostVowelsCount = 0;
      for(int j = 0; j < mostVowels.length(); j++) {
        char c = Character.toLowerCase(mostVowels.charAt(j));
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          mostVowelsCount++;
        }
      }
      // Create a for loop that iterates through the array and finds the string with the most vowels
      for() {
        int vowels = 0;
        for(int j = 0; j < arr[i].length(); j++) {
          char c = Character.toLowerCase(arr[i].charAt(j));
          if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowels++;
          }
        }
        // If the current string has more vowels than the previous string with the most vowels, set the most vowels string to the current string and the most vowels count to the current count
        if() {
          
        }
      }
      // Print out the longest, shortest, and most vowels strings
      
    }
 }

 /*
  import java.util.Scanner;
  class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] arr = new String[5];
      for(int i = 0; i < 5; i++) {
        arr[i] = sc.nextLine();
      }
    }
  }
  String longest = arr[0];
  String shortest = arr[0];
  String mostVowels = arr[0];
  for(int i = 0; i < 5; i++) {
    if(arr[i].length() > longest.length()) {
      longest = arr[i];
    }
  }
  for(int i = 0; i < 5; i++) {
    if(arr[i].length() < shortest.length()) {
      shortest = arr[i];
    }
  }
  int mostVowelsCount = 0;
  for(int j = 0; j < mostVowels.length(); j++) {
    char c = Character.toLowerCase(mostVowels.charAt(j));
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
      mostVowelsCount++;
    }
  }
  for(int i = 0; i < 5; i++) {
    int vowels = 0;
    for(int j = 0; j < arr[i].length(); j++) {
      char c = Character.toLowerCase(arr[i].charAt(j));
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        vowels++;
      }
    }
    if(vowels > mostVowelsCount) {
      mostVowels = arr[i];
      mostVowelsCount = vowels;
    }
  }
  System.out.println(longest);
  System.out.println(shortest);
  System.out.println(mostVowels);
  */