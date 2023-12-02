import java.util.Scanner;

public class AddingSeperatedDigit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number between 0 to 1000: ");
		int number = input.nextInt();
		
		int number1 = number / 100;

		int number2 = number % 100;
		
		int number3 = number2 / 10;

		int number4 = number2 % 10;

		int number5 = number / 1;

		int sum = number1 + number3 + number4;
   		
		System.out.printf(" Sum equals to %d", sum);





	}


}