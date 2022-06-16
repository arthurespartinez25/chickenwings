package main;

import java.awt.Graphics;
import javax.swing.JPanel;

import Inputs.KeyboardInputs;

public class GamePanel extends JPanel{
	
	public GamePanel() {
		
		addKeyListener(new KeyboardInputs());
		
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
