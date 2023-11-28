import java.util.Scanner;
public class HighestScore{
	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = collector.nextInt();

		String highScorer = "";
       		int highScore = 0;

		for (int counter = 1; counter <= numberOfStudents; counter ++){
			
			System.out.print("Enter Student's name: ");
			String nameOfStudent = collector.next();

			System.out.print("Enter Student's score: ");
			int studentScore = collector.nextInt();  
				
			if (nameOfStudent.isEmpty()){
			System.out.print("Invalid input. Please enter a valid input: ");
			}

			if (studentScore > highScore){
			highScore = studentScore;
			highScorer = nameOfStudent;
			}
		}


		System.out.printf("Highest Scoring Student: %s with %d", highScorer, highScore);

	}
   
}