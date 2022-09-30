import java.sql.SQLException;
import java.util.Scanner;

public class Presenter {
    Model model;
    SplashScreen splash;
    // PlayerEntryScreen playerEntry;
    boolean connectionMade;
    String codeName;
    Scanner sc;

    // constructor will initialize the model and each view
    Presenter() {

        splash = new SplashScreen();
        model = new Model();
        // playerEntry = new PlayerEntryScreen(this); // I think we must pass the
        // presenter into the player entry screen constructor so
        // it can refer back to
        // cinnectionMade = false;
        codeName = "Henry";
        sc = new Scanner(System.in);

    }

    public void startApp() {
        splash.showSplash();
        try {
            Thread.sleep(3000); // I believe this makes the main thread wait 3 seconds
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        splash.hideSplash();
        // playerEntry.show(); // not sure if this is how we plan on showing the next
        // screen make sure all functionality is off if not shown
    }

    public void startGame() { // after the players are entered and the start button is pressed
        // gameScreen.show()
        // model.runGame()
    }

    void update() {
        // doesn't look like anything needs to be constantly updated since
    }

    void searchDataBaseForPlayer(String a) {
        // if codename exists at ID a, return true
        try {
            if (model.Search(a)) {
                codeName = model.getCodeName(); // I would prefer for the model to be able to flat out get the codename
                                                // using the id, but this should still be fine
                // either store this codename as a variable or pass it straight into player
                // entry
            } else {
                // codeName = playerEntry.getNewCodeName();
                System.out.println("Enter Code Name\n");
                codeName = sc.nextLine();
                model.addCodeName(codeName); // may add the id to this function in the model
            }
            model.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void kill() { // exit game button or something can call this
        System.exit(1);
    }

    // this will be some of the interaction with the views

    // some sort of way to pass the codename into the player entry screen

    //

}