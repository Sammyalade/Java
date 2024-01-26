import java.util.Arrays;
import java.util.Scanner;
public class DescendingOrderArray{

	public static void main(String[] args){
		
		Scanner collector = new Scanner(System.in);
		
		int[] score = new int[5];
		
		for(int count = 0; count < 5; count++){
			System.out.println("Enter a number: ");
			score[count] = collector.nextInt();
		}
		System.out.println(Arrays.toString(score));

		int largest = -2147483648;
		int secondLargest = -2147483648;
		int thirdLargest = -2147483648;
		int fourthLargest = -2147483648;
		int fifthLargest = -2147483648;
		
		for(int count0 = 0; count0 < score.length; count0++){
			if(score[count0] > largest){
				largest = score[count0];
			}
			
		}
		for(int count1 = 0; count1 < score.length; count1++){
			if(score[count1] > secondLargest && score[count1] != largest){
				secondLargest = score[count1];
			}
			
		}
		
		for(int count2 = 0; count2 < score.length; count2++){
			if(score[count2] > thirdLargest && score[count2] != largest && score[count2] != secondLargest){
				thirdLargest = score[count2];
			}
			
		}
		for(int count3 = 0; count3 < score.length; count3++){
			if(score[count3] > fourthLargest && score[count3] != largest && score[count3] != secondLargest && score[count3] != thirdLargest){
				fourthLargest = score[count3];
			}
			
		}
		for(int count4 = 0; count4 < score.length; count4++){
			if(score[count4] > fifthLargest && score[count4] != largest && score[count4] != secondLargest && score[count4] != thirdLargest && score[count4] != fourthLargest){
				fifthLargest = score[count4];
			}
			
		}
		
		score[0] = largest;
		score[1] = secondLargest;
		score[2] = thirdLargest;
		score[3] = fourthLargest;
		score[4] = fifthLargest;
		
		System.out.println(Arrays.toString(score));

		score[4] = largest;
		score[3] = secondLargest;
		score[2] = thirdLargest;
		score[1] = fourthLargest;
		score[0] = fifthLargest;
		
		System.out.println(Arrays.toString(score));

	
	}



}