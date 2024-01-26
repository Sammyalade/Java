import java.util.Scanner;
public class FactorialCalculator{

	public static void main(String... args){
	
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter a positive number between 1 - 10: ");
		int number = collector.nextInt();
		
		System.out.print(calculateFactorial(number));
		
		
	}
	
	public static int calculateFactorial(int number){
	
		if (number == 0 || number == 1){
		
			return 1;
		
		} else {
	
			int answer = number * calculateFactorial(number - 1);
			return answer;
		}
	
	
	}

}