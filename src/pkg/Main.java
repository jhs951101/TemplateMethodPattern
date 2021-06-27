package pkg;

public class Main {
	
	public static void main(String[] args){
		SchoolGroup afterschoolteatime = new AfterSchoolTeaTime("After School Tea Time");
		SchoolGroup muse = new Muse("u's");
		
		afterschoolteatime.prepareAndDoPerformance();
		muse.prepareAndDoPerformance();
	}
}