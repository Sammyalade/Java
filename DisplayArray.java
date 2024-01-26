public class DisplayArray{

	public static void main(String... args){
	
		int [] value = new int[10];

		System.out.printf("%s%8s%n", "Index", "Value");

		for(int count = 0; count < value.length; count++){
		
			System.out.printf("%5s%8s%n", count, value[count]);

		
		}
	
	}

}