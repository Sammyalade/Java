import java.util.Scanner;
public class TimeTable {
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);

		System.out.print("Enter a number from 1 - 12: ");
		double userInput = collector.nextDouble();
		int count = 1;

		while (count <= 12){
			if (userInput < 1 || userInput > 12){
			System.out.print("Nigerians no dey listen to instruction");
			break;
			}
			
			if (userInput == (int) userInput){
			double multiplier = userInput * count;
			System.out.printf("%.0f x %d = %.0f%n", userInput, count, multiplier);
			}
			else
			if (userInput > 0.0){
			System.out.print("Nigerians no dey listen to instruction");
			break;
			}
			count += 1;
		}

	}

}