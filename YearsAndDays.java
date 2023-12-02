import java.util.Scanner;

public class YearsAndDays{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int noOfMinutes = input.nextInt();
		
		int numberOfYears = noOfMinutes / (60 * 24 * 365);
		
		int numberOfMinRemaining = noOfMinutes - (numberOfYears * (60 * 24 * 365));

		int numberOfDays = numberOfMinRemaining / (60 *24);

		System.out.printf("%d years %d days", numberOfYears, numberOfDays);
	}

}