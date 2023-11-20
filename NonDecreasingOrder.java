import java.util.Scanner;

public class NonDecreasingOrder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();

		System.out.print("Enter second number: ");
		int number2 = input.nextInt();

		System.out.print("Enter second number: ");
		int number3 = input.nextInt();

		int display = number1;

		if (number2 <= display){
		display = number2;
		}

		if (number3 <= display){
		display = number3;
		}

		System.out.print(display + "\t");

		if (number1 >= number2 && number1 <= number3){
		System.out.print(number1 + "\t");
		}
		
		if (number1 <= number2 && number1 >= number3){
		System.out.print(number1 + "\t");
		}

		if (number2 >= number1 && number2 <= number3){
		System.out.print(number2 + "\t");
		}

		if (number2 <= number1 && number2 >= number3){
		System.out.print(number2 + "\t");
		}
		

		if (number3 >= number1 && number3 <= number2){
		System.out.print(number3 + "\t");
		}
		
		if (number3 <= number1 && number3 >= number2){
		System.out.print(number3 + "\t");
		}
		
		
		if (number1 >= display){
		display = number1;
		}
		
		if (number2 >= display){
		display = number2;
		}

		if (number3 >= display){
		display = number3;
		}

		System.out.print(display);



	}


}