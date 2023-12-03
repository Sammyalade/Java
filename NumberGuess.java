import java.util.Scanner;
import java.security.SecureRandom;
public class NumberGuess{
	public static void main(String[] args){
	
		Scanner collector = new Scanner(System.in);
		SecureRandom randomGenerator = new SecureRandom();
		int computerGuess = randomGenerator.nextInt(1,10);

		System.out.print("Enter your guess from 1-9: ");
		int userGuess = collector.nextInt();
 		
		int count = 1;
		while (count <= 30){
		if (userGuess < 0){
		System.out.println("invalid input, try again: ");
		System.out.print("Enter your guess from 1-9: ");
		userGuess = collector.nextInt();
		} else
		if (userGuess > 10){
		System.out.println("invalid input, try again: ");
		System.out.print("Enter your guess from 1-9: ");
		userGuess = collector.nextInt();
		} else
		if (userGuess > 0 && userGuess <= 9){
		break;
		}
		count += 1;
		}
		
		if (computerGuess > userGuess){
		System.out.println("Sorry, your guess is too low. Random number is " + computerGuess);} 
		else
		if (computerGuess < userGuess){
		System.out.println("Sorry, your guess is too high. Random number is " + computerGuess);} 
		else 
		if (computerGuess == userGuess){
		System.out.printf("You are a genius. Your guess of %d is equals Random number %d%n", userGuess, computerGuess);
		}
		
	}

}
