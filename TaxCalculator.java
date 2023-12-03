import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter your First Name: ");
		String firstName = collector.next();

		System.out.print("Enter your Last Name: ");
		String lastName = collector.next();

		System.out.print("Enter your Earnings: ");
		int earnings = collector.nextInt();
		
		if (earnings < 30000){
		double tax = 0.15 * earnings;
		System.out.printf("Total Tax due to %s %s is $%.2f", firstName, lastName, tax);
		}
		else 
		if (earnings >= 30000){		 
		double tax = 0.20 * earnings;
		System.out.printf("Total Tax due to %s %s $%.2f", firstName, lastName, tax);
		}

		
	}



}