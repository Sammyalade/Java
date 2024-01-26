import java.util.Scanner;
public class FactorialCalculator2{

	public static void main(String... args){
	
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter a positive number between 1 - 20: ");
		int number = collector.nextInt();
		
		int factorial = 1;
		
		if (number == 0 || number == 1){
				System.out.print("1");
		} else {
			
			for(int count = number; count != 1; count--){
				factorial = factorial * count;
			}
		
			System.out.print(factorial);
		}
		
		
	}


}