/*
1. Write a print statement that prints out a substring of str starting at index 5 and going to the end
2. Write a print statement that prints out a substring of str starting at index 0 and ending at index 1
3. Write a print statement that prints out a substring of str that contains “am”
4. Write a print statement that prints out a substring of str that contains “on M”

ERRORS
{
    For the first case, the substring must be end at the end of the word, not the end of the sentence
}
*/

// Answer
class Main {
    public static void main(String[] args) {
        String str = "I am Iron Man";

        // Write your code below this line!
        System.out.println(str.substring(5,9));
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(7,11));
    }
}

// Template
/*
class Main {
    public static void main(String[] args) {
        String str = "I am Iron Man";

        // Write a print statement that prints out a substring of str starting at index 5 and going to the end
        System.out.println(str.substring(5));

        // Write a print statement that prints out a substring of str starting at index 0 and ending at index 1

        // Write a print statement that prints out a substring of str that contains “am”
        System.out.println(str.substring(2,4));

        // Write a print statement that prints out a substring of str that contains “on M”

    }
}

*/