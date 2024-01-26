import java.util.Scanner;
public class ReversedNumber{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter five digit number: ");
		int number = input.nextInt();

		String display = "";
		int divider = 10000;
		for(int count = 0; count < 5; count++){
			
			if(count == 0){
				display = "" + (number / divider);
			} else
			if(count > 0){
				display = "" + ((number / divider) % 10);
			}
			int divide = divider / 10;
			divider = divide;
			

		}
		
		
		System.out.print(display);

	}

}