import java.util.Scanner;

public class NumberDetector{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter the third number: ");
		int number3 = input.nextInt();

		System.out.print("Enter the fourth number: ");
		int number4 = input.nextInt();
		
		System.out.print("Enter the fifth number: ");
		int number5 = input.nextInt();

		int positiveCount = 0;

		int negativeCount = 0;

		int zeroCount = 0;

		if (number1 > 0) {
		positiveCount += 1;
		}

		if (number1 < 0) {
		negativeCount += 1;
		}

		if (number1 == 0) {
		zeroCount += 1;
		}

		if (number2 > 0) {
		positiveCount += 1;
		}

		if (number2 < 0) {
		negativeCount += 1;
		}

		if (number2 == 0) {
		zeroCount += 1;
		}

		if (number3 > 0) {
		positiveCount += 1;
		}

		if (number3 < 0) {
		negativeCount += 1;
		}

		if (number3 == 0) {
		zeroCount += 1;
		}

		if (number4 > 0) {
		positiveCount += 1;
		}

		if (number4 < 0) {
		negativeCount += 1;
		}

		if (number4 == 0) {
		zeroCount += 1;
		}

		if (number5 > 0) {
		positiveCount += 1;
		}

		if (number5 < 0) {
		negativeCount += 1;
		}

		if (number5 == 0) {
		zeroCount += 1;
		}

		System.out.printf("Number of positive numbers is %d%n", positiveCount);

		System.out.printf("Number of negative numbers is %d%n", negativeCount);

		System.out.printf("Number of zero numbers is %d%n", zeroCount);

	}

}