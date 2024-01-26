import java.util.Scanner;
import java.util.InputMismatchException;
public class MBTIBlueprint{
	
	private String userName;
	private Scanner collector = new Scanner(System.in);
	private String[] response = new String[20];
	private String[] questions = new String[20];
	private String personality;
	
	public void askQuestionTakeAnswer() throws InputMismatchException {

		questions[0] = "(A) Expend Energy, Enjoy groups\t(B) Conserve Energy, Enjoy one on ones";
		questions[1] = "(A) Interpret Literally\t(B) Look for meaning and possibilities";
		questions[2] = "(A) Logical, thinking, questioning\t(B) Emphathetic, Feeling, Accomodating"; 
		questions[3] = "(A) Organized, Orderly\t(B) Flexible, adaptable";
		questions[4] = "(A) More outgoing, think out loud\t(B) More reserved, Think to yourself";
		questions[5] = "(A) Practical, Realistic, Experiential\t(B) Imaginative, Innovative, Theoretical";
		questions[6] = "(A) Candid, Straight Forward, Frank\t(B) Tactful, Kind, Encouraging";
		questions[7] = "(A) Plan, Schedule\t(B) Unplanned, Spontaneous";
		questions[8] = "(A) Seeks Many tasks, Public activities, Interaction with others\t(B) Seek private, Solitary activities with quiet to concentrate";
		questions[9] = "(A) Standard, Usual, Conventional\t(B) Different, Novel, Unique";
		questions[10] = "(A) Firm Tend to criticize, Hold the line\t(B) Gentle, Tend to appreciate, Conciliate";
		questions[11] = "(A) Regulated, Structured\t(B) Easy-going, live and let live";
		questions[12] = "(A) External, Communicative, Express yourself\t(B) Internal, Reticent, Keep to yourself";
		questions[13] = "(A) Focus on here-and-now\t(B) Look to the future, Global perspective, Big picture";
		questions[14] = "(A) Tough-minded, Just\t(B) Tender-hearted, merciful";
		questions[15] = "(A) Preparation, Plan ahead\t(B) Go with the flow, Adapt as you go";
		questions[16] = "(A) Active, Initiate\t(B) Reflective, Deliberate";
		questions[17] = "(A) Facts, things, What is\t(B) Ideas, Dreams, What could be, Philosophical";
		questions[18] = "(A) Matter of fact, Issue-oriented\t(B) Sensitive, People-oriented, Compassionate";
		questions[19] = "(A) Control, Govern\t(B) Latitude, Freedom";
		
		System.out.print("What is your name: ");
		userName = collector.nextLine();
		
		System.out.println("Please enter A or B");
		for(int count = 0; count < questions.length; count++){
			while(true){
				try{
					System.out.println(questions[count]);
					response[count] = collector.next("[abAB]");
					break;				
				}
				catch(InputMismatchException exception){
					System.out.println("Invalid Input. Please Enter either option A or B ");
					collector.next();
				}
			}
			
		}
	}
	
	public void dectectPersonality(){
	
		String eOrI = "";
		String sOrN = "";
		String tOrF = "";
		String jOrP = "";
		
		for(int count = 0; count < 2; count ++){
			int countA = 0;
			int countB = 0;
			for(int count1 = 0; count < 18; count +=4){
				if (response[count].equalsIgnoreCase("A")){
					countA ++;
				} else {
					countB ++;
				}
			}
			if (countA > countB){
				eOrI = "E";
			} else {
				eOrI = "I";
			}

			
		}
		
		for(int count = 0; count < 2; count ++){
			int countA = 0;
			int countB = 0;
			for(int count1 = 1; count < 19; count +=4){
				if (response[count].equalsIgnoreCase("A")){
					countA ++;
				} else {
					countB ++;
				}
			}
			if (countA > countB){
				sOrN = "S";
			} else {
				sOrN = "N";
			}

			
		}
		
		for(int count = 0; count < 2; count ++){
			int countA = 0;
			int countB = 0;
			for(int count1 = 2; count < 20; count +=4){
				if (response[count].equalsIgnoreCase("A")){
					countA ++;
				} else {
					countB ++;
				}
			}
			if (countA > countB){
				tOrF = "T";
			} else {
				tOrF = "F";
			}

			
		}
		
		for(int count = 0; count < 2; count ++){
			int countA = 0;
			int countB = 0;
			for(int count1 = 3; count < 20; count +=4){
				if (response[count].equalsIgnoreCase("A")){
					countA ++;
				} else {
					countB ++;
				}
			}
			if (countA > countB){
				jOrP = "J";
			} else {
				jOrP = "P";
			}

			
		}

		personality = eOrI + sOrN + tOrF + jOrP;
	
	}
	
