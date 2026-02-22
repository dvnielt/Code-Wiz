/*
1. Print out the position of the first occurence of "c" in str
2. Print out the position of the first occurence of " " in str
3. Print out the position of the first occurence of the variable target1
4. Print out the position of the first occurence of the variable target2
*/

// Answer
class Main {
    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
        
        //write code here
        System.out.println(str.indexOf("c"));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));
    }
}

// Template
/*
class Main {
    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";
        
        // Print out the position of the first occurence of "c" in str
        System.out.println(str.indexOf("c"));

        // Print out the position of the first occurence of " " in str
        
        // Print out the position of the first occurence of the variable target1
        
        //Print out the position of the first occurence of the variable target2
        
    }
}

*/