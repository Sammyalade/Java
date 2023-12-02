import java.util.Scanner;

public class RaiseToPower{

	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int number1 = collector.nextInt();

		System.out.print("Enter second number: ");
		int number2 = collector.nextInt();
		
		int count = 0;		
		int number3 = 1;
		while (count != number2){
			number3 *= number1;
			count += 1;
		}
	System.out.print(number1 + " raised to the power of " + number2 + " is " + number3);


	}

}