	public void displaySelection(){
	
		System.out.println("Hello, " + userName + " You selected");
		if (response[0].equalsIgnoreCase("A")){
			System.out.println("(A) Expend Energy, Enjoy groups");
		} else {
			System.out.println("(B) Conserve Energy, Enjoy one on ones");
		}
		
		if (response[4].equalsIgnoreCase("A")){
			System.out.println("(A) More outgoing, think out loud");
		} else {
			System.out.println("(B) More reserved, Think to yourself");
		}

		if (response[8].equalsIgnoreCase("A")){
			System.out.println("(A) Seeks Many tasks, Public activities, Interaction with others");
		} else {
			System.out.println("(B) Seek private, Solitary activities with quiet to concentrate");
		}
		
		if (response[12].equalsIgnoreCase("A")){
			System.out.println("(A) External, Communicative, Express yourself");
		} else {
			System.out.println("(B) Internal, Reticent, Keep to yourself");
		}

		if (response[16].equalsIgnoreCase("A")){
			System.out.println("(A) Active, Initiate");
		} else {
			System.out.println("(B) Reflective, Deliberate");
		}
		
		int countA1 = 0;
		int countB1 = 0;
		for(int count = 0; count < 18; count +=4){
			if (response[count].equalsIgnoreCase("A")){
				countA1 ++;
			} else {
				countB1 ++;
			}
		}
		System.out.println("Number of (A) selected: " + countA1);
		System.out.println("Number of (B) selected: " + countB1);


		if (response[1].equalsIgnoreCase("A")){
			System.out.println("(A) Interpret Literally");
		} else {
			System.out.println("(B) Look for meaning and possibilities");
		}
		
		if (response[5].equalsIgnoreCase("A")){
			System.out.println("(A) Practical, Realistic, Experiential");
		} else {
			System.out.println("(B) Imaginative, Innovative, Theoretical");
		}
		
		if (response[9].equalsIgnoreCase("A")){
			System.out.println("(A) Standard, Usual, Conventional");
		} else {
			System.out.println("(B) Different, Novel, Unique");
		}
		
		if (response[13].equalsIgnoreCase("A")){
			System.out.println("(A) Focus on here-and-now");
		} else {
			System.out.println("(B) Look to the future, Global perspective, Big picture");
		}
		
		if (response[17].equalsIgnoreCase("A")){
			System.out.println("(A) Facts, things, What is");
		} else {
			System.out.println("(B) Ideas, Dreams, What could be, Philosophical");
		}
		
		int countA2 = 0;
		int countB2 = 0;
		for(int count = 1; count < 18; count +=4){
			if (response[count].equalsIgnoreCase("A")){
				countA2 ++;
			} else {
				countB2 ++;
			}
		}
		System.out.println("Number of (A) selected: " + countA2);
		System.out.println("Number of (B) selected: " + countB2);
	
		if (response[2].equalsIgnoreCase("A")){
			System.out.println("(A) Logical, thinking, questioning");
		} else {
			System.out.println("(B) Emphathetic, Feeling, Accomodating");
		}
		
		if (response[6].equalsIgnoreCase("A")){
			System.out.println("(A) Candid, Straight Forward, Frank");
		} else {
			System.out.println("(B) Tactful, Kind, Encouraging");
		}
		
		if (response[10].equalsIgnoreCase("A")){
			System.out.println("(A) Firm Tend to criticize, Hold the line");
		} else {
			System.out.println("(B) Gentle, Tend to appreciate, Conciliate");
		}
		
		if (response[14].equalsIgnoreCase("A")){
			System.out.println("(A) Tough-minded, Just");
		} else {
			System.out.println("(B) Tender-hearted, merciful");
		}
		
		if (response[18].equalsIgnoreCase("A")){
			System.out.println("(A) Matter of fact, Issue-oriented");
		} else {
			System.out.println("(B) Sensitive, People-oriented, Compassionate");
		}
		
		int countA3 = 0;
		int countB3 = 0;
		for(int count = 2; count < 19; count +=4){
			if (response[count].equalsIgnoreCase("A")){
				countA3 ++;
			} else {
				countB3 ++;
			}
		}
		System.out.println("Number of (A) selected: " + countA3);
		System.out.println("Number of (B) selected: " + countB3);
		
		if (response[3].equalsIgnoreCase("A")){
			System.out.println("(A) Organized, Orderly");
		} else {
			System.out.println("(B) Flexible, adaptable");
		}
		
		if (response[7].equalsIgnoreCase("A")){
			System.out.println("(A) Plan, Schedule");
		} else {
			System.out.println("(B) Unplanned, Spontaneous");
		}
		
		if (response[11].equalsIgnoreCase("A")){
			System.out.println("(A) Regulated, Structured");
		} else {
			System.out.println("(B) Easy-going, live and let live");
		}
		
		if (response[15].equalsIgnoreCase("A")){
			System.out.println("(A) Preparation, Plan ahead");
		} else {
			System.out.println("(B) Go with the flow, Adapt as you go");
		}
		
		if (response[19].equalsIgnoreCase("A")){
			System.out.println("(A) Control, Govern");
		} else {
			System.out.println("(B) Latitude, Freedom");
		}
		
		int countA4 = 0;
		int countB4 = 0;
		for(int count = 3; count < 20; count +=4){
			if (response[count].equalsIgnoreCase("A")){
				countA4 ++;
			} else {
				countB4 ++;
			}
		}
		System.out.println("Number of (A) selected: " + countA4);
		System.out.println("Number of (B) selected: " + countB4);
	
	}
	
	public void display(){
		
		
		
		for(SixteenPersonalityTypes personalityTypes : SixteenPersonalityTypes.values()){
		
			if (personalityTypes.name().equals(personality)){
			
				System.out.printf("%s%n", personalityTypes.getDisplayValues());
				break;
			}
		
		}
	
	}
	
}