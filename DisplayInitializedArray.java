public class DisplayInitializedArray{

	public static void main(String...args){
	
		int[] values = {44, 30, 6, 89, 66, 12, 67, 90, 34, 22};

		System.out.printf("%s%8s%n", "Index", "Values");
		
		for(int count = 0; count < values.length; count++){
	
			System.out.printf("%5s%8s%n", count, values[count]);
		
		
		
		}
		
	
	}


}