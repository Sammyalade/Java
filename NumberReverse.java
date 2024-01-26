import java.util.Scanner;
public class NumberReverse{

	public static void main(String... args){
	
		Scanner collector = new Scanner(System.in);
	
		System.out.print("Enter a five Digit number: ");
		int userInput = collector.nextInt();
		int [] seperatedDigits = new int [5];
		int seperator = userInput % 10;
		int newValue = userInput / 10;
		seperatedDigits[0] = seperator;
		for(int count = 1;count < 5; count++){
			seperator = newValue % 10;
			newValue = newValue / 10;
			seperatedDigits[count] = seperator;
		}
		
		System.out.printf("%d%d%d%d%d", seperatedDigits[0], seperatedDigits[1], seperatedDigits[2], seperatedDigits[3], seperatedDigits[4]);
	}

}