import java.util.Scanner;
public class AbsoluteValue{
	public static void main(String[] args){
	
		Scanner collector = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int userInput = collector.nextInt();

		if (userInput < 0){
			int display = (userInput * (-1));
			System.out.printf("The absolute of %d is %d", userInput, display); 
		}
		else {
			int display = (userInput * 1);
			System.out.printf("The absolute of %d is %d", userInput, display); 
		}		
	}

}