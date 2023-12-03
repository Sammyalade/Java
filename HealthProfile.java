public class HealthProfile{

	private String firstName;
	private String lastName;
	private String gender;
	private String dateOfBirth;
	private int height;
	private int weight;

	public HealthProfile(String firstName, String lastName, String gender, String dateOfBirth, int height, int weight){
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.dateOfBirth = dateOfBirth;
	this.height = height;
	this.weight = weight;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public void setHeight(int height){
		this.height = height;
	}

	public void setWeight(int Weight){
		this.weight = weight;
	}



	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public String getGender(){
		return gender;
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	}


	public int getHeight(){
		return height;
	}

	public int getWeight(){
		return weight;
	}



}





