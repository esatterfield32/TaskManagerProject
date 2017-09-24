import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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

	private String[] taskValue;
	private String[] priorityValue;
	@Override
	protected void paintComponent(Graphics g) {

		for (int i = 0; i <10; i++) {
			priorityValue[i] = popupwindow.priorityState;
			taskValue[i] = popupwindow.taskValue;
			System.out.println(popupwindow.priorityState);
			System.out.println(taskValue[i] + "Im in the rect class");

			


			g.fillRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
			g.setColor(Color.black);
		}




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