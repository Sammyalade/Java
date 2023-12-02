import java.util.Scanner;

public class SimpleArithmetic{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer");
		int userInput = input.nextInt();

		System.out.println("Enter second integer");
		int userInput2 = input.nextInt();

		double calculation = Math.pow(userInput, userInput2);
		int result = (int) calculation;
		System.out.printf("The result is %d", result);

	}


}