import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//windows

public class mainWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JTextField textfield;
	private JButton button;
	public static popupwindow popup;
	public mainWindow () {
		setLayout(new FlowLayout());
		label = new JLabel("Team organization");
		add(label);
		
		textfield = new JTextField("name", 25);
		add(textfield);
		
		button = new JButton("add task");
		add(button);
		
		
		buttonclick click = new buttonclick();
		button.addActionListener(click);
	}
	public class buttonclick implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent click) {
			// TODO Auto-generated method stub
			popup = new popupwindow();
			popup.setDefaultCloseOperation(EXIT_ON_CLOSE);
			popup.setSize(500,500);
			popup.setVisible(true);
			popup.setTitle("pop up");
			
		}
		
	}
	
}
