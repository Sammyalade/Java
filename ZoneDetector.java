import java.util.Scanner;
public class ZoneDetector{
	public static void main(String[] args){
	
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter your State: ");
		String stateName = collector.next();
	
		switch(stateName){
			case "kebbi": case "sokoto": case "katsina": case "zamfara": case "kaduna": case "kano":
				System.out.print("You are from NW");
				break;
			case "adamawa": case "yobe": case "borno": case "bauchi": case "gombe": case "taraba": case "jigawa":
				System.out.print("You are from NE");
				break;
			case "plateau": case "kwara": case "kogi": case "benue": case "niger": case "nasarawa": case "fct":
				System.out.print("You are from NC");
				break;
			case "lagos": case "ondo": case "osun": case "oyo": case "ogun": case "ekiti":
				System.out.print("You are from SW");
				break;
			case "abia": case "anambra": case "ebonyi": case "enugu": case "imo":
				System.out.print("You are from SE");
				break;
			case "bayelsa": case "edo": case "cross river": case "delta": case "rivers": case "akwa ibom":
				System.out.print("You are from SS");
				break;
			case "Kebbi": case "Sokoto": case "Katsina": case "Zamfara": case "Kaduna": case "Kano":
				System.out.print("You are from NW");
				break;
			case "Adamawa": case "Yobe": case "Borno": case "Bauchi": case "Gombe": case "Taraba": case "Jigawa":
				System.out.print("You are from NE");
				break;
			case "Plateau": case "Kwara": case "Kogi": case "Benue": case "Niger": case "Nasarawa": case "FCT":
				System.out.print("You are from NC");
				break;
			case "Lagos": case "Ondo": case "Osun": case "Oyo": case "Ogun": case "Ekiti":
				System.out.print("You are from SW");
				break;
			case "Abia": case "Anambra": case "Ebonyi": case "Enugu": case "Imo":
				System.out.print("You are from SE");
				break;
			case "Bayelsa": case "Edo": case "Cross-River": case "Delta": case "Rivers": case "Akwa Ibom":
				System.out.print("You are from SS");
				break;
		}
	}



}