
public class task {
	private String taskName;
	private String priority;

	public task(String taskName, String priority){
		this.taskName = taskName;
		this.priority = priority;
	}
	
	public void parsePriority(String priority) {
		priority = getPriority()
		if (priority.equals("high")){
			System.out.println("red box");
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
	
	public String getPriority(){
		
		prioritystate = popupwindow.priorityState;
		
		return  prioritystate;
	}
	
}
