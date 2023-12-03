import java.util.Scanner;

public class Display{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		if (number == 0) {
		System.out.print("1");
		}

		if (number == 1) {
		System.out.print("0");
		}
	}
}