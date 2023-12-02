import java.util.Scanner;

public class ArithmeticLargestAndSmallest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int number3 = input.nextInt();

		int sum = number1 + number2 + number3;
		int average = (number1 + number2 + number3) / 3;
		int product = number1 * number2 * number3;
		
		System.out.printf("Sum of the numbers equals %d%nAverage of the numbers equals %d%nProduct of the numbers equals %d%n", sum, average, product);

		if (number1 > number2) {
		if (number1 > number3)
		System.out.printf("%d is the largest number%n", number1);
		}
		if (number2 > number1) {
		if (number2 > number3)
		System.out.printf("%d is the largest number%n", number2);
		}
		if (number3 > number1) {
		if (number3 > number2)
		System.out.printf("%d is the largest number%n", number3);
		}

		if (number1 < number2) {
		if (number1 < number3)
		System.out.printf("%d is the smallest number%n", number1);
		}
		if (number2 < number1) {
		if (number2 < number3)
		System.out.printf("%d is the smallest number%n", number2);
		}
		if (number3 < number1) {
		if (number3 < number2)
		System.out.printf("%d is the smallest number%n", number3);
		}

	}

}