import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class StudentScore{

	private Scanner collector = new Scanner(System.in);
	private String[] subjectName;
	private String[] studentNames;
	private int[][] studentScores;
	private int[] totalOfEachStudent;
	private int[] positions;
	
	public void takeInput(){
	
		System.out.print("Enter the number of Subjects: ");
		int numOfSubject = collector.nextInt();
		
		System.out.print("Enter the number of Students: ");
		int numOfStudents = collector.nextInt();
		System.out.println("Saving<<<<<<>>>>>>");
		System.out.println("Successfully saved<><><><><><>");
		
		studentScores = new int[numOfStudents][numOfSubject];
		studentNames = new String[numOfStudents];
        	subjectName = new String[numOfSubject];
		totalOfEachStudent = new int[numOfSubject];
		positions = new int[numOfSubject];
		
		for (int index = 0; index < numOfStudents; index++) {
			System.out.print("Enter First Name for student " + (index + 1) + ": ");
            		studentNames[index] = collector.next();
			System.out.println("Saving<<<<<<>>>>>>");
			System.out.println("Successfully saved<><><><><><>");
        	}

        	
        	for (int index = 0; index < numOfSubject; index++) {
            		System.out.print("Enter name for subject " + (index + 1) + ": ");
           		subjectName[index] = collector.next();
			System.out.println("Saving<<<<<<>>>>>>");
			System.out.println("Successfully saved<><><><><><>");
        	}
		for (int index1 = 0; index1 < numOfStudents; index1++) {
            		for (int index2 = 0; index2 < numOfSubject; index2++) {
                		boolean isValidScore = false;
				System.out.print("Enter score for " + studentNames[index1] + " in " + subjectName[index2] + ": ");
				while (!isValidScore){
					try{
						
               					studentScores[index1][index2] = collector.nextInt();
						if(studentScores[index1][index2] < 0 || studentScores[index1][index2] > 100){
							System.out.print("Error, Please enter scores between 0 - 100: ");
						} else {
							System.out.println("Saving<<<<<<>>>>>>");
							System.out.println("Successfully saved<><><><><><>");
							isValidScore = true;
						}
					
					}
					catch (InputMismatchException error){
						System.out.println("Error, Please enter an int value only: ");
						collector.nextLine();
					}
				}
			}
            	}
	
	}
	

	public int getMinimumScore(int subject){
		int lowestScore = 0;
		
		
		for(int scoreChecker = 0; scoreChecker < studentScores.length; scoreChecker++){
		
			if (lowestScore < studentScores[scoreChecker][subject]){
			lowestScore = studentScores[scoreChecker][subject];
			
			}
		
		}
		
		return lowestScore;
		
	}
	
	
	public int getMaximumScore(int subject){
		int highestScore = 0;
		
		for(int scoreChecker = 0; scoreChecker < studentScores.length; scoreChecker++){
		
			if (highestScore > studentScores[scoreChecker][subject]){
			highestScore = studentScores[scoreChecker][subject];
			
			}
		
		}
		
		return highestScore;
		
	}
	
	public void setTotal(){

		int total = 0;
	
		for(int addTotal = 0; addTotal < studentScores[0].length; addTotal++){
			total = 0;
			for(int count = 0; count < studentScores[0].length; count++){
				
			
				total += studentScores[addTotal][count];
			}
			totalOfEachStudent[addTotal] = total;
		}
	
	
	}
	
	public void setPosition(){
		
		
		for(int count = 0; count < studentNames.length; count++){
			
			positions[count] = 1;

			for(int count2 = 0; count2 < studentNames.length; count2++){
			
				if(count != count2 && totalOfEachStudent[count] < totalOfEachStudent[count2]){
				
					positions[count] ++;
				
				}
			
			}
			
		
		}
		
		
		
	
	}
	
	public double getAverageScore(int student){
	
		double averageScore = 0;
		
		for(int count = student; count < totalOfEachStudent.length; count++){
		
			averageScore = totalOfEachStudent[student] / totalOfEachStudent.length;
		
		}
		
		

		return  averageScore;
		
	}
	
	
	
	public void printScores(){
		
		
		System.out.println("====================================================================");
		
		for(int sub = 0; sub < studentScores[0].length; sub++){
			if (sub == 0){
				System.out.print("STUDENTS   ");
			}
			
			System.out.printf("    %s", subjectName[sub]);
		}
		System.out.printf("    %s    %s    %s%n" ,"Total", "Average", "Position");

		System.out.println("====================================================================");
		for(int student = 0; student < studentScores[0].length; student++){
			
			System.out.printf("%-7s    ", studentNames[student]);
			
			for(int sub : studentScores[student]){
				System.out.printf("    %3d", sub);
				
			}
			setTotal();
			System.out.printf("    %5d", totalOfEachStudent[student]);
				
			double average = getAverageScore(student);
			System.out.printf("    %7.2f", average);
			
			setPosition();
			
			System.out.printf("    %8s%n", positions[student]);
			
			
		}
		System.out.println("====================================================================");
		
		System.out.println("\n====================================================================");
	
	}




}