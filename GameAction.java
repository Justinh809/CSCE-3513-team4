/*
 * Game Action Screen for Software Engineering (CSCE3513) (TEAM 4)
 * Date: 10/9/2022
 * Team 4
 * 
 * Game action screen for showing the events of the game and the leaderboard of players for each team.
*/

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
// import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Collections;
import javax.swing.SwingConstants;
import java.util.Timer;

// import javax.swing.plaf.DimensionUIResource;
// import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import java.util.List;
import java.util.ArrayList;

public class GameAction
{
	JFrame frame;
    Presenter presenter;
	JPanel timer_panel;
	Timer myTimer = new Timer();
	Timer flashTimer = new Timer();
	JPanel live_action_panel;
	JPanel red_score_panel;
	JPanel green_score_panel;

    JLabel timer_label;
    JLabel game_action_1;
    JLabel game_action_2;
    JLabel game_action_3;
    JLabel game_action_4;
    JLabel game_action_5;
    JLabel game_action_6;
    JLabel game_action_7;
    JLabel game_action_8;
    JLabel game_action_9;
    JLabel game_action_10;

    JLabel red_team_score;
	JLabel red_team_label;
    JLabel red_player_1;
    JLabel red_player_2;
    JLabel red_player_3;
    JLabel red_player_4;
    JLabel red_player_5;
    JLabel red_player_1_score;
    JLabel red_player_2_score;
    JLabel red_player_3_score;
    JLabel red_player_4_score;
    JLabel red_player_5_score;

    JLabel green_team_score;
	JLabel green_team_label;
    JLabel green_player_1;
    JLabel green_player_2;
    JLabel green_player_3;
    JLabel green_player_4;
    JLabel green_player_5;
    JLabel green_player_1_score;
    JLabel green_player_2_score;
    JLabel green_player_3_score;
    JLabel green_player_4_score;
    JLabel green_player_5_score;
    
	ArrayList<JLabel> red_player_labels = new ArrayList<JLabel>();
	ArrayList<JLabel> green_player_labels = new ArrayList<JLabel>();
	ArrayList<JLabel> red_score_labels = new ArrayList<JLabel>();
	ArrayList<JLabel> green_score_labels = new ArrayList<JLabel>();
    ArrayList<JLabel> game_action_labels = new ArrayList<JLabel>();

