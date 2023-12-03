public class Semicolon{

	private int numberOfStudent;
	private int numberOfCohort;
	
	public Semicolon(int numberOfStudent, int numberOfCohort){
		this.numberOfCohort = numberOfCohort;
		this.numberOfStudent = numberOfStudent;
	}
	public  void setNumberOfStudent(int numberOfStudent){
		this.numberOfStudent = numberOfStudent;
	}
	public  void setNumberOfCohort(int numberOfCohort){
		this.numberOfCohort = numberOfCohort;
	}

	public int getNumberOfCohort(){
		return numberOfCohort;
	}

	public int getNumberOfStudent(){
		return numberOfStudent;
	}


}