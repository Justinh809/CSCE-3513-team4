import java.sql.*;
//import java.util.Scanner;     //Testing Purposes reading input without UI

import javax.swing.JTextField;

public class Presenter {
    Model model; // create a model inside presenter
    SplashScreen splash; // create a splash screen inside presenter
    PlayerEntry playerEntry; // waiting for player Entry Screen to be
    // finished
    String codeName; // hold onto codeName if needed
    // Scanner sc; //Testing Purposes Reading in input from cmd while waiting for
    // player entry

    // constructor will initialize the model and each view
    Presenter() {

        splash = new SplashScreen(); // load splash screen
        model = new Model(); // load model
        playerEntry = new PlayerEntry(this); // I think we must pass the
        // presenter into the player entry screen constructor so
        // it can refer back to

        codeName = "Bravo"; // example for now
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
        playerEntry.showPlayerEntry(); // not sure if this is how we plan on showing the next
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

    public Boolean searchDataBaseForPlayer(JTextField id_field, JTextField codename_field) {
        // if codename exists at the input ID, return true
        if(model.Search(id_field.getText())) {
            codename_field.setText(model.getCodeName()); // set the corresponding codename to the codename matching id
            codename_field.setEnabled(false); // make the codename field uneditable
            return true;
        }
        else
        {
            return false;
        }

    }

    void addCodeName(JTextField id_field, JTextField codename_field)
    {
        model.addCodeName(id_field.getText(), codename_field.getText());
        codename_field.setEnabled(false); // make the codename field uneditable
    }

    void kill() { // exit game button or something can call this
        System.exit(1);
    }

    // this will be some of the interaction with the views

    // some sort of way to pass the codename into the player entry screen

    //

}