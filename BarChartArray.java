public class BarChartArray{

	public static void main(String...args){
	
		int[] score = {70, 65, 68, 90, 87, 77, 67, 95, 100, 77, 90, 90, 77, 60};
		
		int sixties = 0;
		int seventies = 0;
		int eighties = 0;
		int nineties = 0;
		int hundred = 0;
		
		for(int count = 0; count < score.length; count++){
			
			int index = 0;
		
			if(score[count] >= 60 && score[count] < 70){
				sixties += 1;
			} 
			if(score[count] >= 70 && score[count] < 80){
				seventies += 1;
			} 
			if(score[count] >= 80 && score[count] < 90){
				eighties += 1;
			} 
			if(score[count] >= 90 && score[count] < 100){
				nineties += 1;
			}  
			if(score[count] == 100){
				hundred += 1;
			}
		
		}

		System.out.printf("%02d - %02d: %n", 0, 9);
		System.out.printf("%02d - %02d: %n", 10, 19);
		System.out.printf("%02d - %02d: %n", 20, 29);
		System.out.printf("%02d - %02d: %n", 30, 39);
		System.out.printf("%02d - %02d: %n", 40, 49);
		System.out.printf("%02d - %02d: %n", 50, 59);

		int[] counter = {sixties, seventies, eighties, nineties, hundred};

		for(int count = 0; count < counter.length; count ++){
		
			if(count == 4){
			
				System.out.printf("%7d: ", 100);
			
			} else
			if(count == 0){
			
				System.out.printf("%02d - %02d: ", 60, 69);
				
			} else
			if(count == 1){
			
				System.out.printf("%02d - %02d: ", 70, 79);
				
			} else
			if(count == 2){
			
				System.out.printf("%02d - %02d: ", 80, 89);
			
			} else
			if(count == 3){
			
				System.out.printf("%02d - %02d: ", 90, 99);
			
			}
			
			for(int stars = 0; stars < counter[count]; stars++){
			
				System.out.print("*");
			
			}
			
			System.out.println();
		}
		
	}

}