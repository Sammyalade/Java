import java.util.Scanner;
import java.util.ArrayList;
public class CreditCardValidatorBlueprint{
	
	private Scanner collector = new Scanner(System.in);
	private ArrayList<Integer> digits = new ArrayList<Integer>();
	private String cardType;
	private String checker;
	private String cardNumber;
	
	public void takeAndSeperateCardNumber(){
	
		System.out.println("Hello, Kindly Enter Card Details to Verify: ");
		cardNumber = collector.next();
		for(int number = 0; number < cardNumber.length(); number++){
		
			int digit = Integer.valueOf(cardNumber.substring(number, number + 1));
			digits.add(digit);
		
		}
	
	
	}
	
	public void checkCardType(){
	
		if (digits.get(0) == 5){
				cardType = "MasterCard";
		} else
		if (digits.get(0) == 4){
			cardType = "Visa Card";
		} else
		if (digits.get(0) == 3 && digits.get(1) == 7){
			cardType = "American Express Card";
		} else
		if (digits.get(0) == 6){
			cardType = "Discover Card";
		} else {
			cardType = "Invalid Card";
		}
		
	}
	
	public void checkCardValidity(){
	
		Integer total = 0;
		if(cardType.equalsIgnoreCase("Invalid Card")){
		
			checker = "Invalid";
		
		} else {
			for(int index = 0; index < digits.size(); index ++){
				Integer addition = digits.get(index);
				if (index == 0 || index % 2 == 0){
					addition = digits.get(index) * 2;
						if(addition > 9){
							Integer number1 = addition / 10;
							Integer number2 = addition % 10;
							addition = number1 + number2;
						}
				}
				total = total + addition;	
				
				if(total % 10 > 0){
					checker = "Invalid";
				} else {
					checker = "Valid";
				}
		
			}
			
		}
	
	}
	
	public void displayCardStatus(){
	
		System.out.println("*****************************************");
		System.out.println("**Credit Card Type: " + cardType);
		System.out.println("**Credit Card Number: " + cardNumber);
		System.out.println("**Credit Card Digit Length: " + digits.size());
		System.out.println("**Credit Card Validity Status: " + checker);
		System.out.println("*****************************************");
	
	}

	
	



}