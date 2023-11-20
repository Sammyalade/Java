import java.util.Scanner;

public class HeadOrTail{
	public static void main(String[] args){
		
		int randomChoice = (int)(0 + Math.random() * 2);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a guess between 0(Head) and 1(Tail): ");
		int userChoice = input.nextInt();

		System.out.printf("Random choice is %d%n", randomChoice);
		
		if (userChoice == 0 && randomChoice == 0
		   ||userChoice == 1 && randomChoice == 1)
		  System.out.println("Your guess is correct");

		else
		    System.out.println("Your guess is wrong");

	
	}

}