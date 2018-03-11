package edu.unlv.is380.peaksAndValleys;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends Canvas implements ActionListener{

	private static final long serialVersionUID = 12L;
	
	public static final int WIDTH = 640, HEIGHT = 480;
	
	public Window (int width, int height, String title) {
			
		JFrame frame = new JFrame(title);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JButton home = new JButton("Home");
		JButton beginGame = new JButton("Begin Game");
		JButton dispHS = new JButton("Display High Scores");
		JLabel player = new JLabel("Please enter your name:");
		JLabel type = new JLabel("Please select your player type:");
		JButton cowboy = new JButton("Cowboy");
		JButton ninja = new JButton("Ninja");
		JButton spaceman = new JButton("Spaceman");
		JButton viking = new JButton("Viking");
		JTextField name = new JTextField(30);
		
		
		
		
		HomeScreen();{
		panel1.setBackground(Color.gray);
		panel2.setBackground(Color.BLACK);
			
		frame.add(panel1,BorderLayout.CENTER);
		frame.add(panel2,BorderLayout.PAGE_END);
		panel1.add(player);
		panel1.add(name);
		panel1.add(type);
		panel1.add(cowboy);
		panel1.add(ninja);
		panel1.add(spaceman);
		panel1.add(viking);
		panel1.add(beginGame);
		panel2.add(home);
		panel2.add(dispHS);
		
		String playerName = name.toString();
		
			
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Home")) {
					
				}
			}
		});
		
		beginGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Begin Game")) {
					
				}
			}
		});
		
		dispHS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Display High Scores")) {
					
				}
			}
		});
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		frame.setFocusable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}
		
	}

	protected static void dispose() {
		System.exit(0);
	}

	private void HomeScreen() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
