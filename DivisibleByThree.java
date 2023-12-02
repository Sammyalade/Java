import java.util.Scanner;

public class DivisibleByThree{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		int division = number % 3;
		
		if (division > 0) System.out.print("Number is not divisible by 3");

		if (division == 0) System.out.print("Number is divisible by 3");

	}

}