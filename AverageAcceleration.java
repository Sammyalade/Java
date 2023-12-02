import java.util.Scanner;

public class AverageAcceleration{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Ending velocity: ");
		int endingVelocity = input.nextInt();
		
		System.out.print("Enter the Starting velocity: ");
		int startingVelocity = input.nextInt();

		System.out.print("Enter the Time span: ");
		int timeSpan = input.nextInt();

		double average = (double) (endingVelocity - startingVelocity) * timeSpan;
		
		System.out.printf("Average Acceleration is %f%n", average);
	}

}