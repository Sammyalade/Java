import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
	Account account1 = new Account("Jane Green", 50.00);
	Account account2 = new Account("John Blue", -7.53);

	System.out.printf("%s balance: $%.2f%n%n", account1.getName(), 	account1.getBalance());
	System.out.printf("%s balance: $%.2f%n%n", account2.getName(), 	account2.getBalance());

	Scanner collector = new Scanner(System.in);

	System.out.print("Enter the deposit amount for account1: ");
	double depositAmount = collector.nextDouble();
	System.out.printf("%nadding $%.2f to account1 balance%n%n", 	depositAmount);
	account1.deposit(depositAmount);
	
	System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
	System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());

	System.out.print("Enter the deposit amount for account2: ");
	depositAmount = collector.nextDouble();
	System.out.printf("%nadding %.2f to account1 balance%n%n", 	depositAmount);
	account2.deposit(depositAmount);

	System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
	System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());

	System.out.print("Enter the withdraw amount for account1:");
	double withdrawAmount = collector.nextDouble();
	System.out.printf("%nremoving %.2f from account1 balance%n%n", 	withdrawAmount);
	account1.withdraw(withdrawAmount);
	
	System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
	System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());

	System.out.print("Enter the withdraw amount for account2:");
	withdrawAmount = collector.nextDouble();
	System.out.printf("%nremoving %.2f from account2 balance%n%n", 	withdrawAmount);
	account2.withdraw(withdrawAmount);
	
	System.out.printf("%s balance: $%.2f%n", account1.getName(),account1.getBalance());
	System.out.printf("%s balance: $%.2f%n", account2.getName(),account2.getBalance());


	}

}