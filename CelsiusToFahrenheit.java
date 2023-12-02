import java.util.Scanner;

public class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);	
		System.out.printf("Enter Celsius Degree: ");
		int celsiusDegree = inputCollector.nextInt();
		
		double Fahrenheit = ((9.0 / 5) * (celsiusDegree)) + 32;
		
		System.out.printf("%d Celsius is %.1f Fahrenheit", celsiusDegree, Fahrenheit);
		
	}
}