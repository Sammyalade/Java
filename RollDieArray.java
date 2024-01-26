import java.security.SecureRandom;

public class RollDieArray{


	public static void main(String[] args){
	
		SecureRandom random = new SecureRandom();
		
		int[] frequency = new int[7];
		
		for(int roll = 1; roll <= 1_000_000; roll++){
		
			++frequency[1 + random.nextInt(6)];
		
		}
		
		System.out.printf("%s%10s%n", "Side", "Frequency");
			
		for(int display = 1; display < frequency.length; display++){
		
			System.out.printf("%4d%10d%n", display, frequency[display]);
		
		}
	
		
	}



}