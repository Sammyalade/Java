import java.util.Scanner;

public class WorldPopulationCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the world population: ");
		long initialPopulation = input.nextLong();

		double populationYear1 = initialPopulation * 0.0091;
		int wholeNumber1 = (int) populationYear1;
		long totalPopulationAfterYear1 = initialPopulation + wholeNumber1;
		System.out.printf("Population after year 1 is %d%n", totalPopulationAfterYear1);

		double populationYear2 = totalPopulationAfterYear1 * (0.0091);
		int wholeNumber2 = (int) populationYear2;
		long totalPopulationAfterYear2 = totalPopulationAfterYear1 + wholeNumber2;
		System.out.printf("Population after year 2 is %d%n", totalPopulationAfterYear2);

		double populationYear3 = totalPopulationAfterYear2 * (0.0091);
		int wholeNumber3 = (int) populationYear3;
		long totalPopulationAfterYear3 = totalPopulationAfterYear2 + wholeNumber3;
		System.out.printf("Population after year 3 is %d%n", totalPopulationAfterYear3);

		double populationYear4 = totalPopulationAfterYear3 * (0.0091);
		int wholeNumber4 = (int) populationYear4;
		long totalPopulationAfterYear4 = totalPopulationAfterYear3 + wholeNumber4;
		System.out.printf("Population after year 4 is %d%n", totalPopulationAfterYear4);

		double populationYear5 = totalPopulationAfterYear4 * (0.0091);
		int wholeNumber5 = (int) populationYear5;
		long totalPopulationAfterYear5 = totalPopulationAfterYear4 + wholeNumber5 ;
		System.out.printf("Population after year 5 is %d%n", totalPopulationAfterYear5);

	}


}