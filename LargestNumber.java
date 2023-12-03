import java.util.Scanner;
public class LargestNumber{
	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		int count = 1;
		int number = 0;
		int largest = 0;

		while (count <= 10){
		System.out.print("Enter a number: ");
		number = collector.nextInt();
		
		if (number > largest){
			largest = number;
			}
		count += 1;
		}
		
		System.out.print("The largest input is " + largest);



		
	

	}




}