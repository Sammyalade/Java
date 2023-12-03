import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the second integer: "); 
		int number2 = input.nextInt();

		int square1 = number1 * number1;
		int square2 = number2 * number2;
		int sum = square1 + square2;
		int difference = square1 - square2;
		System.out.printf("Square of first integer is %d%nSquare of second integer is %d%n", square1, square2);
		System.out.printf("Sum of the squares is %d%nDifference of the square is %d%n", sum, difference);
	}

}