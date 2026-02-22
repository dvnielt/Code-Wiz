/*
1. If int1 and int2 are equal or word1 and word2 are equal, output "OR"
2. If int1 and int2 are equal and word1 and word2 are equal, output "AND"
3. If int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"

ERRORS
{
    SWAP LINES 6 & 7 WITH LINES 8 & 9
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

    CODE TESTING IS BROKEN, FIRST WORD IS NEVER INPUT
    CHECK TO SEE IF THE STUDENT'S CODE MATCHES THE ANSWER BELOW, AND LET THEM MOVE ON
}
*/

// Answer
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if (int1 == int2 || word1.equals(word2))
        {
            System.out.println("OR");
        }
        if (int1 == int2 && word1.equals(word2))
        {
            System.out.println("AND");
        }
        if (int1 != int2 && !word1.equals(word2))
        {
            System.out.println("NONE");
        }
    }
}

// Template
/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        // IF int1 EQUALS int2 OR word1 EQUALS word2 THEN
        //     PRINT OR

        // IF int1 EQUALS int2 AND word1 EQUALS word2 THEN
        //     PRINT AND

        // IF int1 DOES NOT EQUAL int2 AND word1 DOES NOT EQUAL word2 THEN
        //     PRINT NONE
    }
}
*/