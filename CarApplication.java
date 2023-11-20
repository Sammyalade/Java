import java.util.Scanner;

public class CarApplication{
	public static void main(String[] args) {
	Car carObject1 = new Car("Ferari", "2022", 120000000);
	Car carObject2 = new Car("G-Wagon", "2022", 100000000);
	
	System.out.printf("Model: %s%nYear: %s%nPrice: $%.2f%n%n", carObject1.getModel(), 	carObject1.getYear(), carObject1.getPrice());
	System.out.printf("Model: %s%nYear: %s%nPrice: $%.2f%n%n", carObject2.getModel(), 	carObject2.getYear(), carObject2.getPrice());
	

	Scanner collector = new Scanner(System.in);

	System.out.print("Enter the discount for Ferari: ");
	double discount = collector.nextDouble();
	carObject1.priceAfterDiscount(discount);

	System.out.print("Enter the discount for G-Wagon: ");
	discount = collector.nextDouble();
	carObject2.priceAfterDiscount(discount);

	System.out.printf("Price of %s minus Discount: $%.2f%n", carObject1.getModel(),carObject1.getPrice());
	System.out.printf("Price of %s minus Discount: $%.2f%n", carObject2.getModel(),carObject2.getPrice());

	}


}