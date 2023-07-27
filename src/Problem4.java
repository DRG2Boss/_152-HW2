// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Declare initial variables
        Scanner keyboard = new Scanner(System.in);
        int totalValue = 0;
        // Need loop until UNKNOWN CRITERIA is met
        // Aka good ol while loop
        while(true) {
            // Want to read each character in the bucket.
            // Start by breaking it down into strings.
            // Then analyze each character within each string via for loop
            // If certain characters are encountered, add the specified amount to existing totalValue.
            String clumpOfBucket = keyboard.next();
            for(int i = 0; i < clumpOfBucket.length(); i++) {
                if(clumpOfBucket.charAt(i) == '@') {
                    totalValue = totalValue + 1000;
                }
                else if(clumpOfBucket.charAt(i) == '$') {
                    totalValue = totalValue + 500;
                }
                else if(clumpOfBucket.charAt(i) == '*') {
                    totalValue = totalValue + 300;
                }
            }
            // Otherwise, if we encounter a string that starts with a dash, break the while loop.
            if(clumpOfBucket.charAt(0) == '-') {
                break;
            }
        }
        // Finally, print the final totalValue in its own line.
        System.out.println("$" + totalValue);
    }
}
