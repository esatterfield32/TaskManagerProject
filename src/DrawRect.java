import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class DrawRect extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int RECT_X = 20;
	private static final int RECT_Y = RECT_X;
	private static final int RECT_WIDTH = 100;
	private static final int RECT_HEIGHT = RECT_WIDTH;
	
	public void paint(Graphics g) {
	 Graphics2D g2= (Graphics2D)g;
	 g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	 Shape redRect = new Rectangle2D.Float(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
	 g2.draw(redRect);
	}
	

	public void redRectangle(Graphics m) {
		super.paintComponent(m);
		Graphics2D g2= (Graphics2D)m;
		Shape redRect = new Rectangle2D.Float(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
		g2.setColor(Color.RED);
		g2.draw(redRect);
		g2.fill(redRect);
		
	}
	
	public void yellowRectangle(Graphics g) { 
		super.paintComponent(g);
		Graphics2D g2= (Graphics2D)g;
		Shape yellowRect = new Rectangle2D.Float(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
		g2.setColor(Color.yellow);
		g2.draw(yellowRect);
		g2.fill(yellowRect);
		
	}
	public void greenRectangle(Graphics g) { 
		super.paintComponent(g);
		Graphics2D g2= (Graphics2D)g;
		Shape greenRect = new Rectangle2D.Float(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
		g2.setColor(Color.green);
		g2.draw(greenRect);
		g2.fill(greenRect);
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		// so that our GUI is big enough
		return new Dimension(RECT_WIDTH + 2 * RECT_X, RECT_HEIGHT + 2 * RECT_Y);
	}

	// create the GUI explicitly on the Swing event thread
	public static void createAndShowGui() {

		DrawRect mainPanel = new DrawRect();
		MainClass.gui.getContentPane().add(mainPanel);
		MainClass.gui.pack();
		MainClass.gui.setLocationByPlatform(true);
		MainClass.gui.setVisible(true);
	}

}