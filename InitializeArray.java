public class InitializeArray{

	public static void main(String...args){
		
		final int ARRAY_LENGTH;
		ARRAY_LENGTH = 10;
		int[] values = new int[ARRAY_LENGTH];

		for(int count = 0; count < values.length; count++){
		
			values[count] = 10 + 2 * count;
				
		}
		
		System.out.printf("%s%8s%n", "Index", "Values");
	
		for(int count = 0; count < values.length; count++){
		
			System.out.printf("%s%8s%n", count, values[count]);

		}
		
		int total = 0;
		
		for(int count = 0; count < values.length; count++){
		
			total += values[count]; 
				
		}
		
		System.out.print("\n\nSum of all element: " + total);

	
	}

}