import java.util.Scanner;
public class CurrencyExchange{
	public static void main(String[]  args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = scanner.nextDouble();
		
		
		System.out.print("Enter 0 to convert dollar to RMB and 1 vice versa: ");
		int currencySpecifier = scanner.nextInt();

		if (currencySpecifier == 0){
		System.out.print("Enter dollar amount: ");
		}
		
		
		if (currencySpecifier == 1){
		System.out.print("Enter yuan amount: ");
		}

		int currencyAmount = scanner.nextInt();
		
		double convertedCurrencyAmount = 0;

		if (currencySpecifier == 0)
		convertedCurrencyAmount = exchangeRate * currencyAmount;
		

		if (currencySpecifier == 1)
		convertedCurrencyAmount = currencyAmount / exchangeRate;
		
	
		if (currencySpecifier == 0){
		System.out.printf("$%d is %.2f yuan", currencyAmount, convertedCurrencyAmount);
		}
		
		if (currencySpecifier == 1){
		System.out.printf("%d yuan is $%.2f", currencyAmount, convertedCurrencyAmount);
		}

		
	}

}