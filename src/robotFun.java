// Import Robot class
import java.awt.Robot;
import java.awt.event.InputEvent;

public class robotFun {
    // Setup main function per homework details
    public static void main(String[] args) throws java.awt.AWTException {
        // declare Robot object and assign to variable "robot"
        Robot robot = new Robot();
        // Define x,y coordinates on my screen
        int x = 520;
        int y = 1050;
        // Series of basic Robot functions to move mouse to those coordinates
        // And press/release the left mouse button.
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}