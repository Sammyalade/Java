import java.util.Scanner;

public class DayFinder{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Month(e.g 2): ");
		int month = scanner.nextInt();

		System.out.print("Enter Year: ");
		int year = scanner.nextInt();


		if (month == 1){
		System.out.printf("January %s has 31 days", year);
		}
		
		if (month == 2){
		System.out.printf("February %s has 28 days", year);
		}

		if (month == 3){
		System.out.printf("March %s has 31 days", year);
		}

		if (month == 4){
		System.out.printf("April %s has 30 days", year);
		}

		if (month == 5){
		System.out.printf("May %s has 31 days", year);
		}

		if (month == 6){
		System.out.printf("June %s has 30 days", year);
		}

		if (month == 7){
		System.out.printf("July %s has 31 days", year);
		}

		if (month == 8){
		System.out.printf("August %s has 31 days", year);
		}

		if (month == 9){
		System.out.printf("September %s has 30 days", year);
		}

		if (month == 10){
		System.out.printf("October %s has 31 days", year);
		}

		if (month == 11){
		System.out.printf("November %s has 30 days", year);
		}

		if (month == 12){
		System.out.printf("December %s has 31 days", year);
		}
	}
}