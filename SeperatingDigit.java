import java.util.Scanner;

public class SeperatingDigit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five digits: ");
		int number = input.nextInt();
		
		int number1 = number / 10000;

		int num2 = number % 10000;

		int number2 = num2 / 1000;
		
		int num3 = num2 % 1000;

		int number3 = num3 / 100;

		int num4 = num3 % 100;

		int number4 = num4 / 10;

		int num5 = num4 % 10;

		int number5 = num5 / 1;
   		
		System.out.printf("   %d   %d   %d   %d   %d   ", number1, number2, number3, number4, number5);





	}


}