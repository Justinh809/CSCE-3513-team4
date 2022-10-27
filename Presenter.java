import java.sql.*;
//import java.util.Scanner;     //Testing Purposes reading input without UI
import java.util.List;
import javax.swing.JTextField;

public class Presenter {
    Model model; // create a model inside presenter
    SplashScreen splash; // create a splash screen inside presenter
    PlayerEntry playerEntry;
    GameAction gameAction;
    

    // constructor will initialize the model and each view
    Presenter() {

        splash = new SplashScreen(); // load splash screen
        model = new Model(); // load model
        playerEntry = new PlayerEntry(this); // Load player entry screen with this as paramater

    }

    public void startApp() {
        splash.showSplash();
        // displaying splash for 3 seconds before we move on
        try {
            Thread.sleep(1000); // I believe this makes the main thread wait 3 seconds
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        splash.hideSplash();
        playerEntry.showPlayerEntry();
    }

    public void startGame() { // after the players are entered and the start button is pressed
        playerEntry.buildListForPresenter();
        addPlayersToList(playerEntry.toBePassed);
        playerEntry.hidePlayerEntry();
        System.out.println("Red Team: ");
        System.out.println(model.acitveRedPlayers);
        System.out.println("Green Team: ");
        System.out.println(model.acitveGreenPlayers);
        gameAction.showGameAction();
        try {
            
            model.connection.close();
            //System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // model.runGame()
    }

    void update() {
        // doesn't look like anything needs to be constantly updated since
    }

    public int searchDataBaseForPlayer(JTextField id_field, JTextField codename_field) {
        // Checks if the id is only digits
        if (id_field.getText().matches("\\d+")) {
            if (!model.idList.contains(id_field.getText())) // Checks if the id is already in use
            {
                model.idList.add(id_field.getText());
                id_field.setEnabled(false);
                // if codename exists at the input ID, return true
                if (model.Search(id_field.getText())) {
                    codename_field.setText(model.getCodeName()); // set the corresponding codename to the codename
                                                                 // matching id
                    codename_field.setEnabled(false); // make the codename field uneditable
                    return 0;
                } else {
                    return 1; // Codename not present, initiates request for a new one from user
                }
            } else {
                return 2; // ID is already in use. Prompts for a new entry
            }
        } else {
            return 3; // ID is a non integer. Prompts for a new entry
        }

    }

    public Boolean addCodeName(JTextField id_field, JTextField codename_field) {
        if (codename_field.getText().matches("^[a-zA-Z]+$")) {
            model.addCodeName(id_field.getText(), codename_field.getText());
            codename_field.setEnabled(false); // make the codename field uneditable
            return true;
        } else {
            return false;
        }

    }

    public Player createPlayer(int id, String codename, boolean redTeam)
    {
        Player p = new Player(id, codename, redTeam);
        return p;
    }

    void addPlayersToList(List<List<String>> list)
    {
        boolean redTeam;
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).get(2) == "red")
            {
                redTeam = true;
            }
            else
            {
                redTeam = false;
            }
            Player p = createPlayer(Integer.parseInt(list.get(i).get(0)), list.get(i).get(1), redTeam);
            model.addPlayer(p, redTeam);
        }
    }

    void kill() { // exit game button or something can call this
        System.exit(1);
    }

}