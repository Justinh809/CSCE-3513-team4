
/*
 * Laser Tag for Software Engineering (CSCE3513) (TEAM 4)
 * Date: 9/16/2022
 * 
 * The main flow program for the laser tag project.
 */
import javax.swing.JFrame;
//import java.sql.SQLException;     // We don't have to do anything in SQL in this class for now
//import java.util.Scanner;     //Testing Purposes Reading input without UI
// I believe both of these import statements are unnecessary here 

//removed extends thread. Seems fine so far
public class LaserTag extends JFrame {
    Presenter presenter;
    // Scanner sc; //Testing Purpose allowing cmd line input

    LaserTag() {
        presenter = new Presenter();
        // sc = new Scanner(System.in); // Testing Purposes allowing cmd line input

    }

    // Main function will create the laserTag game and run it
    public static void main(String[] args) {
        LaserTag laserTag = new LaserTag();
        laserTag.run();
    }

    public void run() {
        presenter.startApp();
        while (true) {
            presenter.update(); // update anything that needs to be updated

            // slow down / not sure if this is needed or even timed right
            try {
                Thread.sleep(25);
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}