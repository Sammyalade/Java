import java.util.Scanner;
public class MultiplicationTable{

	public static void main(String... args){
	
		Scanner collector = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int number = collector.nextInt();
		
		for(int count = 1; count < 13; count++){
	
			System.out.printf("%d x %d = %d%n", number, count, (number * count));
	
		}
	
	}

}