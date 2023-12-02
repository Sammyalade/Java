import java.util.Scanner;

public class Investment{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		System.out.println("Enter  Investment Amount");
		double investmentAmount = inputCollector.nextDouble();
		
		System.out.println("Enter rate in percentage");
		double rateInPercentage = inputCollector.nextDouble();

		System.out.println("Enter  number of years");
		int numberOfYears = inputCollector.nextInt();

		double monthlyInterestRate = (rateInPercentage / 100) / 12;

		double calculation1 = monthlyInterestRate + 1;

		int numberOfMonth = numberOfYears * 12;

		double calculation2 = Math.pow(calculation1, numberOfMonth);
	
		double accumulatedValue = calculation2 * investmentAmount;
		System.out.printf("Accumulated Value is %.2f", accumulatedValue);

	}

}

		