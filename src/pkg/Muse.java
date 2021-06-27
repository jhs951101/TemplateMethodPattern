package pkg;

public class Muse extends SchoolGroup {
	
	public Muse(String gn){
		GroupName = gn;
	}

	@Override
	public void train() {
		System.out.println("The member of " + GroupName + " has finished training performance.");
		System.out.println("dancing together, They trained performance.");
	}

	@Override
	public void perform() {
		System.out.println("The member of " + GroupName + " has finished performing!");
		System.out.println("dancing together, They performed.");
		System.out.println("");
	}
	
}