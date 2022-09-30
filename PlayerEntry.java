/*
 * Player Entry Screen for Software Engineering (CSCS3513) (TEAM 4)
 * Date: 9/19/2022
 * Team 4
 * 
 * Player entry screen for the entry of players for the laser tag project.
*/

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayerEntry
{
    private JFrame frame;
	private JTextField red_codename_1;
	private JTextField red_codename_2;
	private JTextField red_codename_3;
	private JTextField red_codename_4;
	private JTextField red_codename_5;
	private JTextField red_codename_6;
	private JTextField red_codename_7;
	private JTextField red_codename_8;
	private JTextField red_codename_9;
	private JTextField red_codename_10;
	private JTextField red_codename_11;
	private JTextField red_codename_12;
	private JTextField red_codename_13;
	private JTextField red_codename_14;
	private JTextField red_codename_15;
	private JTextField red_id_1;
	private JTextField red_id_2;
	private JTextField red_id_3;
	private JTextField red_id_4;
	private JTextField red_id_5;
	private JTextField red_id_6;
	private JTextField red_id_7;
	private JTextField red_id_8;
	private JTextField red_id_9;
	private JTextField red_id_10;
	private JTextField red_id_11;
	private JTextField red_id_12;
	private JTextField red_id_13;
	private JTextField red_id_14;
	private JTextField red_id_15;
	private JPanel green_panel;
	private JTextField green_codename_1;
	private JLabel label_red_team_1;
	private JTextField green_codename_2;
	private JTextField green_codename_3;
	private JTextField green_codename_4;
	private JTextField green_codename_5;
	private JTextField green_codename_6;
	private JTextField green_codename_7;
	private JTextField green_codename_8;
	private JTextField green_codename_9;
	private JTextField green_codename_10;
	private JTextField green_codename_11;
	private JTextField green_codename_12;
	private JTextField green_codename_13;
	private JTextField green_codename_14;
	private JTextField green_codename_15;
	private JTextField green_id_1;
	private JTextField green_id_2;
	private JTextField green_id_3;
	private JTextField green_id_4;
	private JTextField green_id_5;
	private JTextField green_id_6;
	private JTextField green_id_7;
	private JTextField green_id_8;
	private JTextField green_id_9;
	private JTextField green_id_10;
	private JTextField green_id_11;
	private JTextField green_id_12;
	private JTextField green_id_13;
	private JTextField green_id_14;
	private JTextField green_id_15;
	private JCheckBox green_checkbox_1;
	private JCheckBox green_checkbox_2;
	private JCheckBox green_checkbox_3;
	private JCheckBox green_checkbox_4;
	private JCheckBox green_checkbox_5;
	private JCheckBox green_checkbox_6;
	private JCheckBox green_checkbox_7;
	private JCheckBox green_checkbox_8;
	private JCheckBox green_checkbox_9;
	private JCheckBox green_checkbox_10;
	private JCheckBox green_checkbox_11;
	private JCheckBox green_checkbox_12;
	private JCheckBox green_checkbox_13;
	private JCheckBox green_checkbox_14;
	private JCheckBox green_checkbox_15;

    public PlayerEntry()
    {
        frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Entry Terminal");
		
		JPanel red_panel = new JPanel();
		red_panel.setBackground(new Color(64, 0, 0));
		red_panel.setBounds(57, 91, 335, 463);
		frame.getContentPane().add(red_panel);
		red_panel.setLayout(null);
		
		red_codename_1 = new JTextField();
		red_codename_1.setBounds(131, 73, 195, 20);
		red_panel.add(red_codename_1);
		red_codename_1.setColumns(30);
		
		JLabel label_red_team = new JLabel("RED TEAM");
		label_red_team.setBounds(95, 11, 141, 34);
		label_red_team.setFont(new Font("Rockwell", Font.PLAIN, 28));
		red_panel.add(label_red_team);
		
		red_codename_2 = new JTextField();
		red_codename_2.setColumns(30);
		red_codename_2.setBounds(131, 98, 195, 20);
		red_panel.add(red_codename_2);
		
		red_codename_3 = new JTextField();
		red_codename_3.setColumns(20);
		red_codename_3.setBounds(131, 123, 195, 20);
		red_panel.add(red_codename_3);
		
		red_codename_4 = new JTextField();
		red_codename_4.setColumns(20);
		red_codename_4.setBounds(131, 148, 195, 20);
		red_panel.add(red_codename_4);
		
		red_codename_5 = new JTextField();
		red_codename_5.setColumns(20);
		red_codename_5.setBounds(131, 173, 195, 20);
		red_panel.add(red_codename_5);
		
		red_codename_6 = new JTextField();
		red_codename_6.setColumns(20);
		red_codename_6.setBounds(131, 198, 195, 20);
		red_panel.add(red_codename_6);
		
		red_codename_7 = new JTextField();
		red_codename_7.setColumns(20);
		red_codename_7.setBounds(131, 223, 195, 20);
		red_panel.add(red_codename_7);
		
		red_codename_8 = new JTextField();
		red_codename_8.setColumns(20);
		red_codename_8.setBounds(131, 248, 195, 20);
		red_panel.add(red_codename_8);
		
		red_codename_9 = new JTextField();
		red_codename_9.setColumns(20);
		red_codename_9.setBounds(131, 273, 195, 20);
		red_panel.add(red_codename_9);
		
		red_codename_10 = new JTextField();
		red_codename_10.setColumns(20);
		red_codename_10.setBounds(131, 298, 195, 20);
		red_panel.add(red_codename_10);
		
		red_codename_11 = new JTextField();
		red_codename_11.setColumns(20);
		red_codename_11.setBounds(131, 323, 195, 20);
		red_panel.add(red_codename_11);
		
		red_codename_12 = new JTextField();
		red_codename_12.setColumns(20);
		red_codename_12.setBounds(131, 348, 195, 20);
		red_panel.add(red_codename_12);
		
		red_codename_13 = new JTextField();
		red_codename_13.setColumns(20);
		red_codename_13.setBounds(131, 373, 195, 20);
		red_panel.add(red_codename_13);
		
		red_codename_14 = new JTextField();
		red_codename_14.setColumns(20);
		red_codename_14.setBounds(131, 398, 195, 20);
		red_panel.add(red_codename_14);
		
		red_codename_15 = new JTextField();
		red_codename_15.setColumns(20);
		red_codename_15.setBounds(131, 423, 195, 20);
		red_panel.add(red_codename_15);
		
		red_id_1 = new JTextField();
		red_id_1.setBounds(41, 73, 86, 20);
		red_panel.add(red_id_1);
		red_id_1.setColumns(10);
		
		red_id_2 = new JTextField();
		red_id_2.setColumns(10);
		red_id_2.setBounds(41, 98, 86, 20);
		red_panel.add(red_id_2);
		
		red_id_3 = new JTextField();
		red_id_3.setColumns(10);
		red_id_3.setBounds(41, 123, 86, 20);
		red_panel.add(red_id_3);
		
		red_id_4 = new JTextField();
		red_id_4.setColumns(10);
		red_id_4.setBounds(41, 148, 86, 20);
		red_panel.add(red_id_4);
		
		red_id_5 = new JTextField();
		red_id_5.setColumns(10);
		red_id_5.setBounds(41, 173, 86, 20);
		red_panel.add(red_id_5);
		
		red_id_6 = new JTextField();
		red_id_6.setColumns(10);
		red_id_6.setBounds(41, 198, 86, 20);
		red_panel.add(red_id_6);
		
		red_id_7 = new JTextField();
		red_id_7.setColumns(10);
		red_id_7.setBounds(41, 223, 86, 20);
		red_panel.add(red_id_7);
		
		red_id_8 = new JTextField();
		red_id_8.setColumns(10);
		red_id_8.setBounds(41, 248, 86, 20);
		red_panel.add(red_id_8);
		
		red_id_9 = new JTextField();
		red_id_9.setColumns(10);
		red_id_9.setBounds(41, 273, 86, 20);
		red_panel.add(red_id_9);
		
		red_id_10 = new JTextField();
		red_id_10.setColumns(10);
		red_id_10.setBounds(41, 298, 86, 20);
		red_panel.add(red_id_10);
		
		red_id_11 = new JTextField();
		red_id_11.setColumns(10);
		red_id_11.setBounds(41, 323, 86, 20);
		red_panel.add(red_id_11);
		
		red_id_12 = new JTextField();
		red_id_12.setColumns(10);
		red_id_12.setBounds(41, 348, 86, 20);
		red_panel.add(red_id_12);
		
		red_id_13 = new JTextField();
		red_id_13.setColumns(10);
		red_id_13.setBounds(41, 373, 86, 20);
		red_panel.add(red_id_13);
		
		red_id_14 = new JTextField();
		red_id_14.setColumns(10);
		red_id_14.setBounds(41, 398, 86, 20);
		red_panel.add(red_id_14);
		
		red_id_15 = new JTextField();
		red_id_15.setColumns(10);
		red_id_15.setBounds(41, 423, 86, 20);
		red_panel.add(red_id_15);
		
		JCheckBox red_checkbox_1 = new JCheckBox("1");
		red_checkbox_1.setBackground(new Color(64, 0, 0));
		red_checkbox_1.setBounds(6, 73, 37, 20);
		red_panel.add(red_checkbox_1);
		
		JCheckBox red_checkbox_2 = new JCheckBox("2");
		red_checkbox_2.setBackground(new Color(64, 0, 0));
		red_checkbox_2.setBounds(6, 98, 37, 20);
		red_panel.add(red_checkbox_2);
		
		JCheckBox red_checkbox_3 = new JCheckBox("3");
		red_checkbox_3.setBackground(new Color(64, 0, 0));
		red_checkbox_3.setBounds(6, 122, 37, 20);
		red_panel.add(red_checkbox_3);
		
		JCheckBox red_checkbox_4 = new JCheckBox("4");
		red_checkbox_4.setBackground(new Color(64, 0, 0));
		red_checkbox_4.setBounds(6, 147, 37, 20);
		red_panel.add(red_checkbox_4);
		
		JCheckBox red_checkbox_5 = new JCheckBox("5");
		red_checkbox_5.setBackground(new Color(64, 0, 0));
		red_checkbox_5.setBounds(6, 172, 37, 20);
		red_panel.add(red_checkbox_5);
		
		JCheckBox red_checkbox_6 = new JCheckBox("6");
		red_checkbox_6.setBackground(new Color(64, 0, 0));
		red_checkbox_6.setBounds(6, 197, 37, 20);
		red_panel.add(red_checkbox_6);
		
		JCheckBox red_checkbox_7 = new JCheckBox("7");
		red_checkbox_7.setBackground(new Color(64, 0, 0));
		red_checkbox_7.setBounds(6, 222, 37, 20);
		red_panel.add(red_checkbox_7);
		
		JCheckBox red_checkbox_8 = new JCheckBox("8");
		red_checkbox_8.setBackground(new Color(64, 0, 0));
		red_checkbox_8.setBounds(6, 247, 37, 20);
		red_panel.add(red_checkbox_8);
		
		JCheckBox red_checkbox_9 = new JCheckBox("9");
		red_checkbox_9.setBackground(new Color(64, 0, 0));
		red_checkbox_9.setBounds(6, 272, 37, 20);
		red_panel.add(red_checkbox_9);
		
		JCheckBox red_checkbox_10 = new JCheckBox("10");
		red_checkbox_10.setBackground(new Color(64, 0, 0));
		red_checkbox_10.setBounds(6, 298, 37, 20);
		red_panel.add(red_checkbox_10);
		
		JCheckBox red_checkbox_11 = new JCheckBox("11");
		red_checkbox_11.setBackground(new Color(64, 0, 0));
		red_checkbox_11.setBounds(6, 322, 37, 20);
		red_panel.add(red_checkbox_11);
		
		JCheckBox red_checkbox_12 = new JCheckBox("12");
		red_checkbox_12.setBackground(new Color(64, 0, 0));
		red_checkbox_12.setBounds(6, 347, 37, 20);
		red_panel.add(red_checkbox_12);
		
		JCheckBox red_checkbox_13 = new JCheckBox("13");
		red_checkbox_13.setBackground(new Color(64, 0, 0));
		red_checkbox_13.setBounds(6, 372, 37, 20);
		red_panel.add(red_checkbox_13);
		
		JCheckBox red_checkbox_14 = new JCheckBox("14");
		red_checkbox_14.setBackground(new Color(64, 0, 0));
		red_checkbox_14.setBounds(6, 397, 37, 20);
		red_panel.add(red_checkbox_14);
		
		JCheckBox red_checkbox_15 = new JCheckBox("15");
		red_checkbox_15.setBackground(new Color(64, 0, 0));
		red_checkbox_15.setBounds(6, 422, 37, 20);
		red_panel.add(red_checkbox_15);
		
		JLabel lblNewLabel = new JLabel("Edit Current Game");
		lblNewLabel.setBounds(261, 49, 267, 31);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBackground(new Color(25, 25, 112));
		
		green_panel = new JPanel();
		green_panel.setLayout(null);
		green_panel.setBackground(new Color(0, 100, 0));
		green_panel.setBounds(392, 91, 335, 463);
		frame.getContentPane().add(green_panel);
		
		green_codename_1 = new JTextField();
		green_codename_1.setColumns(20);
		green_codename_1.setBounds(131, 73, 195, 20);
		green_panel.add(green_codename_1);
		
		label_red_team_1 = new JLabel("GREEN TEAM");
		label_red_team_1.setFont(new Font("Rockwell", Font.PLAIN, 28));
		label_red_team_1.setBounds(80, 11, 195, 34);
		green_panel.add(label_red_team_1);
		
		green_codename_2 = new JTextField();
		green_codename_2.setColumns(20);
		green_codename_2.setBounds(131, 98, 195, 20);
		green_panel.add(green_codename_2);
		
		green_codename_3 = new JTextField();
		green_codename_3.setColumns(20);
		green_codename_3.setBounds(131, 123, 195, 20);
		green_panel.add(green_codename_3);
		
		green_codename_4 = new JTextField();
		green_codename_4.setColumns(20);
		green_codename_4.setBounds(131, 148, 195, 20);
		green_panel.add(green_codename_4);
		
		green_codename_5 = new JTextField();
		green_codename_5.setColumns(20);
		green_codename_5.setBounds(131, 173, 195, 20);
		green_panel.add(green_codename_5);
		
		green_codename_6 = new JTextField();
		green_codename_6.setColumns(20);
		green_codename_6.setBounds(131, 198, 195, 20);
		green_panel.add(green_codename_6);
		
		green_codename_7 = new JTextField();
		green_codename_7.setColumns(20);
		green_codename_7.setBounds(131, 223, 195, 20);
		green_panel.add(green_codename_7);
		
		green_codename_8 = new JTextField();
		green_codename_8.setColumns(20);
		green_codename_8.setBounds(131, 248, 195, 20);
		green_panel.add(green_codename_8);
		
		green_codename_9 = new JTextField();
		green_codename_9.setColumns(20);
		green_codename_9.setBounds(131, 273, 195, 20);
		green_panel.add(green_codename_9);
		
		green_codename_10 = new JTextField();
		green_codename_10.setColumns(20);
		green_codename_10.setBounds(131, 298, 195, 20);
		green_panel.add(green_codename_10);
		
		green_codename_11 = new JTextField();
		green_codename_11.setColumns(20);
		green_codename_11.setBounds(131, 323, 195, 20);
		green_panel.add(green_codename_11);
		
		green_codename_12 = new JTextField();
		green_codename_12.setColumns(20);
		green_codename_12.setBounds(131, 348, 195, 20);
		green_panel.add(green_codename_12);
		
		green_codename_13 = new JTextField();
		green_codename_13.setColumns(20);
		green_codename_13.setBounds(131, 373, 195, 20);
		green_panel.add(green_codename_13);
		
		green_codename_14 = new JTextField();
		green_codename_14.setColumns(20);
		green_codename_14.setBounds(131, 398, 195, 20);
		green_panel.add(green_codename_14);
		
		green_codename_15 = new JTextField();
		green_codename_15.setColumns(20);
		green_codename_15.setBounds(131, 423, 195, 20);
		green_panel.add(green_codename_15);
		
		green_id_1 = new JTextField();
		green_id_1.setColumns(10);
		green_id_1.setBounds(41, 73, 86, 20);
		green_panel.add(green_id_1);
		
		green_id_2 = new JTextField();
		green_id_2.setColumns(10);
		green_id_2.setBounds(41, 98, 86, 20);
		green_panel.add(green_id_2);
		
		green_id_3 = new JTextField();
		green_id_3.setColumns(10);
		green_id_3.setBounds(41, 123, 86, 20);
		green_panel.add(green_id_3);
		
		green_id_4 = new JTextField();
		green_id_4.setColumns(10);
		green_id_4.setBounds(41, 148, 86, 20);
		green_panel.add(green_id_4);
		
		green_id_5 = new JTextField();
		green_id_5.setColumns(10);
		green_id_5.setBounds(41, 173, 86, 20);
		green_panel.add(green_id_5);
		
		green_id_6 = new JTextField();
		green_id_6.setColumns(10);
		green_id_6.setBounds(41, 198, 86, 20);
		green_panel.add(green_id_6);
		
		green_id_7 = new JTextField();
		green_id_7.setColumns(10);
		green_id_7.setBounds(41, 223, 86, 20);
		green_panel.add(green_id_7);
		
		green_id_8 = new JTextField();
		green_id_8.setColumns(10);
		green_id_8.setBounds(41, 248, 86, 20);
		green_panel.add(green_id_8);
		
		green_id_9 = new JTextField();
		green_id_9.setColumns(10);
		green_id_9.setBounds(41, 273, 86, 20);
		green_panel.add(green_id_9);
		
		green_id_10 = new JTextField();
		green_id_10.setColumns(10);
		green_id_10.setBounds(41, 298, 86, 20);
		green_panel.add(green_id_10);
		
		green_id_11 = new JTextField();
		green_id_11.setColumns(10);
		green_id_11.setBounds(41, 323, 86, 20);
		green_panel.add(green_id_11);
		
		green_id_12 = new JTextField();
		green_id_12.setColumns(10);
		green_id_12.setBounds(41, 348, 86, 20);
		green_panel.add(green_id_12);
		
		green_id_13 = new JTextField();
		green_id_13.setColumns(10);
		green_id_13.setBounds(41, 373, 86, 20);
		green_panel.add(green_id_13);
		
		green_id_14 = new JTextField();
		green_id_14.setColumns(10);
		green_id_14.setBounds(41, 398, 86, 20);
		green_panel.add(green_id_14);
		
		green_id_15 = new JTextField();
		green_id_15.setColumns(10);
		green_id_15.setBounds(41, 423, 86, 20);
		green_panel.add(green_id_15);
		
		green_checkbox_1 = new JCheckBox("1");
		green_checkbox_1.setBackground(new Color(0, 100, 0));
		green_checkbox_1.setBounds(6, 73, 37, 20);
		green_panel.add(green_checkbox_1);
		
		green_checkbox_2 = new JCheckBox("2");
		green_checkbox_2.setBackground(new Color(0, 100, 0));
		green_checkbox_2.setBounds(6, 98, 37, 20);
		green_panel.add(green_checkbox_2);
		
		green_checkbox_3 = new JCheckBox("3");
		green_checkbox_3.setBackground(new Color(0, 100, 0));
		green_checkbox_3.setBounds(6, 122, 37, 20);
		green_panel.add(green_checkbox_3);
		
		green_checkbox_4 = new JCheckBox("4");
		green_checkbox_4.setBackground(new Color(0, 100, 0));
		green_checkbox_4.setBounds(6, 147, 37, 20);
		green_panel.add(green_checkbox_4);
		
		green_checkbox_5 = new JCheckBox("5");
		green_checkbox_5.setBackground(new Color(0, 100, 0));
		green_checkbox_5.setBounds(6, 172, 37, 20);
		green_panel.add(green_checkbox_5);
		
		green_checkbox_6 = new JCheckBox("6");
		green_checkbox_6.setBackground(new Color(0, 100, 0));
		green_checkbox_6.setBounds(6, 197, 37, 20);
		green_panel.add(green_checkbox_6);
		
		green_checkbox_7 = new JCheckBox("7");
		green_checkbox_7.setBackground(new Color(0, 100, 0));
		green_checkbox_7.setBounds(6, 222, 37, 20);
		green_panel.add(green_checkbox_7);
		
		green_checkbox_8 = new JCheckBox("8");
		green_checkbox_8.setBackground(new Color(0, 100, 0));
		green_checkbox_8.setBounds(6, 247, 37, 20);
		green_panel.add(green_checkbox_8);
		
		green_checkbox_9 = new JCheckBox("9");
		green_checkbox_9.setBackground(new Color(0, 100, 0));
		green_checkbox_9.setBounds(6, 272, 37, 20);
		green_panel.add(green_checkbox_9);
		
		green_checkbox_10 = new JCheckBox("10");
		green_checkbox_10.setBackground(new Color(0, 100, 0));
		green_checkbox_10.setBounds(6, 298, 37, 20);
		green_panel.add(green_checkbox_10);
		
		green_checkbox_11 = new JCheckBox("11");
		green_checkbox_11.setBackground(new Color(0, 100, 0));
		green_checkbox_11.setBounds(6, 322, 37, 20);
		green_panel.add(green_checkbox_11);
		
		green_checkbox_12 = new JCheckBox("12");
		green_checkbox_12.setBackground(new Color(0, 100, 0));
		green_checkbox_12.setBounds(6, 347, 37, 20);
		green_panel.add(green_checkbox_12);
		
		green_checkbox_13 = new JCheckBox("13");
		green_checkbox_13.setBackground(new Color(0, 100, 0));
		green_checkbox_13.setBounds(6, 372, 37, 20);
		green_panel.add(green_checkbox_13);
		
		green_checkbox_14 = new JCheckBox("14");
		green_checkbox_14.setBackground(new Color(0, 100, 0));
		green_checkbox_14.setBounds(6, 397, 37, 20);
		green_panel.add(green_checkbox_14);
		
		green_checkbox_15 = new JCheckBox("15");
		green_checkbox_15.setBackground(new Color(0, 100, 0));
		green_checkbox_15.setBounds(6, 422, 37, 20);
		green_panel.add(green_checkbox_15);
		
		JButton button_start_game = new JButton("<html><center>F5<br />Start Game</center></html>");
		button_start_game.setForeground(new Color(0, 100, 0));
		button_start_game.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_start_game.setBackground(Color.BLACK);
		button_start_game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_start_game.setBounds(344, 660, 98, 90);
		frame.getContentPane().add(button_start_game);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
    }
    public void showPlayerEntry()
    {
        frame.setVisible(true);
    }

    public void hidePlayerEntry()
    {
        frame.setVisible(false);
    }
}