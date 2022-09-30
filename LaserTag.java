import java.sql.SQLException;
import java.util.*;

/*
 * Laser Tag for Software Engineering (CSCE3513) (TEAM 4)
 * Date: 9/16/2022
 * 
 * The main flow program for the laser tag project.
 */

public class LaserTag extends Thread {
    Presenter presenter;
    Scanner sc;

    LaserTag() {
        presenter = new Presenter();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {

        /*
         * SplashScreen splash = new SplashScreen();
         * splash.showSplash();
         * Model model = new Model();
         * try {
         * Thread.sleep(3000); // wait for 3 seconds
         * } catch (Exception e) {
         * e.printStackTrace();
         * System.exit(1);
         * }
         * splash.hideSplash();
         * 
         * PlayerEntry playerEntry = new PlayerEntry();
         * playerEntry.showPlayerEntry();
         */
        LaserTag laserTag = new LaserTag();
        laserTag.run();
    }

    public void run() {
        presenter.startApp();
        System.out.println("Enter ID\n");
        presenter.searchDataBaseForPlayer(sc.nextLine());
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