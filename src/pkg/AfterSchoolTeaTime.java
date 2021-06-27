package pkg;

public class AfterSchoolTeaTime extends SchoolGroup {
	
	public AfterSchoolTeaTime(String gn){
		GroupName = gn;
	}
	
	@Override
	public void train() {
		System.out.println("The member of " + GroupName + " has finished training performance.");
		System.out.println("They trained performance with instruments.");
	}

	@Override
	public void perform() {
		System.out.println("The member of " + GroupName + " has finished performing!");
		System.out.println("They performed with instruments.");
		System.out.println("");
	}
}