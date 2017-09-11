import javax.swing.JFrame;

public class MainClass {
	public static mainWindow gui = new mainWindow();
public static void main(String args[]) {
		
		
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(1000,1000);
		gui.setVisible(true);
		gui.setTitle("Gui Practice");
	}
}
