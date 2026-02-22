/* 
* Method Practice with Strings and indexes of Strings *
=====================================================
Instructions:
* Create a method that:
    - Returns: a char
    - Name: getChar
    - Parameters:
        - a String called “word”
        - an integer called “index”
* Then, starting on line 4, write code that will return the character in “word” at the index “index”

Examples:
getChar("hello",1) ==> ‘e’ 
*/

// Template
class Main {
	
	// Define the getChar method
	{
		
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(getChar("hello",1)); //should be 'e'
	}
}

// Answer
/*
class Main {
	
	public static char getChar(String word, int index){
		return word.charAt(index);
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(getChar("hello",1)); //should be 'e'
	}
}
*/