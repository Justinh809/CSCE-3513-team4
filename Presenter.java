import java.sql.SQLException;
//import java.util.Scanner;     //Testing Purposes reading input without UI

public class Presenter {
    Model model; // create a model inside presenter
    SplashScreen splash; // create a splash screen inside presenter
    // PlayerEntryScreen playerEntry; // waiting for player Entry Screen to be
    // finished
    String codeName; // hold onto codeName if needed
    // Scanner sc; //Testing Purposes Reading in input from cmd while waiting for
    // player entry

    // constructor will initialize the model and each view
    Presenter() {

        splash = new SplashScreen(); // load splash screen
        model = new Model(); // load model
        // playerEntry = new PlayerEntryScreen(this); // I think we must pass the
        // presenter into the player entry screen constructor so
        // it can refer back to

        codeName = "Henry"; // example for now
        // sc = new Scanner(System.in); //testing purposes reading in input without
        // player entry

    }

    public void startApp() {
        splash.showSplash();
        // displaying splash for 3 seconds before we move on
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
        // playerEntry.hide()
        try {
            model.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // gameScreen.show()
        // model.runGame()
    }

    void update() {
        // doesn't look like anything needs to be constantly updated since
    }

    void searchDataBaseForPlayer(String a) {
        // if codename exists at ID a, return true
        if (model.Search(a)) {
            codeName = model.getCodeName(); // I would prefer for the model to be able to flat out get the codename
                                            // using the id, but this should still be fine
            // either store this codename as a variable or pass it straight into player
            // entry
        } else {
            // codeName = playerEntry.getNewCodeName();
            System.out.println("Enter Code Name\n");
            // codeName = sc.nextLine(); //Testing Purposes get a codeName without UI
            model.addCodeName(codeName); // may add the id to this function in the model
        }

    }

    void kill() { // exit game button or something can call this
        System.exit(1);
    }

    // this will be some of the interaction with the views

    // some sort of way to pass the codename into the player entry screen

    //

}