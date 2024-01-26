import java.util.Arrays;
import java.util.Scanner;

public class ElementInArrayChecker{

	public static void main(String[] args){
		
		Scanner collector= new Scanner(System.in);

		System.out.println("Enter a number: ");
		int userInput = collector.nextInt();
		
		int[] score = {5, 7, 10, 99, 14};
	
		if (userInput == score[0]){ System.out.println("Available"); }
		else
		if (userInput == score[1]){ System.out.println("Available"); }
		else
		if (userInput == score[2]){ System.out.println("Available"); }
		else
		if (userInput == score[3]){ System.out.println("Available"); }
		else
		if (userInput == score[4]){ System.out.println("Available"); }
		else { System.out.println(Arrays.toString(score)); }



	}



}