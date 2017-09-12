import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//windows

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JTextField textfield;
	private JButton button;
	public static PopupWindow popup;

	public MainWindow() {
		setLayout(new FlowLayout());
		label = new JLabel("Team organization");
		add(label);
		
		textfield = new JTextField("name", 25);
		add(textfield);
		
		button = new JButton("add task");
		add(button);
		
		
		ButtonClick click = new ButtonClick();
		button.addActionListener(click);
	}

	public class ButtonClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent click) {
			popup = new PopupWindow();
			popup.setDefaultCloseOperation(EXIT_ON_CLOSE);
			popup.setSize(500,500);
			popup.setVisible(true);
			popup.setTitle("pop up");
		}
		
	}
	
}
