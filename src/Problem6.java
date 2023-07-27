// Import needed classes
import java.awt.geom.Ellipse2D;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        // Construct defined classes variables.
        Scanner keyboard = new Scanner(System.in);
        Ellipse2D.Double ellipse = new Ellipse2D.Double(-70.996, 41.963, 0.060, 0.044);
        // Declare/assign inputted coordinates to double variables.
        double latitude = keyboard.nextDouble();
        double longitude = keyboard.nextDouble();

        // Simple if statement.
        // Use .contains on ellipse with inputted latitude and longitude.
        // To see if those coordinates fall within the ellipse.
        if(ellipse.contains(latitude, longitude)) {
            // If so, print yes on new line.
            System.out.println("yes");
        }
        else {
            // Otherwise, print no on new line.
            System.out.println("no");
        }
    }
}