import java.util.Scanner;
public class PrimeNumber{

	public static void main(String... args){
	
		Scanner collector = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int userInput = collector.nextInt();
		int check = 0;
		for(int count = 2; count < userInput; count ++){
	
			if(userInput % count == 0){
				check++;
			}
		}
		
		if(check > 0){
			System.out.print("Not a prime number");
		} else {
			System.out.print("It is a prime number");
		}
	
	}

}