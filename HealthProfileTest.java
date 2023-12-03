import java.util.Scanner;

public class HealthProfileTest{

	public static void main(String[] args){

	HealthProfile profile1 = new HealthProfile("Olufemi", "Samuel", "Male", "29/12/1990", 170, 80);

	Scanner collector = new Scanner(System.in);

	displayProfile(profile1);
	
	System.out.print("Enter First Name: ");
	String firstName = collector.next();
	profile1.setFirstName(firstName);

	System.out.print("Enter Last Name: ");
	String lastName = collector.next();
	profile1.setLastName(lastName);

	System.out.print("Enter Gender: ");
	String gender = collector.next();
	profile1.setGender(gender);

	System.out.print("Enter Date Of Birth(dd/mm/yyyy): ");
	String dateOfBirth = collector.next();
	profile1.setDateOfBirth(gender);

	System.out.print("Enter Height in Inches: ");
	int height = collector.nextInt();
	profile1.setHeight(height);

	System.out.print("Enter Weight in Pounds: ");
	int weight = collector.nextInt();
	profile1.setWeight(weight);
	
	double bMI = (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
	
	displayProfile(profile1);

	System.out.printf("Your BMI is %f", bMI); 

	}

	public static void displayProfile(HealthProfile profileToDisplay){
		System.out.printf("%s Profile - %nName: %s %s%nGender: %s%nDate Of Birth: %s%nHeight: %d%nWeight: %d%n", 	profileToDisplay.getFirstName(), profileToDisplay.getLastName(), profileToDisplay.getFirstName(), profileToDisplay.getGender(), 	profileToDisplay.getDateOfBirth(), profileToDisplay.getHeight(), profileToDisplay.getWeight());
		
	}


}