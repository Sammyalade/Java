import java.util.Scanner;
public class Products{

	public static void main(String... args){
	
	Scanner collector = new Scanner(System.in);
	
	System.out.print("Enter first number: ");
	int number1 = collector.nextInt();
	
	System.out.print("Enter second number: ");
	int number2 = collector.nextInt();
	
	System.out.print(calculateProduct(number1, number2));

	}
	
	public static int calculateProduct(int number1, int number2){
		int total = 0;

			for(int count = 0; count != number2; count++){
				total = total + number1;
			}
		
		return total;
	
	}

}