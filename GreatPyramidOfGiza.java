import java.util.Scanner;

public class GreatPyramidOfGiza{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Estimated number of stones used: ");
		int estimatedStoneUsed = input.nextInt();

		System.out.print("Enter the Average weight of each stone: ");
		float averageWeight = input.nextFloat();

		System.out.print("Enter the Number of years taken to build the pyramid: ");
		int numberOfYearsTaken= input.nextInt();

		double calculation1 = averageWeight * (numberOfYearsTaken * 365);
		
		double weightPerDay = estimatedStoneUsed / calculation1;
		
		double weightEachYear = weightPerDay * 20;
		System.out.printf("The weight built each year equals %f%n", weightEachYear);

		double weightEachHour = weightPerDay / 24;
		System.out.printf("The weight built each hour equals %f%n", weightEachHour);

		double weightEachMinute = weightPerDay / (24 * 60);
		System.out.printf("The weight built each minute equals %f%n", weightEachMinute);

	}



}

		

		