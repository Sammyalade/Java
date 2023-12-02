 import java.util.Scanner;

public class BMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the weight in pounds: ");
		int weight = input.nextInt();
		
		System.out.print("Enter the height in inches: ");
		int height = input.nextInt();
		
		double heightInMeters = height * 0.0254;

		double heightSquare = heightInMeters * heightInMeters;
		 
		double weightInKilogram = weight * 0.45359237;

		double bMI = weightInKilogram / heightSquare; 
		

		System.out.printf("BMI is %f%n", bMI);

		if (bMI < 18.5) {
		System.out.print("Underweight");
		}

		if (bMI >= 18.5 && bMI <= 24.9) {
		System.out.print("Normalweight");
		}

		if (bMI >= 25.0 && bMI <= 29.9) {
		
		System.out.print("Overweight");
		}

		if (bMI >= 30) {
		System.out.print("Obesity");
		}
	}

}
		