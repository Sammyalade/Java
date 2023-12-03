import java.util.Scanner;
public class SalesCommissionCalculator{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter the Salesperson's sales for the week: ");
		double salesForTheWeek = collector.nextDouble();
	
		double commission = 0.09 * salesForTheWeek;
		
		double earningForTheWeek = 200 + commission;

		System.out.printf("Total earnings for the week: $%.2f", earningForTheWeek);

	}



}