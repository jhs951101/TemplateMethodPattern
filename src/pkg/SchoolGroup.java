package pkg;

public abstract class SchoolGroup {
	
	protected String GroupName;
	
	public void prepareAndDoPerformance(){
		gatherTogether();
		planAndDiscuss();
		train();
		perform();
	}
	
	public void gatherTogether(){
		System.out.println("The member of " + GroupName + " has gathered together.");
	}
	
	public void planAndDiscuss(){
		System.out.println("The member of " + GroupName + " has finished planning and discussing.");
	}
	
	public abstract void train();
	
	public abstract void perform();
}