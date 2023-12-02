import java.util.Scanner;

public class Interest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  Balance: ");
		int balance = input.nextInt();
		
		System.out.print("Enter interest rate: ");
		double interestRate = input.nextDouble();

		double calculation = (double) balance * (interestRate / 1200);
		System.out.printf("The interest Rate is %.3f%n", calculation);

	}

}