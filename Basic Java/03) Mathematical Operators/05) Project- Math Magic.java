/*
1. Create an int variable called myNumber. Set it equal to any integer other than 0
2. Create an int variable called stepOne. Set it equal to myNumber multiplied by itself
3. Create an int variable called stepTwo. Set it equal to stepOne plus myNumber
4. Create an int variable called stepThree. Set it equal to stepTwo divided by myNumber
5. Create an int variable called stepFour. Set it equal to stepThree plus 17
6. Create an int variable called stepFive. Set it equal to stepFour minus myNumber
7. Create an int variable called stepSix. Set it equal to stepFive divided by 6
8. Print out the value of the last step
*/

// Answer
class Main {
    public static void main(String[] args) {
      int myNumber = 1; // Original number
      int stepOne = myNumber * myNumber;
      int stepTwo = stepOne + myNumber;
      int stepThree = stepTwo / myNumber;
      int stepFour = stepThree + 17;
      int stepFive = stepFour - myNumber;
      int stepSix = stepFive / 6;
  
      System.out.println(stepSix);
    }
}

// Template
/*
class Main {
    public static void main(String[] args) {
      int myNumber = 1; // Original number

      // Set stepOne equal to myNumber multiplied by itself
      int stepOne = 

      // Set stepTwo equal to stepOne plus myNumber
      int stepTwo = 

      // Set stepThree equal to stepTwo divided by myNumber
      int stepThree = 

      // Set stepFour equal to stepThree plus 17
      int stepFour = 

      // Set stepFive equal to stepFour minus myNumber
      int stepFive = 

      // Set stepSix equal to stepFive divided by 6
      int stepSix = 

      // Print out stepSix
      
    }
}
*/