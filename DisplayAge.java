import java.util.Scanner;
public class DisplayAge{

	public static void main(String... args){
	
		Scanner collector = new Scanner(System.in);
	
		System.out.print("Enter your year of birth: ");
		int yearOfBirth = collector.nextInt();
		
		System.out.printf("Your are %d years old.", (2024 - yearOfBirth));

	}

}