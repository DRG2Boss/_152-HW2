// Isaiah Marshall
// Comp 152 Summer Session II
// Homework 2
// Due 7/26/23 11:59pm

// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // System.out.print("Enter a word: ");
        // Have user input a word.
        String word = keyboard.next();
        while(true) {
            // System.out.print("Enter integers within the scope of the word's index. Enter an integer out of scope to stop: ");
            // Have user input a series of integers.
            int charPosition = keyboard.nextInt();
            // If the integer is out of scope of the index of the entered word, break the while loop.
            if(charPosition < 0 || charPosition >= word.length()) {
                break;
            }
            // Otherwise, print the character at the position specified by the user and rerun the loop.
            else {
                System.out.println(word.charAt(charPosition));
            }
        }
    }
}