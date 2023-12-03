import java.util.Scanner;
public class CreditLimitCalculatorTest{
	public static void main(String[] args){

	Scanner collector = new Scanner(System.in);
	CreditLimitCalculator ade = new CreditLimitCalculator(500000);

	System.out.print("Enter your Account Number: ");
	int accountNumber = collector.nextInt();
	ade.setAccountNumber(accountNumber);

	System.out.print("Enter your Balance at the Beginning of the month: ");
	int beginningBalance = collector.nextInt();
	ade.setBeginningBalance(beginningBalance);

	System.out.print("Enter your total Item Charged for the month: ");
	int itemCharged = collector.nextInt();
	ade.setItemCharged(itemCharged);

	System.out.print("Enter your Total credit bought this month: ");
	int creditForTheMonth = collector.nextInt();
	ade.setCreditForTheMonth(creditForTheMonth);

	displayCreditLimit(ade);

	int creditLimit = ade.getCreditLimit();

	int newBalance = beginningBalance + itemCharged - creditForTheMonth;
	
	if (creditLimit > newBalance){
	System.out.print("Credit Limit: " + (creditLimit - newBalance));
	}
	else{
	System.out.print("Credit Limit Exceeded");
	}

	}


	public static void displayCreditLimit(CreditLimitCalculator creditLimitDisplay){
		System.out.printf("Account Number: %d%nBalance at the Beginning of the month: %d%nTotal Item Charged for the month: %d%nTotal credit bought this month: %d%nCredit Limit: %d%n", creditLimitDisplay.getAccountNumber(),creditLimitDisplay.getBeginningBalance(), creditLimitDisplay.getItemCharged(), creditLimitDisplay.getCreditForTheMonth(), creditLimitDisplay.getCreditLimit());
	}




	



}