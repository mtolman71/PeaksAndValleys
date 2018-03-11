package edu.unlv.is380.peaksAndValleys;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public static void main (String[] args) {
		
		//new Game();
		Window game = new Window(WIDTH, HEIGHT, "Peaks and Valleys");
		
		for(PlayerType type : PlayerType.values()) {
			System.out.println(type);
		}
	}

	public void run() {
		
	}
	
}
