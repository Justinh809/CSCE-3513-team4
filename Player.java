/*
 * Player for Software Engineering (CSCE3513) (TEAM 4)
 * Date: 10/28/2022
 * 
 * Defines the player class 
 */

public class Player {
    private String codename;
    private int id;
    private int score;
    private boolean redTeam; // red team is true green is false

    Player(int givenId, String givenCodename, boolean givenTeam) {
        codename = givenCodename;
        id = givenId;
        redTeam = givenTeam;
        score = 0;
    }

    // Not used in sprint 3
    public void increaseScore(int points) {
        score += points;
    }

    public String getCodename() {
        return codename;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    // red -> true , green -> false
    public boolean isRedTeam() {
        return redTeam;
    }

    @Override
    public String toString()
    {
        String team = "";
        if(redTeam)
        {
            team = "red";
        }
        else
        {
            team = "green";
        }
        return "ID: "+ id + " Codename: " + codename + " Team: " + team;
    }

}
