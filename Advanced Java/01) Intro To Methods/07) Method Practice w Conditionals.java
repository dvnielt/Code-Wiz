/*Instructions:
1. Write a method header on line two with the following specs:
    - Returns: a boolean
    - Name: bothEven
    - Parameters:
        - an integer called “num1”
        - an integer called “num2”
2. Then, write code that will return true if both num1 and num2 are even. Return false otherwise.
* Examples:
    - bothEven(4,6) ==> true
    - bothEven(3,4) ==> false
    - bothEven(-1,1) ==> false
* HINT(S)
    - Even numbers are divisble by 2, meaning that the remainder will be 0 if divided by 2 (use % module)
    - You are checking to see IF num1 AND num2 are even 
*/

// Template
class Main {
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(bothEven(8,6)); //should be true
		System.out.println(bothEven(5,6)); //should be false
	}
	
	// Define the bothEven method
	
}

// Answer
/*
class Main {
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(bothEven(8,6)); //should be true
		System.out.println(bothEven(5,6)); //should be false
	}
	
	// Define the bothEven method
    public static boolean bothEven(int num1, int num2){
        return num1 % 2 == 0 && num2 % 2 == 0;
    }
}
*/