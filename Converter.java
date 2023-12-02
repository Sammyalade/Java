import java.util.Scanner;

public class Converter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number in pounds: ");
		double pounds = input.nextDouble();
		
		double kilogram = (double) pounds * 0.454;
		System.out.printf("Kilogram is %.3f", kilogram);
	}

}