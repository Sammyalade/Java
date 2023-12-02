import java.util.Scanner;

public class DivisibleNumbers{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);	
		System.out.printf("Enter a number: ");
		int number1 = inputCollector.nextInt();
		
		if (number1 % 5 == 0 && number1 % 6 == 0){
		System.out.printf("is %d divisible by 5 and 6? true %n", number1);
		}
		else
		System.out.printf("is %d divisible by 5 and 6? false %n", number1);

		if (number1 % 5 == 0 || number1 % 6 == 0){
		System.out.printf("%d is divisible by 5 or 6? true %n", number1);
		}
		else
		System.out.printf("%d is divisible by 5 or 6? false %n", number1);

		if (number1 % 5 == 0 ^ number1 % 6 == 0){
		System.out.printf("is %d divisible by either 5 or 6, but not both? true", number1);
		}
		else
		System.out.printf("is %d divisible by either 5 or 6, but not both? false", number1);

	}

}