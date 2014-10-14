package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawSmiley extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
		
		for (int y = 0; y < 400; y += 100) {
			g.fillRect(50, y, 50, 50);
			g.fillRect(150, y, 50, 50);
			g.fillRect(250, y, 50, 50);
			g.fillRect(350, y, 50, 50);
		}
		
		for (int y = 50; y < 400; y += 100) {
			g.fillRect(0, y, 50, 50);
			g.fillRect(100, y, 50, 50);
			g.fillRect(200, y, 50, 50);
			g.fillRect(300, y, 50, 50);
		}
		
		/* g.fillRect(100, 200, 100, 100);
		g.fillRect(300, 200, 100, 100);
		g.fillRect(500, 200, 100, 100);
		g.fillRect(700, 200, 100, 100);
		
		g.fillRect(0, 300, 100, 100);
		g.fillRect(200, 300, 100, 100);
		g.fillRect(400, 300, 100, 100);
		g.fillRect(600, 300, 100, 100);
		
		g.fillRect(100, 400, 100, 100);
		g.fillRect(300, 400, 100, 100);
		g.fillRect(500, 400, 100, 100);
		g.fillRect(700, 400, 100, 100);
		
		g.fillRect(0, 500, 100, 100);
		g.fillRect(200, 500, 100, 100);
		g.fillRect(400, 500, 100, 100);
		g.fillRect(600, 500, 100, 100);
		
		g.fillRect(100, 600, 100, 100);
		g.fillRect(300, 600, 100, 100);
		g.fillRect(500, 600, 100, 100);
		g.fillRect(700, 600, 100, 100);
		
		g.fillRect(0, 700, 100, 100);
		g.fillRect(200, 700, 100, 100);
		g.fillRect(400, 700, 100, 100);
		g.fillRect(600, 700, 100, 100); */
		
		// g.fillRect(0, 0, getWidth() / 8, getWidth() / 8);
		
		/* g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		g.fillOval(50, 110, 120, 60);
		
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40); */
		
	}

}
