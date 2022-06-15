package main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	public GamePanel() {
		
	}
	//method in JPanel
	// gets called when we start the game
	//Graphics = paintbrush
	public void paintComponent(Graphics g) {
		//super = JPanel
		super.paintComponent(g);
		g.fillRect(100, 100, 200, 50);
	}

}
