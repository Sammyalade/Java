import java.util.Scanner; 
public class AnalysisUpdated {
	public static void main(String[] args) {
		Scanner collector = new Scanner(System.in);
		int passes = 0; 
		int failures = 0; 
		int studentCounter = 1;

		while (studentCounter <= 10) {
		System.out.print("Enter result (1 = pass, 2 = fail): ");
		int result = collector.nextInt(); 
		while (result < 1 || result > 2){
		System.out.print("Invalid input. Please enter correct result (1 = pass, 2 = fail): ");
		result = collector.nextInt(); 
		}
			
		if (result == 1) { 
			passes = passes + 1; 
		} 
		else { 
			failures = failures + 1; 
		}
		studentCounter = studentCounter + 1; 
		
		}
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		if (passes >= 8){ 
		System.out.println("Bonus to instructor!");
		}
	}
}