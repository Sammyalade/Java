import java.util.Scanner;
public class DiscountCalculator{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter the Item Name: ");
		String itemName = collector.next();
		
		System.out.print("Enter the Item Price: ");
		double itemPrice = collector.nextDouble();
		while (itemPrice < 0){
			System.out.print("Invalid!!! Please enter a valid Price: ");
			itemPrice = collector.nextDouble();
		}
		String discount = "10%";
		double discountPrice = (0.10) * itemPrice;
		double grandTotal = itemPrice - discountPrice;
		
		System.out.printf("Item: %s%nPrice: %.2f%nDiscount: %s%nGrand Total: $%.2f", itemName, itemPrice, discount, grandTotal);


	}



}