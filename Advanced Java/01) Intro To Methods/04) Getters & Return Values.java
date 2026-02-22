/*
 * Just an example lesson on how to use getters and return values.
 */

 // Template and answer
 class Main {
    public static void main(String[] args) {
      print("Nathan");
      
      print(add(5, 7) + "");
    }
    
    public static void print(String thingToPrint){
      System.out.println(thingToPrint);
    }
    
    public static int add(int value1, int value2){
      return value1 + value2;
    }
    
  }