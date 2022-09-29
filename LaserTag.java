import java.sql.SQLException;

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
        Model model = new Model();
        try {
            Thread.sleep(3000); // wait for 3 seconds
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        splash.hideSplash();

        // TODO: Add code to start player entry screen here

        try {
            //If the query is successful return the codename to the view.
            if(model.Search("2"))
            {
                String codeName = model.getCodeName();
                //Example Code
                //playerEntry.receiveCodeName(codeName);
            }
            else
            {
                //Example Code
                // String codeName = playerEntry.sendCodeName();
                model.addCodeName("Magnum");
            }
            model.connection.close();
            System.out.println("Connection is Closed");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.exit(1);
    }
}