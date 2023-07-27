import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        // Declare starting variables
        Scanner keyboard = new Scanner(System.in);
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        // For loop to convert all integers between num1 and num2 to strings.
            // So we can read each character within the String.
        // Then run each through function isPalindrome.
        // If it returns true, print num in its own line.
        for(int i = num1; i<= num2; i++) {
            String num = ""+i;
            if(isPalindrome(num)) {
                System.out.println(num);
            }
        }
    }
    // Function takes in each string num.
    public static boolean isPalindrome(String num) {
        // for loop used to analyze each char within the num string.
        for (int i = 0; i < num.length(); i++) {
            // Do palindrome math to see if the char at the right positions match.
            // If they don't match, return false.
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                // Return is MORE powerful than a break.
                // We know a break takes us out of a loop.
                // Return takes us out of an entire function.
                return false;
            }
        }
        // Otherwise, return true.
        return true;
    }
}