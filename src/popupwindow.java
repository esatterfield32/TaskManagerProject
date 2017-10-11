import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;//windows

public class popupwindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel  instructions;
	public JButton doneButton;
	public JButton highPriority;
	public JButton mediumPriority;
	public JButton lowPriority;
	public static String taskValue;
	private JTextField taskName;
	public String priorityState;
	
	public popupwindow() {

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

	public class DoneButtonClick implements ActionListener{


		@Override
		public void actionPerformed(ActionEvent click) {

			taskValue = taskName.getText();
			System.out.println(taskValue);
			mainWindow.popup.setVisible(false);
			mainWindow.popup.dispose();

			MainClass.tasks.add(new task(taskValue, priorityState));
			System.out.println(MainClass.tasks.size());
			int i = 0;
			for (task p : MainClass.tasks) {
				ArrayList<task> tasks = new ArrayList<task>();
				//display tasks on board
				p.parsePriority();
			}

		}
		// TODO Auto-generated method stub

	}
	public class HighButtonClick implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent click) {
			priorityState = "high";
		}
	}
	public class MediumButtonClick implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent click) {
			priorityState = "medium";
		}
	}
	public class LowButtonClick implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent click) {
			priorityState = "low";

		}

	}
}
