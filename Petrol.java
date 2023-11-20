import java.util.Scanner;

public class Petrol{
	public static void main(String[] args) {
	PetrolPurchase customer1 = new PetrolPurchase("Sabo Yaba", "PMS", 0, 595.50, 0.10);
	PetrolPurchase customer2 = new PetrolPurchase("Agege Lagos", "Diesel", 0, 950.50, 0.05);

	System.out.printf("Location: %s%nPetrol Type: %s%nPurchase In Litres: %d%nPrice Of Litre: %.2f%nPercentage Discount: %.2f%n%n%n", customer1.getStationLocation(), customer1.getTypeOfPetrol(), customer1.getPurchasesInLiters(), customer1.getPricePerLiter(), customer1.getPercentageDiscount());
	System.out.printf("Location: %s%nPetrol Type: %s%nPurchase In Litres: %d%nPrice Of Litre: %.2f%nPercentage Discount: %.2f%n%n", customer2.getStationLocation(), customer2.getTypeOfPetrol(), customer2.getPurchasesInLiters(), customer2.getPricePerLiter(), customer2.getPercentageDiscount());

	Scanner collector = new Scanner(System.in);

	System.out.print("Enter the Purchase in Liters for customer1: ");
	double purchasesInLiters = collector.nextDouble();
	customer1.purchaseAmount(purchasesInLiters);

	System.out.printf("Customer1 Purchase Amount: $%.2f%n%n", customer1.getPurchaseAmount());

	System.out.print("Enter the Purchase in Liters for customer2: ");
	purchasesInLiters = collector.nextDouble();
	customer2.purchaseAmount(purchasesInLiters);

	System.out.printf("Customer1 Purchase Amount: $%.2f%n", customer2.getPurchaseAmount());

	}



}
	