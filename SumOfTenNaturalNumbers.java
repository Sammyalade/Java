public class SumOfTenNaturalNumbers{

	public static void main(String... args){
	
	int total = 0;
	
	for(int count = 1; count < 11; count++){
	
		total += count;
	}
	
	System.out.printf("Sum of first ten natural numbers is %d.", total);

	}

}