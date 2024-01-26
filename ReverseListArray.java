import java.util.Arrays;

public class ReverseListArray{

	public static void main(String[] args){
		
		int[] score = {5, 7, 10, 99, 14};

		int largest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;
		int fourthLargest = 0;
		int fifthLargest = 0;
		
		if (score[1] > largest){
			largest = score[1];
		}
		
		if (score[0] > largest){
			largest = score[0];
		}
		
		if (score[2] > largest){
			largest = score[2];
		}
		
		if (score[3] > largest){
			largest = score[3];
		}
	
		if (score[4] > largest){
			largest = score[4];
		}

		
		
		if (score[0] > secondLargest && score[0] != largest){
			secondLargest = score[0];
		}
		
		if (score[1] > secondLargest && score[1] != largest){
			secondLargest = score[1];
		}

		if (score[2] > secondLargest && score[2] != largest){
			secondLargest = score[2];
		}
		
		if (score[3] > secondLargest && score[3] != largest){
			secondLargest = score[3];
		}

		if (score[4] > secondLargest && score[4] != largest){
			secondLargest = score[4];
		}

		
		
		if (score[0] > thirdLargest && score[0] != largest){
		if (score[0] > thirdLargest && score[0] != secondLargest)
			thirdLargest = score[0];
		}

		if (score[1] > thirdLargest && score[1] != largest){
		if (score[1] > thirdLargest && score[1] != secondLargest)
			thirdLargest = score[1];
		}
		
		if (score[2] > thirdLargest && score[2] != largest){
		if (score[2] > thirdLargest && score[2] != secondLargest)
			thirdLargest = score[2];
		}

		if (score[3] > thirdLargest && score[3] != largest){
		if (score[3] > thirdLargest && score[3] != secondLargest)
			thirdLargest = score[3];
		}

		if (score[4] > thirdLargest && score[4] != largest){
		if (score[4] > thirdLargest && score[4] != secondLargest)
			thirdLargest = score[4];
		} 
		
		

		if (score[0] > fourthLargest 
		&& score[0] != largest 
		&& score[0] != secondLargest 
		&& score[0] != thirdLargest){
			fourthLargest = score[0];
		}

		if (score[1] > fourthLargest 
		&& score[1] != largest 
		&& score[1] != secondLargest 
		&& score[1] != thirdLargest){
			fourthLargest = score[1];
		}

		if (score[2] > fourthLargest 
		&& score[2] != largest 
		&& score[2] != secondLargest 
		&& score[2] != thirdLargest){
			fourthLargest = score[2];
		}
	
		if (score[3] > fourthLargest 
		&& score[3] != largest 
		&& score[3] != secondLargest 
		&& score[3] != thirdLargest){
			fourthLargest = score[3];
		}

		if (score[4] > fourthLargest 
		&& score[4] != largest 
		&& score[4] != secondLargest 
		&& score[4] != thirdLargest){
			fourthLargest = score[4];
		}


		
		if (score[0] > fifthLargest && score[0] != largest){
		if (score[0] > fifthLargest && score[0] != secondLargest)
		if (score[0] > fifthLargest && score[0] != thirdLargest)
		if (score[0] > fifthLargest && score[0] != fourthLargest)
			fifthLargest = score[0];
		}
		
		if (score[1] > fifthLargest && score[1] != largest){
		if (score[1] > fifthLargest && score[1] != secondLargest)
		if (score[1] > fifthLargest && score[1] != thirdLargest)
		if (score[1] > fifthLargest && score[1] != fourthLargest)
			fifthLargest = score[1];
		}

		if (score[2] > fifthLargest && score[2] != largest){
		if (score[2] > fifthLargest && score[2] != secondLargest)
		if (score[2] > fifthLargest && score[2] != thirdLargest)
		if (score[2] > fifthLargest && score[2] != fourthLargest)
			fifthLargest = score[2];
		}

		if (score[3] > fifthLargest && score[3] != largest){
		if (score[3] > fifthLargest && score[3] != secondLargest)
		if (score[3] > fifthLargest && score[3] != thirdLargest)
		if (score[3] > fifthLargest && score[3] != fourthLargest)
			fifthLargest = score[3];
		}

		if (score[4] > fifthLargest && score[4] != largest){
		if (score[4] > fifthLargest && score[4] != secondLargest)
		if (score[4] > fifthLargest && score[4] != thirdLargest)
		if (score[4] > fifthLargest && score[4] != fourthLargest)
			fifthLargest = score[4];
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