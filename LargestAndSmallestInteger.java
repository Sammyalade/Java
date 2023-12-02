import java.util.Scanner;

public class LargestAndSmallestInteger{
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

		if (number1 > number2){
		if (number1 > number3)
		if (number1 > number4)
		if (number1 > number5)
		System.out.printf("%d is the largest%n", number1);
		}

		if (number2 > number1){
		if (number2 > number3)
		if (number2 > number4)
		if (number2 > number5)
		System.out.printf("%d is the largest%n", number2);
		}
		
		if (number3 > number1){
		if (number3 > number2)
		if (number3 > number4)
		if (number3 > number5)
		System.out.printf("%d is the largest%n", number3);
		}

		if (number4 > number1){
		if (number4 > number2)
		if (number4 > number3)
		if (number4 > number5)
		System.out.printf("%d is the largest%n", number4);
		}

		if (number5 > number1){
		if (number5 > number2)
		if (number5 > number3)
		if (number5 > number4)
		System.out.printf("%d is the largest%n", number5);
		}
		
		if (number1 < number2){
		if (number1 < number3)
		if (number1 < number4)
		if (number1 < number5)
		System.out.printf("%d is the smallest%n", number1);
		}

		if (number2 < number1){
		if (number2 < number3)
		if (number2 < number4)
		if (number2 < number5)
		System.out.printf("%d is the smallest%n", number2);
		}

		if (number3 < number1){
		if (number3 < number2)
		if (number3 < number4)
		if (number3 < number5)
		System.out.printf("%d is the smallest%n", number3);
		}

		if (number4 < number1){
		if (number4 < number2)
		if (number4 < number3)
		if (number4 < number5)
		System.out.printf("%d is the smallest%n", number4);
		}

		if (number5 < number1){
		if (number5 < number2)
		if (number5 < number3)
		if (number5 < number4)
		System.out.printf("%d is the smallest%n", number5);
		}

	}

}