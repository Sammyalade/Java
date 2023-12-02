import java.util.Scanner;

public class PositiveAndNegativeCount{

	public static void main(String[] args){
	
		Scanner collector = new Scanner(System.in);
		
		
		int userInput = 1;
		int positiveCount = 0;
		int negativeCount = 0;
		
		while (userInput != 0){
			System.out.print("Enter a number or 0 to cancel: ");
			userInput = collector.nextInt();
			
			if (userInput > 0){
				positiveCount += 1;
			} else 
			if (userInput < 0) {
				negativeCount += 1;
			  }
		}



		System.out.printf("Number of postive number entered is %d, Number of negative number entered is %d", positiveCount, negativeCount);
	}



}