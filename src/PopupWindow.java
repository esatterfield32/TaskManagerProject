import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//windows

public class PopupWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel  instructions;
	public JButton doneButton;
	public JButton highPriority;
	public JButton mediumPriority;
	public JButton lowPriority;
	public static boolean high = false;
	public static boolean medium = false;
	public static boolean low = false;
	public static String taskValue;
	private JTextField taskName;

	public PopupWindow() {
		setLayout(new FlowLayout());
		instructions  = new JLabel("Add the Task by typing it below and clicking done.");
		add(instructions);

		taskName = new JTextField("name", 25);
		add(taskName);

		doneButton = new JButton("Done");
		add(doneButton);
		DoneButtonClick doneClick = new DoneButtonClick();
		doneButton.addActionListener(doneClick);

		highPriority = new JButton("High Priority");
		add(highPriority);
		HighButtonClick highClick = new HighButtonClick();
		highPriority.addActionListener(highClick);

		mediumPriority = new JButton("Medium Priority");
		add(mediumPriority);
		MediumButtonClick mediumClick = new MediumButtonClick();
		mediumPriority.addActionListener(mediumClick);

		lowPriority = new JButton("Low Priority");
		add(lowPriority);
		LowButtonClick lowClick = new LowButtonClick();
		lowPriority.addActionListener(lowClick);
	}

public class DoneButtonClick implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent click) {
		taskValue = taskName.getText();
		System.out.println(taskValue);
		MainWindow.popup.setVisible(false);
		MainWindow.popup.dispose();
		DrawRect.createAndShowGui();
	}

}

public class HighButtonClick implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent click) {
		high = true;
	}

}
public class MediumButtonClick implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent click) {
		medium = true;
	}

}
public class LowButtonClick implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent click) {
		low = true;
	}
	}

}
