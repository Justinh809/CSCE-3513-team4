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
import java.awt.event.ActionListener;
import java.util.TimerTask;

import javax.swing.SwingConstants;
import java.util.Timer;

import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class GameAction
{
    final int POINTS_ON_HIT = 100; // update this if needed
	
	JFrame frame;
    Presenter presenter;
	JPanel timer_panel;
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

    public GameAction(Presenter p)
    {
        presenter = p;


		System.out.println("a");
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
		
		game_action_2 = new JLabel("");
		game_action_2.setForeground(Color.WHITE);
		game_action_2.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_2.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_2.setBounds(10, 38, 1244, 27);
		live_action_panel.add(game_action_2);
		
		game_action_3 = new JLabel("");
		game_action_3.setForeground(Color.WHITE);
		game_action_3.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_3.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_3.setBounds(10, 66, 1244, 27);
		live_action_panel.add(game_action_3);
		
		game_action_4 = new JLabel("");
		game_action_4.setForeground(Color.WHITE);
		game_action_4.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_4.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_4.setBounds(10, 94, 1244, 27);
		live_action_panel.add(game_action_4);
		
		game_action_5 = new JLabel("");
		game_action_5.setForeground(Color.WHITE);
		game_action_5.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_5.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_5.setBounds(10, 122, 1244, 27);
		live_action_panel.add(game_action_5);
		
		game_action_6 = new JLabel("");
		game_action_6.setForeground(Color.WHITE);
		game_action_6.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_6.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_6.setBounds(10, 150, 1244, 27);
		live_action_panel.add(game_action_6);
		
		game_action_7 = new JLabel("");
		game_action_7.setForeground(Color.WHITE);
		game_action_7.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_7.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_7.setBounds(10, 178, 1244, 27);
		live_action_panel.add(game_action_7);
		
		game_action_8 = new JLabel("");
		game_action_8.setForeground(Color.WHITE);
		game_action_8.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_8.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_8.setBounds(10, 206, 1244, 27);
		live_action_panel.add(game_action_8);
		
		game_action_9 = new JLabel("");
		game_action_9.setForeground(Color.WHITE);
		game_action_9.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_9.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_9.setBounds(10, 234, 1244, 27);
		live_action_panel.add(game_action_9);
		
		game_action_10 = new JLabel("");
		game_action_10.setForeground(Color.WHITE);
		game_action_10.setHorizontalAlignment(SwingConstants.CENTER);
		game_action_10.setFont(new Font("Rockwell", Font.PLAIN, 20));
		game_action_10.setBounds(10, 262, 1244, 27);
		live_action_panel.add(game_action_10);
		
		red_score_panel = new JPanel();
		red_score_panel.setBackground(Color.BLACK);
		red_score_panel.setBounds(0, 0, 632, 306);
		frame.getContentPane().add(red_score_panel);
		red_score_panel.setLayout(null);
		
		red_team_label = new JLabel("RED TEAM");
		red_team_label.setForeground(Color.RED);
		red_team_label.setBackground(Color.BLACK);
		red_team_label.setBounds(247, 5, 138, 30);
		red_team_label.setFont(new Font("Rockwell", Font.BOLD, 25));
		red_score_panel.add(red_team_label);
		
		red_player_1 = new JLabel("");
		red_player_1.setForeground(Color.RED);
		red_player_1.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_1.setBounds(10, 46, 248, 30);
		red_score_panel.add(red_player_1);
		
		red_player_2 = new JLabel("");
		red_player_2.setForeground(Color.RED);
		red_player_2.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_2.setBounds(10, 80, 248, 30);
		red_score_panel.add(red_player_2);
		
		red_player_3 = new JLabel("");
		red_player_3.setForeground(Color.RED);
		red_player_3.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_3.setBounds(10, 115, 248, 30);
		red_score_panel.add(red_player_3);
		
		red_player_4 = new JLabel("");
		red_player_4.setForeground(Color.RED);
		red_player_4.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_4.setBounds(10, 150, 248, 30);
		red_score_panel.add(red_player_4);
		
		red_player_5 = new JLabel("");
		red_player_5.setForeground(Color.RED);
		red_player_5.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_5.setBounds(10, 185, 248, 30);
		red_score_panel.add(red_player_5);
		
		red_player_1_score = new JLabel("");
		red_player_1_score.setForeground(Color.RED);
		red_player_1_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_1_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_1_score.setBounds(439, 45, 108, 30);
		red_score_panel.add(red_player_1_score);
		
		red_player_2_score = new JLabel("");
		red_player_2_score.setForeground(Color.RED);
		red_player_2_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_2_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_2_score.setBounds(439, 80, 108, 30);
		red_score_panel.add(red_player_2_score);
		
		red_player_3_score = new JLabel("");
		red_player_3_score.setForeground(Color.RED);
		red_player_3_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_3_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_3_score.setBounds(439, 115, 108, 30);
		red_score_panel.add(red_player_3_score);
		
		red_player_4_score = new JLabel("");
		red_player_4_score.setForeground(Color.RED);
		red_player_4_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_4_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_4_score.setBounds(439, 150, 108, 30);
		red_score_panel.add(red_player_4_score);
		
		red_player_5_score = new JLabel("");
		red_player_5_score.setForeground(Color.RED);
		red_player_5_score.setHorizontalAlignment(SwingConstants.CENTER);
		red_player_5_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		red_player_5_score.setBounds(439, 185, 108, 30);
		red_score_panel.add(red_player_5_score);
		
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
		green_team_label.setBounds(247, 5, 205, 30);
		green_score_panel.add(green_team_label);
		
		green_player_1 = new JLabel("");
		green_player_1.setForeground(new Color(0, 128, 0));
		green_player_1.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_1.setBounds(10, 45, 248, 30);
		green_score_panel.add(green_player_1);
		
		green_player_2 = new JLabel("");
		green_player_2.setForeground(new Color(0, 128, 0));
		green_player_2.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_2.setBounds(10, 80, 248, 30);
		green_score_panel.add(green_player_2);
		
		green_player_3 = new JLabel("");
		green_player_3.setForeground(new Color(0, 128, 0));
		green_player_3.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_3.setBounds(10, 115, 248, 30);
		green_score_panel.add(green_player_3);
		
		green_player_4 = new JLabel("");
		green_player_4.setForeground(new Color(0, 128, 0));
		green_player_4.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_4.setBounds(10, 150, 248, 30);
		green_score_panel.add(green_player_4);
		
		green_player_5 = new JLabel("");
		green_player_5.setForeground(new Color(0, 128, 0));
		green_player_5.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_5.setBounds(10, 185, 248, 30);
		green_score_panel.add(green_player_5);
		
		green_player_1_score = new JLabel("");
		green_player_1_score.setForeground(new Color(0, 128, 0));
		green_player_1_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_1_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_1_score.setBounds(439, 45, 108, 30);
		green_score_panel.add(green_player_1_score);
		
		green_player_2_score = new JLabel("");
		green_player_2_score.setForeground(new Color(0, 128, 0));
		green_player_2_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_2_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_2_score.setBounds(439, 80, 108, 30);
		green_score_panel.add(green_player_2_score);
		
		green_player_3_score = new JLabel("");
		green_player_3_score.setForeground(new Color(0, 128, 0));
		green_player_3_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_3_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_3_score.setBounds(439, 115, 108, 30);
		green_score_panel.add(green_player_3_score);
		
		green_player_4_score = new JLabel("");
		green_player_4_score.setForeground(new Color(0, 128, 0));
		green_player_4_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_4_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_4_score.setBounds(439, 150, 108, 30);
		green_score_panel.add(green_player_4_score);
		
		green_player_5_score = new JLabel("");
		green_player_5_score.setForeground(new Color(0, 128, 0));
		green_player_5_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_player_5_score.setFont(new Font("Rockwell", Font.PLAIN, 30));
		green_player_5_score.setBounds(439, 185, 108, 30);
		green_score_panel.add(green_player_5_score);
		
		green_team_score = new JLabel("0000");
		green_team_score.setForeground(new Color(0, 128, 0));
		green_team_score.setHorizontalAlignment(SwingConstants.CENTER);
		green_team_score.setFont(new Font("Rockwell", Font.BOLD, 35));
		green_team_score.setBounds(514, 258, 108, 37);
		green_score_panel.add(green_team_score);

		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 800);

    }

    public void initializePlayersOnStart() // add what players start on the leaderboard before game starts (SPRINT 3)
    {
        // TODO
    }

    public void updatePlayerScore(int field) // (SPRINT 4+)
    {
        // TODO
    }

    public void updateTeamScore(String team) // may need updating, just an idea of how to update team score (SPRINT 4+)
    {
        if (team == "red")
        {
            int red_current_score = Integer.parseInt(red_team_score.getText());
            int red_new_score = red_current_score + POINTS_ON_HIT;
            red_team_score.setText(Integer.toString(red_new_score));
        } else if (team == "green")
        {
            int green_current_score = Integer.parseInt(green_team_score.getText());
            int green_new_score = green_current_score + POINTS_ON_HIT;
            green_team_score.setText(Integer.toString(green_new_score));
        } else 
        {
            System.out.println("ERROR: updateTeamScore() invalid team.");
        }
    }

	/* 
    public void newGameHit(Player hitter, Player hit) // can be changed, just an idea to show how the strings for the game action should be set up. (SPRINT 4+)
    {
        String formattedStr = "<html><font color='" + hitter.getColor() + "'>" + hitter.getCodename() + "</font> hit <font color='" + hit.getColor() + "'>" + hit.getCodename() + "<\font>"; 
    }
	*/

	int secondsPassed = 31;
	int minute = 6;
	boolean isPregame = true;
	boolean gameOver = false;

	Timer myTimer = new Timer();
		TimerTask task = new TimerTask() {
			public void run (){

				updateTimer();

			}
		};

	public void startTimer(){

		myTimer.scheduleAtFixedRate(task, 1000, 1000);

	}

    public void updateTimer() // SPRINT (3)
    
	{

		if(minute <= 0 && secondsPassed <= 0){

			timer_label.setText("GAME OVER");

			task.cancel();

		}

		else {

			secondsPassed--;

				if(secondsPassed < 0){

					minute--;
					isPregame = false;
					secondsPassed = 59;

				}
					
				if(isPregame){

					timer_label.setText("Game is about to start... " + Integer.toString(secondsPassed));

				}

				else {

					timer_label.setText(Integer.toString(minute) + " : " + Integer.toString(secondsPassed));

				}
		}	

    }


    public void showGameAction()
    {
        frame.setVisible(true);
		startTimer();
    }

    public void hideGameAction()
    {
        frame.setVisible(false);
    }
}
