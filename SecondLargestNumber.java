import java.util.Scanner;
public class SecondLargestNumber{
	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int count = 1;
		int number = 0;
		int largest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;

		while (count <= 10){
		System.out.print("Enter a number: ");
		number = collector.nextInt();
		
		if (number > largest){
			largest = number;
		} else
		if (number > secondLargest && number != largest){
			secondLargest = number;
		} else
		if (number > thirdLargest && number != largest){
			if (number > thirdLargest && number != secondLargest)
			thirdLargest = number;
		}
		count += 1;
		}
		
		System.out.print("The largest number is " + largest + ", Second Largest number is " + secondLargest + " and third largest is " + thirdLargest);



		
	

	}




}