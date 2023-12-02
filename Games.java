import java.util.Scanner;

public class Games{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter player one name: ");
		String playerOne = input.nextLine();

		System.out.print("Enter player two name: ");
		String playerTwo = input.nextLine();

		int scissors = 0;
		int rock = 1;
		int paper = 2;

		System.out.printf("%s enter a number between 0, 1, 2: ", playerOne);
		int playerOneInput = input.nextInt();

		System.out.printf("%s enter a number between 0, 1, 2: ", playerTwo);
		int playerTwoInput = input.nextInt();

		if (playerOneInput == scissors && playerTwoInput == paper){
		System.out.printf("%s wins, %s loses", playerOne, playerTwo); 
		}

		if (playerOneInput == paper && playerTwoInput == scissors){
		System.out.printf("%s wins, %s loses", playerTwo, playerOne); 
		}

		if (playerOneInput == rock && playerTwoInput == scissors){
		System.out.printf("%s wins, %s loses", playerOne, playerTwo); 
		}

		if (playerOneInput == scissors && playerTwoInput == rock){
		System.out.printf("%s wins, %s loses", playerTwo, playerOne); 
		}

		if (playerOneInput == paper && playerTwoInput == rock){
		System.out.printf("%s wins, %s loses", playerOne, playerTwo); 
		}

		if (playerOneInput == rock && playerTwoInput == paper){
		System.out.printf("%s wins, %s loses", playerTwo, playerOne); 
		}

		if (playerOneInput == rock && playerTwoInput == rock){
		System.out.printf("%s and %s draw", playerOne, playerTwo); 
		}

		if (playerOneInput == paper && playerTwoInput == paper){
		System.out.printf("%s and %s draw", playerOne, playerTwo); 
		}

		if (playerOneInput == scissors && playerTwoInput == scissors){
		System.out.printf("%s and %s draw", playerOne, playerTwo); 
		}

	}

}

		