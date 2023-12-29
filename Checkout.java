import java.util.ArrayList;
import java.util.Scanner;
public class Checkout{
	
	public static void main(String...args){
		
		Scanner collector = new Scanner(System.in);
		
		System.out.print("What is the Customer's name: ");
		String customerName = collector.nextLine();
		System.out.print("What did the Customer buy: ");
		String itemBought = collector.nextLine();
		ArrayList<String> row1 = new ArrayList<>();
		row1.add(itemBought);
		System.out.print("How many pieces: ");
		double numberOfItemBought = collector.nextDouble();
		ArrayList<Double> row2 = new ArrayList<>();
		row2.add(numberOfItemBought);
		System.out.print("How much per unit: ");
		double pricePerUnit = collector.nextDouble();
		ArrayList<Double> row3 = new ArrayList<>();
		row3.add(pricePerUnit);
		System.out.print("Add more Items: ");
		String moreItem = collector.next();
		
		while(!moreItem.equalsIgnoreCase("no")){
			
			System.out.print("What did the Customer buy: ");
			itemBought = collector.next();
			row1.add(itemBought);
			System.out.print("How many pieces: ");
			numberOfItemBought = collector.nextDouble();
			row2.add(numberOfItemBought);
			System.out.print("How much per unit: ");
			pricePerUnit = collector.nextDouble();
			row3.add(pricePerUnit);
			System.out.print("Add more Items: ");
			moreItem = collector.next();

		}
		
		System.out.print("What is your name: ");
		String cashierName = collector.next();
		
		System.out.print("How much discount does the customer get: ");
		double discountAllowed = collector.nextDouble();	
		
		int rowSize = row1.size();
		
		double[] priceList = new double[rowSize];
		
		for (int index = 0; index < rowSize; index ++){
			Double price = row2.get(index);
			Double quantity = row3.get(index);
			
			priceList[index] = price * quantity;
        	}
		
		double totalPriceOfGoods = 0;
		
		for(int count = 0; count < priceList.length; count++){
			totalPriceOfGoods += priceList[count];
		}
		double discountCalculator = (discountAllowed * totalPriceOfGoods) / 100;
		
		double valueAddedTax = (totalPriceOfGoods * 17.50) / 100;
		
		double pricePayable = (totalPriceOfGoods + valueAddedTax) - discountCalculator;
		
		System.out.println("\n\n\nSEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println("DATE: 29-Dec-23 8:48:11PM");
		System.out.printf("Cashier's Name: %S\n", cashierName);
		System.out.printf("Customer Name: %S\n", customerName);
		System.out.println("=====================================================");
		System.out.printf("\tITEM\tQTY\tPRICE\t\tTOTAL(NGN)\n");
		System.out.println("-----------------------------------------------------");
		for(int count = 0; count < rowSize; count++){
			System.out.printf("\t%s\t%3.0f\t%.2f\t\t%.2f\n", row1.get(count), row2.get(count), row3.get(count), priceList[count]);
		}
		System.out.println("\n-----------------------------------------------------");
		System.out.printf("\t\t Sub total:\t\t%.2f\n", totalPriceOfGoods);
		System.out.printf("\t\t Discount:\t\t%.2f\n", discountCalculator);
		System.out.printf("\t\t VAT @ 17.50%%:\t\t%.2f\n", valueAddedTax);
		System.out.println("=====================================================");
		System.out.printf("\t\t Bill total:\t\t%.2f\n", pricePayable);
		System.out.println("=====================================================");
		System.out.printf("THIS IS NOT A RECEIPT. \nKINDLY PAY %.2f FOR THE RECEIPT TO BE GENERATED\n", pricePayable);
		System.out.println("=====================================================");
		
		System.out.print("How much did the customer give you: ");
		double amountPaidByCustomer = collector.nextDouble();
		
		double customerChange = amountPaidByCustomer - pricePayable;
		
		System.out.println("\n\n\nSEMICOLON STORES");
		System.out.println("MAIN BRANCH");
		System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
		System.out.println("TEL: 03293828343");
		System.out.println("DATE: 29-Dec-23 8:57:31PM");
		System.out.printf("Cashier's Name: %S\n", cashierName);
		System.out.printf("Customer Name: %S\n", customerName);
		System.out.println("=====================================================");
		System.out.printf("\tITEM\tQTY\tPRICE\t\tTOTAL(NGN)\n");
		System.out.println("-----------------------------------------------------");
		for(int count = 0; count < rowSize; count++){
			System.out.printf("\t%s\t%3.0f\t%.2f\t\t%.2f\n", row1.get(count), row2.get(count), row3.get(count), priceList[count]);
		}
		System.out.println("\n-----------------------------------------------------");
		System.out.printf("\t\t Sub total:\t\t%.2f\n", totalPriceOfGoods);
		System.out.printf("\t\t Discount:\t\t%.2f\n", discountCalculator);
		System.out.printf("\t\t VAT @ 17.50%%:\t\t%.2f\n", valueAddedTax);
		System.out.println("=====================================================");
		System.out.printf("\t\t Bill total:\t\t%.2f\n", pricePayable);
		System.out.printf("\t\t Amount Paid:\t\t%.2f\n", amountPaidByCustomer);
		System.out.printf("\t\t Balance:\t\t%.2f\n", customerChange);
		System.out.println("=====================================================");
		System.out.println("\t THANK YOU FOR YOUR PATRONAGE");
	}
	
	
}