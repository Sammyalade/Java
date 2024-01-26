import java.util.Scanner;
public class ZoneDetectorIf{
	public static void main(String[] args){
	
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter your State: ");
		String stateName = collector.next();
		
		if (stateName.equalsIgnoreCase("kebbi"))
		|| (stateName.equalsIgnoreCase("sokoto"))
		|| (stateName.equalsIgnoreCase("katsina"))
		|| (stateName.equalsIgnoreCase("zamfara"))
		|| (stateName.equalsIgnoreCase("kaduna"))
		|| (stateName.equalsIgnoreCase("kano"))
			System.out.print("You are from NW");
		
		 
		if (stateName.equalsIgnoreCase("borno"))
		|| (stateName.equalsIgnoreCase("yobe"))
		|| (stateName.equalsIgnoreCase("adamawa"))
		|| (stateName.equalsIgnoreCase("taraba"))
		|| (stateName.equalsIgnoreCase("gombe"))
		|| (stateName.equalsIgnoreCase("jigawa"))
		|| (stateName.equalsIgnoreCase("bauchi"))
			System.out.print("You are from NE");
		
		
		if (stateName.equalsIgnoreCase("kogi"))
		|| (stateName.equalsIgnoreCase("kwara"))
		|| (stateName.equalsIgnoreCase("plateau"))
		|| (stateName.equalsIgnoreCase("niger"))
		|| (stateName.equalsIgnoreCase("benue"))
		|| (stateName.equalsIgnoreCase("FCT"))
		|| (stateName.equalsIgnoreCase("nasarawa"))
			System.out.print("You are from NC");
		
		
		if (stateName.equalsIgnoreCase("ogun")) || (stateName.equalsIgnoreCase("lagos")) || (stateName.equalsIgnoreCase("osun")) || (stateName.equalsIgnoreCase("ondo")) || (stateName.equalsIgnoreCase("ekiti")) || (stateName.equalsIgnoreCase("oyo"))
			System.out.print("You are from SW");
		
		
		if (stateName.equalsIgnoreCase("anambra"))
		|| (stateName.equalsIgnoreCase("abia"))
		|| (stateName.equalsIgnoreCase("enugu"))
		|| (stateName.equalsIgnoreCase("ebonyi"))
		|| (stateName.equalsIgnoreCase("imo"))
			System.out.print("You are from SE");
		
		
		if (stateName.equalsIgnoreCase("rivers"))
		|| (stateName.equalsIgnoreCase("akwa-ibom"))
		|| (stateName.equalsIgnoreCase("bayelsa"))
		|| (stateName.equalsIgnoreCase("delta"))
		|| (stateName.equalsIgnoreCase("cross-river"))
		|| (stateName.equalsIgnoreCase("edo"))
			System.out.print("You are from SS");
		
	}

}