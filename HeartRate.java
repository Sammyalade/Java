public class HeartRate{

	private String firstName;
	private String lastName;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	
	public HeartRate(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth){

	this.firstName = firstName;
	this.lastName = lastName;
	this.dayOfBirth = dayOfBirth;
	this.monthOfBirth = monthOfBirth;
	this.yearOfBirth = yearOfBirth;
	
	}
	
	
	
	public void setFirstName(String firstName){
	this.firstName = firstName;
	}

	
	public void setLastName(String lastName){
	this.lastName = lastName;
	}

	
	public void setDayOfBirth(int dayOfBirth){
	this.dayOfBirth = dayOfBirth;
	}
	
	public void setMonthOfBirth(int monthOfBirth){
	this.monthOfBirth = monthOfBirth;
	}

	
	public void setYearOfBirth(int yearOfBirth){
	this.yearOfBirth = yearOfBirth;
	}


	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
	return lastName;	
	}

	public int getDayOfBirth(){
	return dayOfBirth;	
	}

	public int getMonthOfBirth(){
	return monthOfBirth;	
	}

	public int getYearOfBirth(){
	return yearOfBirth;	
	}

	public int getAgeInYears(){
	int ageInYears = 2023 - yearOfBirth;
	return ageInYears;	
	}
	
	
	public int maximumHeartRate(){
	int ageInYears = getAgeInYears();
	int heartInRate = 220 - ageInYears;
	return heartInRate;
	}

	

}









