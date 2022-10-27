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
        return codename;
    }

}
