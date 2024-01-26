import java.util.Scanner;
public class TwelveMultiplicationTable{

	public static void main(String... args){
	
		for(int count = 1; count < 13; count++){
			for(int counter = 1; counter < 13; counter++){
			System.out.printf("%2d x %2d = %3d  ", counter, count, (count * counter));
			}
			System.out.println();
		}
	}

}