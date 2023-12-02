import java.util.Scanner;

public class ComparingInteger{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		int square = number * number;
		int number2 = 100;
		
		
		if (number > number2) {
		if (square > number2)
		System.out.printf("%d and %d is greater than %d", number, square, number2);
		}
		if (number < number2) {
		if (square < number2)
		System.out.printf("%d and %d is less than %d", number, square, number2);
		}
		if (square == number2) {
		if (number < number2)
		System.out.printf("square is equals to %d, but number is less", number2);
		}
		if (square > number2) {
		if (number < number2)
		System.out.printf("square is greater than %d but number is less", number2);
		}
		if (number == number2) {
		if (square > number2)
		System.out.printf("%d is equals to but %d is greater than %d", number, square, number2);
		}
	}

}