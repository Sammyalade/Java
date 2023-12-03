import java.util.Scanner;
public class GasMileage{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		int milesDriven = 0;
		int galonUsed = 0;
		float totalMilesPerGalon = 0;

		while (milesDriven != -1){
			System.out.print("Enter Miles Driven or -1 to cancel: ");
			milesDriven = collector.nextInt();
			if (milesDriven == -1){
				break;
			}
			System.out.print("Enter the Galon Used: ");
			galonUsed = collector.nextInt();
			float milesPerGalon = (float)(milesDriven / galonUsed);
			totalMilesPerGalon += milesPerGalon;
			
		}	


System.out.printf("Combined Miles Per Gallon equals %f", totalMilesPerGalon);
		
	}



}	