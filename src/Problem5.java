// Base setup including importing Scanner / initializing it with variable keyboard.
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        // Declare initial variables
        double row1 = 0;
        double row2 = 0;
        Scanner keyboard = new Scanner(System.in);
        // For loop ran 5 times from 4-0 to isolate the position of row |c| in first photo.
        // NOTE car is driving UPWARDS so the higher the line number, the lower the position number.
        for(double section1 = 4; section1 >= 0; section1--) {
            String row = keyboard.nextLine();
            if(row.equals("|c|")) {
                row1 = section1;
            }
        }
        // Random keyboard.nextLine needed here to IGNORE row of "-" in counting.
        keyboard.nextLine();
        // Second for loop ran 5 times BACKWARDS from 4-0 since car is driving upwards.
        for(double section2 = 4; section2 >= 0; section2--) {
            String row = keyboard.nextLine();
            if(row.equals("|c|")) {
                row2 = section2;
            }
        }
        // Do a bunch of simple math to calculate amount of mph over 30mph.
        double dist = (row2 - row1) * 0.01;
        double time = (double) 1 / 3600;
        int speed = (int) (dist / time);
        int excessSpeed = speed - 30;
        // If there is an excessSpeed above 0, calculate a fine and output it.
        if(excessSpeed > 0) {
            int fine = excessSpeed * 10;
            System.out.println("$"+fine);
        }
        // Otherwise, the fine will be a flat $0. Output that.
        else {
            System.out.println("$0");
        }
    }
}
