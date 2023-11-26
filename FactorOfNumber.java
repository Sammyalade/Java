import java.util.Scanner;

public class FactorOfNumber{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);

		System.out.print("Enter a positive number: ");
		int number = collector.nextInt();
		System.out.printf("Factors of %d are:%n", number);
		for(int divider = 1; divider <= number; divider++){
			if (number % divider == 0){
				System.out.println(divider);
			}

		}


	}


}
				