    public GameAction(Presenter p)
    {
        presenter = p;

        frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
        frame.setTitle("Game Action");
		
		timer_panel = new JPanel();
		timer_panel.setBackground(Color.BLACK);
		timer_panel.setBounds(0, 612, 1264, 70);
		frame.getContentPane().add(timer_panel);
		
		timer_label = new JLabel("LOADING GAME...");
		timer_label.setForeground(Color.WHITE);
		timer_label.setFont(new Font("Rockwell", Font.PLAIN, 50));
		timer_panel.add(timer_label);
		
		live_action_panel = new JPanel();
		live_action_panel.setBackground(new Color(10, 10, 44));
		live_action_panel.setBounds(0, 306, 1264, 306);
		frame.getContentPane().add(live_action_panel);
		live_action_panel.setLayout(null);
		
		game_action_1 = new JLabel("");
		game_action_1.setForeground(Color.WHITE);
		game_action_1.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_1.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_1.setBounds(10, 10, 1244, 27);
		live_action_panel.add(game_action_1);
        game_action_labels.add(game_action_1);
		
		game_action_2 = new JLabel("");
		game_action_2.setForeground(Color.WHITE);
		game_action_2.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_2.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_2.setBounds(10, 38, 1244, 27);
		live_action_panel.add(game_action_2);
        game_action_labels.add(game_action_2);
		
		game_action_3 = new JLabel("");
		game_action_3.setForeground(Color.WHITE);
		game_action_3.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_3.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_3.setBounds(10, 66, 1244, 27);
		live_action_panel.add(game_action_3);
        game_action_labels.add(game_action_3);
		
		game_action_4 = new JLabel("");
		game_action_4.setForeground(Color.WHITE);
		game_action_4.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_4.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_4.setBounds(10, 94, 1244, 27);
		live_action_panel.add(game_action_4);
        game_action_labels.add(game_action_4);
		
		game_action_5 = new JLabel("");
		game_action_5.setForeground(Color.WHITE);
		game_action_5.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_5.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_5.setBounds(10, 122, 1244, 27);
		live_action_panel.add(game_action_5);
        game_action_labels.add(game_action_5);
		
		game_action_6 = new JLabel("");
		game_action_6.setForeground(Color.WHITE);
		game_action_6.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_6.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_6.setBounds(10, 150, 1244, 27);
		live_action_panel.add(game_action_6);
        game_action_labels.add(game_action_6);
		
		game_action_7 = new JLabel("");
		game_action_7.setForeground(Color.WHITE);
		game_action_7.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_7.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_7.setBounds(10, 178, 1244, 27);
		live_action_panel.add(game_action_7);
        game_action_labels.add(game_action_7);
		
		game_action_8 = new JLabel("");
		game_action_8.setForeground(Color.WHITE);
		game_action_8.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_8.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_8.setBounds(10, 206, 1244, 27);
		live_action_panel.add(game_action_8);
        game_action_labels.add(game_action_8);
		
		game_action_9 = new JLabel("");
		game_action_9.setForeground(Color.WHITE);
		game_action_9.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_9.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_9.setBounds(10, 234, 1244, 27);
		live_action_panel.add(game_action_9);
        game_action_labels.add(game_action_9);
		
		game_action_10 = new JLabel("");
		game_action_10.setForeground(Color.WHITE);
		game_action_10.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_10.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_10.setBounds(10, 262, 1244, 27);
		live_action_panel.add(game_action_10);
        game_action_labels.add(game_action_10);
		
		red_score_panel = new JPanel();
		red_score_panel.setBackground(Color.BLACK);
		red_score_panel.setBounds(0, 0, 632, 306);
		frame.getContentPane().add(red_score_panel);
		red_score_panel.setLayout(null);
		
		red_team_label = new JLabel("RED TEAM");
		red_team_label.setForeground(Color.RED);
		red_team_label.setBackground(Color.BLACK);
		red_team_label.setBounds(200, 5, 300, 40);
		red_team_label.setFont(new Font("Rockwell", Font.BOLD, 25));
		red_score_panel.add(red_team_label);
		
		red_player_1 = new JLabel("");
		red_player_1.setForeground(Color.RED);
		red_player_1.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_1.setBounds(10, 56, 248, 40);
		red_score_panel.add(red_player_1);
		red_player_labels.add(red_player_1);
		
		red_player_2 = new JLabel("");
		red_player_2.setForeground(Color.RED);
		red_player_2.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_2.setBounds(10, 90, 248, 40);
		red_score_panel.add(red_player_2);
		red_player_labels.add(red_player_2);
		
		red_player_3 = new JLabel("");
		red_player_3.setForeground(Color.RED);
		red_player_3.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_3.setBounds(10, 125, 248, 40);
		red_score_panel.add(red_player_3);
		red_player_labels.add(red_player_3);
		
		red_player_4 = new JLabel("");
		red_player_4.setForeground(Color.RED);
		red_player_4.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_4.setBounds(10, 160, 248, 40);
		red_score_panel.add(red_player_4);
		red_player_labels.add(red_player_4);
		
		red_player_5 = new JLabel("");
		red_player_5.setForeground(Color.RED);
		red_player_5.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_5.setBounds(10, 195, 248, 40);
		red_score_panel.add(red_player_5);
		red_player_labels.add(red_player_5);
		
		red_player_1_score = new JLabel("");
		red_player_1_score.setForeground(Color.RED);
		red_player_1_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_1_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_1_score.setBounds(439, 56, 108, 40);
		red_score_panel.add(red_player_1_score);
		red_score_labels.add(red_player_1_score);
		
		red_player_2_score = new JLabel("");
		red_player_2_score.setForeground(Color.RED);
		red_player_2_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_2_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_2_score.setBounds(439, 90, 108, 40);
		red_score_panel.add(red_player_2_score);
		red_score_labels.add(red_player_2_score);
		
		red_player_3_score = new JLabel("");
		red_player_3_score.setForeground(Color.RED);
		red_player_3_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_3_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_3_score.setBounds(439, 125, 108, 40);
		red_score_panel.add(red_player_3_score);
		red_score_labels.add(red_player_3_score);
		
		red_player_4_score = new JLabel("");
		red_player_4_score.setForeground(Color.RED);
		red_player_4_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_4_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_4_score.setBounds(439, 160, 108, 40);
		red_score_panel.add(red_player_4_score);
		red_score_labels.add(red_player_4_score);
		
		red_player_5_score = new JLabel("");
		red_player_5_score.setForeground(Color.RED);
		red_player_5_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_5_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_5_score.setBounds(439, 195, 108, 40);
		red_score_panel.add(red_player_5_score);
		red_score_labels.add(red_player_5_score);
		
		red_team_score = new JLabel("0000");
		red_team_score.setForeground(Color.RED);
		red_team_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_team_score.setFont(new Font("Rockwell", Font.BOLD, 35));
		red_team_score.setBounds(514, 258, 108, 37);
		red_score_panel.add(red_team_score);
		
		green_score_panel = new JPanel();
		green_score_panel.setLayout(null);
		green_score_panel.setBackground(Color.BLACK);
		green_score_panel.setBounds(632, 0, 632, 306);
		frame.getContentPane().add(green_score_panel);
		
		green_team_label = new JLabel("GREEN TEAM");
		green_team_label.setForeground(new Color(0, 128, 0));
		green_team_label.setFont(new Font("Rockwell", Font.BOLD, 25));
		green_team_label.setBounds(200, 5, 300 , 40);
		green_score_panel.add(green_team_label);
		
		green_player_1 = new JLabel("");
		green_player_1.setForeground(new Color(0, 128, 0));
		green_player_1.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_1.setBounds(10, 56, 248, 40);
		green_score_panel.add(green_player_1);
		green_player_labels.add(green_player_1);
		
		green_player_2 = new JLabel("");
		green_player_2.setForeground(new Color(0, 128, 0));
		green_player_2.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_2.setBounds(10, 90, 248, 40);
		green_score_panel.add(green_player_2);
		green_player_labels.add(green_player_2);
		
		green_player_3 = new JLabel("");
		green_player_3.setForeground(new Color(0, 128, 0));
		green_player_3.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_3.setBounds(10, 125, 248, 40);
		green_score_panel.add(green_player_3);
		green_player_labels.add(green_player_3);
		
		green_player_4 = new JLabel("");
		green_player_4.setForeground(new Color(0, 128, 0));
		green_player_4.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_4.setBounds(10, 160, 248, 40);
		green_score_panel.add(green_player_4);
		green_player_labels.add(green_player_4);
		
		green_player_5 = new JLabel("");
		green_player_5.setForeground(new Color(0, 128, 0));
		green_player_5.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_5.setBounds(10, 195, 248, 40);
		green_score_panel.add(green_player_5);
		green_player_labels.add(green_player_5);
		
		green_player_1_score = new JLabel("");
		green_player_1_score.setForeground(new Color(0, 128, 0));
		green_player_1_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_1_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_1_score.setBounds(439, 56, 108, 40);
		green_score_panel.add(green_player_1_score);
		green_score_labels.add(green_player_1_score);
		
		green_player_2_score = new JLabel("");
		green_player_2_score.setForeground(new Color(0, 128, 0));
		green_player_2_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_2_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_2_score.setBounds(439, 90, 108, 40);
		green_score_panel.add(green_player_2_score);
		green_score_labels.add(green_player_2_score);
		
		green_player_3_score = new JLabel("");
		green_player_3_score.setForeground(new Color(0, 128, 0));
		green_player_3_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_3_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_3_score.setBounds(439, 125, 108, 40);
		green_score_panel.add(green_player_3_score);
		green_score_labels.add(green_player_3_score);
		
		green_player_4_score = new JLabel("");
		green_player_4_score.setForeground(new Color(0, 128, 0));
		green_player_4_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_4_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_4_score.setBounds(439, 160, 108, 40);
		green_score_panel.add(green_player_4_score);
		green_score_labels.add(green_player_4_score);
		
		green_player_5_score = new JLabel("");
		green_player_5_score.setForeground(new Color(0, 128, 0));
		green_player_5_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_5_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_5_score.setBounds(439, 195, 108, 40);
		green_score_panel.add(green_player_5_score);
		green_score_labels.add(green_player_5_score);
		
		green_team_score = new JLabel("0000");
		green_team_score.setForeground(new Color(0, 128, 0));
		green_team_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_team_score.setFont(new Font("Rockwell", Font.BOLD, 35));
		green_team_score.setBounds(514, 258, 108, 37);
		green_score_panel.add(green_team_score);

		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1264, 710);
    }

	// Updates the scoreboard for each team in order of points. Call then when a player scores to resort the list.
    public void updateScoreboard()
    {
		final int MAX_PLAYERS_SHOWN = 5;
		List<Player> sortedRedPlayers = presenter.model.acitveRedPlayers;
		List<Player> sortedGreenPlayers = presenter.model.acitveGreenPlayers;
		Collections.sort(sortedRedPlayers);
		Collections.sort(sortedGreenPlayers);

		if (sortedRedPlayers.size() > MAX_PLAYERS_SHOWN) // if there are more players than 5 on red team
		{
			for (int i = 0; i < MAX_PLAYERS_SHOWN; i++)
			{
				JLabel currentCodenameLabel = red_player_labels.get(i);
				JLabel currentScoreLabel = red_score_labels.get(i);
				currentCodenameLabel.setText(sortedRedPlayers.get(i).getCodename());
				currentScoreLabel.setText(String.format("%04d", sortedRedPlayers.get(i).getScore()));
			}
		} else // if there are less than 5 players on red team
		{
			for (int i = 0; i < sortedRedPlayers.size(); i++)
			{
				JLabel currentCodenameLabel = red_player_labels.get(i);
				JLabel currentScoreLabel = red_score_labels.get(i);
				currentCodenameLabel.setText(sortedRedPlayers.get(i).getCodename());
				currentScoreLabel.setText(String.format("%04d", sortedRedPlayers.get(i).getScore()));
			}
		}

		if (sortedGreenPlayers.size() > MAX_PLAYERS_SHOWN)
		{
			for (int i = 0; i < MAX_PLAYERS_SHOWN; i++)
			{
				JLabel currentCodenameLabel = green_player_labels.get(i);
				JLabel currentScoreLabel = green_score_labels.get(i);
				currentCodenameLabel.setText(sortedGreenPlayers.get(i).getCodename());
				currentScoreLabel.setText(String.format("%04d", sortedGreenPlayers.get(i).getScore()));
			}
		} else
		{
			for (int i = 0; i < sortedGreenPlayers.size(); i++)
			{
				JLabel currentCodenameLabel = green_player_labels.get(i);
				JLabel currentScoreLabel = green_score_labels.get(i);
				currentCodenameLabel.setText(sortedGreenPlayers.get(i).getCodename());
				currentScoreLabel.setText(String.format("%04d", sortedGreenPlayers.get(i).getScore()));
			}
		}
    }

	// Flash the highest team's score. Call this within the flash timer.
	public void flashHighestTeam()
	{
		int red_score = Integer.parseInt(red_team_score.getText());
		int green_score = Integer.parseInt(green_team_score.getText());

		if (red_score > green_score)
		{
			if (red_score != 0)
			{
				if (red_team_score.isVisible())
				{
					red_team_score.setVisible(false);
				} else
				{
					red_team_score.setVisible(true);
				}
			}
		} else
		{
			if (green_score != 0)
			{
				if (green_team_score.isVisible())
				{
					green_team_score.setVisible(false);
				} else
				{
					green_team_score.setVisible(true);
				}
			}
		}
	}

	// Flash the player with the highest score. Call this within the timer for the flash.
	public void flashHighestPlayer()
	{
		List<Player> sortedRedPlayers = presenter.model.acitveRedPlayers;
		List<Player> sortedGreenPlayers = presenter.model.acitveGreenPlayers;
		Collections.sort(sortedRedPlayers);
		Collections.sort(sortedGreenPlayers);

		if (sortedRedPlayers.get(0).getScore() > sortedGreenPlayers.get(0).getScore())
		{
			if (sortedRedPlayers.get(0).getScore() != 0)
			{
				if (red_player_1.isVisible())
				{
					red_player_1.setVisible(false);
					red_player_1_score.setVisible(false);
				} else
				{
					red_player_1.setVisible(true);
					red_player_1_score.setVisible(true);
				}
			}
		} else
		{
			if (sortedGreenPlayers.get(0).getScore() != 0)
			{
				if (green_player_1.isVisible())
				{
					green_player_1.setVisible(false);
					green_player_1_score.setVisible(false);
				} else
				{
					green_player_1.setVisible(true);
					green_player_1_score.setVisible(true);
				}
			}
		}
	}

	// Update the team score. Call this whenever a player scores to update team scores.
	public void updateTeamScores()
	{
		List<Player> redPlayers = presenter.model.acitveRedPlayers;
		List<Player> greenPlayers = presenter.model.acitveGreenPlayers;
		int redScore = 0;
		int greenScore = 0;
		for (int i = 0; i < redPlayers.size(); i++)
		{
			redScore = redScore + redPlayers.get(i).getScore();
		}
		for (int i = 0; i < greenPlayers.size(); i++)
		{
			greenScore = greenScore + greenPlayers.get(i).getScore();
		}
		red_team_score.setText(String.valueOf(redScore));
		green_team_score.setText(String.valueOf(greenScore));
	}

    // Adds new game event to list. Call then whenever a player scores to show event.
    public void updateGameAction(Player hitter, Player hit)
    {
		String newEvent = "";
		try {
        	newEvent = getGameEventString(hitter, hit);
		} catch (Exception e) {
			System.out.println("ERROR: Player not found in GameAction.updateGameAction()");
		}
        for (int i = 0; i <= 8; i++)
        {
			game_action_labels.get(i).setText(game_action_labels.get(i+1).getText());
        }
		//System.out.println(newEvent);
        game_action_10.setText(newEvent);
    }

	// Helper function for updateGameAction.
    public String getGameEventString(Player hitter, Player hit) // "codenameHitter hit codenameHit"
    {
		String codenameHitter = "";
		String codenameHit = "";
		String hitterTeam = "";
		String hitTeam = "";
		try {
			codenameHitter = hitter.getCodename();
			codenameHit = hit.getCodename();
			if (hitter.isRedTeam())
			{
				hitterTeam = "RED";
			} else
			{
				hitterTeam = "GREEN";
			}
			if (hit.isRedTeam())
			{
				hitTeam = "RED";
			} else
			{
				hitTeam = "GREEN";
			}
		} catch (Exception e) {
			System.out.println("ERROR: Player not found in GameAction.getGameEventString()");
		}
        String formattedStr = "<html><font color='" + hitterTeam + "'>" + codenameHitter + "</font> hit <font color='" + hitTeam + "'>" + codenameHit + "</font>";
		return formattedStr; 
    }

	// Timer for the flashing scores
	TimerTask flashTask = new TimerTask() {
		public void run() {
			flashHighestPlayer();
			flashHighestTeam();
		}
	};
	
	public void startFlashTimer() {
		flashTimer.scheduleAtFixedRate(flashTask, 750, 750);
	}

    //Timer Functions
	int secondsPassed = 15; //Needs to be changed back to 31
	int minute = 6;
	boolean isPregame = true;
	boolean gameOver = false;

	TimerTask task = new TimerTask() {
		public void run (){
			updateTimer();
			// flashHighestPlayer();
			// flashHighestTeam();
		}
	};

	public void startTimer(){
		myTimer.scheduleAtFixedRate(task, 1000, 1000);
	}

    public void updateTimer() // SPRINT (3)
	{
		if(minute <= 0 && secondsPassed <= 0) {
			timer_label.setText("GAME OVER");
			task.cancel();
		}
		else {
			secondsPassed--;
				if(secondsPassed < 0){
					minute--;
					if(isPregame)
					{
						presenter.startSocket();
					}
					isPregame = false;
					secondsPassed = 59;
				}	
				if(isPregame) {
					timer_label.setText("Game is about to start... " + String.format("%02d", secondsPassed));
				}
				else {
					timer_label.setText(String.format("%02d", minute) + " : " + String.format("%02d", secondsPassed));
				}
		}	
    }

    //Show/Hide Functions
    public void showGameAction()
    {
        frame.setVisible(true);
		startTimer();
		startFlashTimer();
    }

    public void hideGameAction()
    {
        frame.setVisible(false);
    }

	// TESTING FUNCTIONALITY
	public void testGameAction()
	{
		List<Player> redPlayers = presenter.model.acitveRedPlayers;
		List<Player> greenPlayers = presenter.model.acitveGreenPlayers;
		redPlayers.get(0).increaseScore(1000);
		greenPlayers.get(1).increaseScore(740);
		greenPlayers.get(2).increaseScore(5000);
		redPlayers.get(3).increaseScore(1001);
		redPlayers.get(2).increaseScore(520);
		updateGameAction(redPlayers.get(0), greenPlayers.get(2));
		updateGameAction(greenPlayers.get(1), redPlayers.get(2));
		updateGameAction(greenPlayers.get(2), redPlayers.get(0));
		updateGameAction(redPlayers.get(0), greenPlayers.get(1));
		updateGameAction(redPlayers.get(1), greenPlayers.get(2));
		updateGameAction(greenPlayers.get(2), redPlayers.get(1));
		updateGameAction(redPlayers.get(3), greenPlayers.get(2));
		updateGameAction(greenPlayers.get(0), redPlayers.get(1));
		updateGameAction(greenPlayers.get(1), redPlayers.get(1));
		updateGameAction(redPlayers.get(2), greenPlayers.get(3));
		updateGameAction(redPlayers.get(3), greenPlayers.get(0));
		updateGameAction(greenPlayers.get(0), redPlayers.get(0));
	}
}
