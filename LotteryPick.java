import java.util.Scanner;

public class LotteryPick{
	public static void main(String[] args){
		
		int lotteryDigit = (int)(Math.random() * 1000);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your three number lottery pick: ");
		int lotteryGuess = input.nextInt();

		int lotteryDigit1 = lotteryDigit / 100;
		int lot1 = lotteryDigit % 100;
		int lotteryDigit2 = lot1 / 10;
		int lotteryDigit3 = lot1 % 10;
		
		System.out.printf("The lottery number is %d  %d  %d%n", lotteryDigit1, lotteryDigit2, lotteryDigit3);

		int lotteryGuess1 = lotteryGuess / 100;
		int lottery1 = lotteryGuess % 100;
		int lotteryGuess2 = lottery1 / 10;
		int lotteryGuess3 = lottery1 % 10;
		
		if (lotteryGuess == lotteryDigit)
		System.out.println("You are a genius, you win $10,000");

		if (lotteryDigit1 == lotteryGuess2){
		   if (lotteryDigit2 == lotteryGuess3)
		    if (lotteryDigit3 == lotteryGuess1)
		     if (lotteryDigit1 == lotteryGuess3)
		      if (lotteryDigit2 == lotteryGuess1)
		       if (lotteryDigit3 == lotteryGuess2)
			System.out.println("Wow, you matched the digits. you win $3,000");
		       }
		

		
		if (lotteryDigit1 == lotteryGuess1
		 || lotteryDigit1 == lotteryGuess2
		 || lotteryDigit1 == lotteryGuess3
		 || lotteryDigit2 == lotteryGuess1
		 || lotteryDigit2 == lotteryGuess2
		 || lotteryDigit2 == lotteryGuess3
		 || lotteryDigit3 == lotteryGuess1
		 || lotteryDigit3 == lotteryGuess2
		 || lotteryDigit3 == lotteryGuess3)
		 System.out.println("You matched at least one digit: you win $1,000");
		
		else
		System.out.println("Sorry, no match");
	}


}