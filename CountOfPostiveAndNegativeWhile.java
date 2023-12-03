import java.util.Scanner;
public class CountOfPostiveAndNegativeWhile{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		int positiveCount = 0;
		int negativeCount = 0;
		int sumOfInput = 0;
		int countOfInput = 0;
		int userInput = 1;
		
		while (userInput != 0){
			System.out.print("Enter an integer or enter 0 to end: ");
			userInput = collector.nextInt();
			if (userInput == 0){
				break;
			}
			if (userInput > 0){
			positiveCount += 1;
			}
			else
			if (userInput < 0){
			negativeCount += 1;
			} 

			countOfInput += 1;
			sumOfInput += userInput;
			
		}

		if (countOfInput == 0){
		System.out.print("No numbers are entered except 0");
		}

		else 
		if (countOfInput > 0){
		System.out.printf("The number of positives is %d%n", positiveCount);
		System.out.printf("The number of negatives is %d%n", negativeCount);
		System.out.printf("The sum of input is %d%n", sumOfInput);
		float average = (float)(sumOfInput) / (float)(countOfInput);
		System.out.println("The average is " +  average);
		}

	}



}
		