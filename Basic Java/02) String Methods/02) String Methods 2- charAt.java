/*
1. Print out the character in the 5th index of the String str
2. Print out the character in the 8th index of the String str
3. Print out the character in the 1st index of the String str
4. Print out the character in the i-th index of the String str
*/

// Answer
class Main {
    public static void main(String[] args) {
        String str = "boopity bop";
        int i = 10;
        
        // write code here
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(i));
    }
}

// Template
/*
class Main {
    public static void main(String[] args) {
        String str = "boopity bop";
        int i = 10;
        
        // Print out the character in the 5th index of the String str
        System.out.println(str.charAt(5));

        // Print out the character in the 8th index of the String str

        // Print out the character in the 1st index of the String str

        // Print out the character in the i-th index of the String str
        
    }
}
*/