
public class task {
	private String taskName;
	private String priority;

	public task(String taskName, String priority){
		this.taskName = taskName;
		this.priority = priority;
	}
	
	public void parsePriority() {

		if (priority.equals("high")){
			System.out.println("red box");
			DrawRect.createAndShowGui();
			DrawRect.redRectangle(MainClass.gui);
			//call the drawRect class method draw red rectangle
			System.out.println("got here");
			
		}
		else if (priority.equals("medium")) {
			System.out.println("yellow box");
		}
		else {
			System.out.println("green box");
		}
		
	}
	
	public String toString() {
        return "Name = " + this.taskName + ", priority = " + this.priority;
    }
	
	
}
