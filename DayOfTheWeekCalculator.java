import java.util.Scanner;

public class DayOfTheWeekCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		float year = input.nextFloat();

		System.out.print("Enter the month: ");
		float monthOfTheYear = input.nextFloat();

		System.out.print("Enter the day of the month: ");
		int dayOfTheMonth = input.nextInt();

		if (monthOfTheYear == 1)
		    year -= 1;

		if (monthOfTheYear == 2)
		   year -= 1;
		
		if (monthOfTheYear == 1)
		    monthOfTheYear = 13;
		
		if (monthOfTheYear == 2)
		    monthOfTheYear = 14;


		int dayOfTheWeek;

		float monthCalculated = (26 * (monthOfTheYear + 1)) / 10;

		int yearDivided = (int) (year / 100); 
		float yearModulus = year % 100;

		float calculation1 = dayOfTheMonth + monthCalculated + yearModulus + (yearModulus / 4);

		float calculation2 = (yearDivided / 4) + (5 * yearDivided);

		dayOfTheWeek = (int) ((calculation1 + calculation2) % 7);
		
		
		if (dayOfTheWeek == 0)
		    System.out.print("The day is Saturday");

		if (dayOfTheWeek == 1)
		    System.out.print("The day is Sunday");

		if (dayOfTheWeek == 2)
		    System.out.print("The day is Monday");

		if (dayOfTheWeek == 3)
		    System.out.print("The day is Tuesday");

		if (dayOfTheWeek == 4)
		    System.out.print("The day is Wednesday");

		if (dayOfTheWeek == 5)
		    System.out.print("The day is Thursday");

		if (dayOfTheWeek == 6)
		    System.out.print("The day is Friday");

	}



}










		