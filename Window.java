package edu.unlv.is380.peaksAndValleys;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Window extends Canvas implements ActionListener, ItemListener{

	private static final long serialVersionUID = 12L;
	
	public static final int WIDTH = 640, HEIGHT = 480;
	
	
	public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "Game Menu");
        menuBar.add(menu);

        //a group of JMenuItems
        menuItem = new JMenuItem("New Game",
                                 KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_N, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "New Game");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        
        menuItem = new JMenuItem("View High Scores",
                KeyEvent.VK_H);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
        		KeyEvent.VK_H, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
        			"View High Scores");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        menu.addSeparator();
        
        menuItem = new JMenuItem("Quit Game",
                KeyEvent.VK_Q);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
        		KeyEvent.VK_Q, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
        			"Quit the Game");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        return menuBar;
    }
	
	public Window (int width, int height, String title) {
			
		JFrame frame = new JFrame(title);
		JPanel panel1 = new JPanel(new GridBagLayout());
		JPanel panel2 = new JPanel(new GridBagLayout());
		JPanel panel3 = new JPanel(new GridBagLayout());
		JButton home = new JButton("Home Screen");
		JButton beginGame = new JButton("Begin Game");
		JButton dispHS = new JButton("Display High Scores");
		JLabel player = new JLabel("Enter your name:");
		JLabel username = new JLabel("Enter your username:");
		JLabel charName = new JLabel("Enter your character name:");
		JLabel type = new JLabel("Select your player type:");
		JButton cowboy = new JButton("Cowboy");
		JButton ninja = new JButton("Ninja");
		JButton spaceman = new JButton("Spaceman");
		JButton viking = new JButton("Viking");
		JTextField pName = new JTextField(20);
		JTextField uName = new JTextField(20);
		JTextField cName = new JTextField(20);
		
		
		
		HomeScreen();{
		frame.setJMenuBar(createMenuBar());
			
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(640, 140));
		panel1.setMinimumSize(new Dimension(640, 140));
		panel1.setMaximumSize(new Dimension(640, 140));
		panel2.setBackground(Color.DARK_GRAY);
		panel3.setBackground(Color.black);
		panel3.setPreferredSize(new Dimension(640, 50));
		panel3.setMinimumSize(new Dimension(640, 50));
		panel3.setMaximumSize(new Dimension(640, 50));
		
		frame.getContentPane().add(panel1, BorderLayout.NORTH);
		frame.getContentPane().add(panel2, BorderLayout.CENTER);
		frame.getContentPane().add(panel3, BorderLayout.PAGE_END);
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		//c.weightx = c.weighty = 1.0;
		c.insets = new Insets(2,2,2,2);
		c.anchor = GridBagConstraints.LINE_END;
		player.setFont(new Font("Serif", Font.BOLD, 25));
		player.setForeground(Color.DARK_GRAY);
		panel1.add(player,c);
		c.gridy++;
		username.setFont(new Font("Serif", Font.BOLD, 25));
		username.setForeground(Color.DARK_GRAY);
		panel1.add(username,c);
		c.gridy++;
		charName.setFont(new Font("Serif", Font.BOLD, 24));
		charName.setForeground(Color.DARK_GRAY);
		panel1.add(charName,c);
		
		c.anchor = GridBagConstraints.LINE_START;
		c.gridx = 1;
		c.gridy = 0;
		panel1.add(pName,c);
		c.gridy++;
		panel1.add(uName,c);
		c.gridy++;
		panel1.add(cName,c);
		
		
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		c.fill = GridBagConstraints.CENTER;
		type.setFont(new Font("Serif", Font.BOLD, 30));
		type.setForeground(Color.GRAY);
		panel2.add(type, c);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		cowboy.setForeground(Color.DARK_GRAY);
		panel2.add(cowboy,c);
		c.gridx++;
		ninja.setForeground(Color.DARK_GRAY);
		panel2.add(ninja,c);
		c.gridx++;
		spaceman.setForeground(Color.DARK_GRAY);
		panel2.add(spaceman,c);
		c.gridx++;
		viking.setForeground(Color.DARK_GRAY);
		panel2.add(viking,c);
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 4;
		c.gridheight = 2;
		c.fill = GridBagConstraints.BOTH;
		beginGame.setFont(new Font("", Font.PLAIN,20));
		beginGame.setForeground(Color.DARK_GRAY);
		panel2.add(beginGame,c);
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.weightx = c.weighty = 1.0;
		c.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(home,c);
		c.gridx = 3;
		panel3.add(dispHS,c);
		frame.pack();
		
		//String playerName = pName.toString();
		
			
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
		frame.setResizable(true);
		//frame.pack();
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

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		
	}
	
}
