// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Take in the word and sentence from user.
        String word = keyboard.nextLine().toLowerCase();
        String sentence = keyboard.nextLine().toLowerCase();
        // Start an integer variable at 0.
        int wordCount = 0;
        // Take the user's sentence and split it into an array where each word is its own element.
        String[] sentenceWords = sentence.split(" ");

        // Use for loop to run through each element in that array to see if it matches the entered word.
        for(int i = 0; i < sentenceWords.length; i++) {
            // If the word matches a particular word within that sentence, add one to wordCount integer.
            if(word.equals(sentenceWords[i])) {
                wordCount++;
            }
        }
        // Finally, print out wordCount.
        System.out.println(wordCount);
    }
}