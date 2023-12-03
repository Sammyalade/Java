import java.util.Scanner;

public class ClockTest{
	public static void main(String[] args){
		
		Scanner collector = new Scanner(System.in);
		Clock test1 = new Clock(22, 55, 30);
		
		test1.displayTime();
		
		System.out.print("\nInput the Hour: ");
		int hour = collector.nextInt();
		test1.setHour(hour);
		System.out.print("Input the Minute: ");
		int minute = collector.nextInt();
		test1.setMinute(minute);
		System.out.print("Input the Second: ");
		int second = collector.nextInt();
		test1.setSecond(second);

		test1.getHour();
		
		test1.getMinute();
		
		test1.getSecond();
		
		System.out.printf("%n%d:%d:%d", test1.getHour(), test1.getMinute(), test1.getSecond());
		
	}



}