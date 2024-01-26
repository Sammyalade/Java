public class StudentPollArray{
	
	public static void main(String...args){
	
		int[] responses = {1, 2, 3, 4, 5, 5, 3, 1, 2, 4, 1, 2, 3, 14};
		
		int[] frequency = new int[6];

		for(int answer = 0; answer < responses.length; answer++){
		
			try{
				++frequency[responses[answer]];
			}
			
			catch (ArrayIndexOutOfBoundsException exception){
				System.out.println(exception);
				System.out.printf("  responses [%d] = %d%n%n", answer, responses[answer]);
			}
			
		
		
		
		}
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		
		for(int rating = 1; rating < frequency.length; rating++){
		
			System.out.printf("%6d%10d%n", rating, frequency[rating]);
		
		}
	
	}



}