import java.util.Arrays;
public class AscendingOrderArray{

	public static void main(String...args){
		int[] numbers = {3,6,7,4,6,8,45,4};
		
		for(int count = 0; count < numbers.length; count++){
			for(int index = 0; index < numbers.length; index++){
				if(numbers[count] < numbers[index]){
					numbers[count] = numbers[count] + numbers[index];
					numbers[index] = numbers[count] - numbers[index];
					numbers[count] = numbers[count] - numbers[index];	
				}
					
			}
		}
		
		System.out.print(Arrays.toString(numbers));
		
	}




}