import java.util.Scanner;

public class DayCalculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number of Years: ");
		int userInput = scanner.nextInt();
		
		int daysInAYear = 365;

		int numberOfDays = userInput * daysInAYear;
		System.out.printf("Number of days equals %d days", numberOfDays);

	}


}