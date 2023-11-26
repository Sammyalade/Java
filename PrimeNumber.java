import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int userInput = collector.nextInt();

		if (userInput <= 1){
		System.out.print("The number is not a prime number");
		}
		
		boolean yesItIsPrime = true;
		
		double squareRoot = Math.pow(userInput, 0.5);
		
		for(int constant = 2; constant < userInput; constant ++){
			if (userInput % constant == 0){
				yesItIsPrime = false;
			} 
			  
		}
	if (yesItIsPrime == false){
	    System.out.print("It is not a prime number");
	} else {
	     System.out.print("It is a prime number");
	  }

	}


}
		