public class HighestInArray{

	public static void main(String[] args){
		
		int[] score = {5, 7, 10, 99, 14};

		int highest = score[0];
		
		if (score[1] > highest){
			highest = score[1];
		}
		
		if (score[2] > highest){
			highest = score[2];
		} 
		
		if (score[3] > highest){
			highest = score[3];
		} 
		
		if (score[4] > highest){
			highest = score[4];
		}

		System.out.print("Highest score: " + highest);





	}



}