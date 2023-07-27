// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Take in two words by user and ensure they are both of SAME casing.
        String word1 = keyboard.next().toLowerCase();
        String word2 = keyboard.next().toLowerCase();

        // If the length of the two words do not match, tell user and end program.
        if(word1.length() != word2.length()) {
            System.out.println("These words are not the same length. Please try again.");
            return;
        }
        // Otherwise use for loop to analyze each character in each word one-by-one.
        for(int i = 0; i < word1.length(); i++) {
            char letter1 = word1.charAt(i);
            char letter2 = word2.charAt(i);
            // If the characters at each position are equal, print that letter.
            if(letter1 == letter2) {
                System.out.println(letter1);
            }
        }
    }
}
