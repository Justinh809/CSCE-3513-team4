/*
 * Laser Tag for Software Engineering (CSCE3513) (TEAM 4)
 * Date: 9/16/2022
 * 
 * The main flow program for the laser tag project.
 */

public class LaserTag
{
    public static void main(String[] args)
    {
        SplashScreen splash = new SplashScreen();
        splash.showSplash();
        try {
            Thread.sleep(3000); // wait for 3 seconds
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        splash.hideSplash();

        PlayerEntry playerEntry = new PlayerEntry();
        playerEntry.showPlayerEntry();

    }
}
