import java.util.Scanner;

public class DiameterCircumferenceAreaOfACircle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
System.out.print("Enter the radius: ");
		int radius = input.nextInt();
		
		int diameter = radius * radius;

		double circumference = 2 * PI * radius;

		double area =  PI * radius * radius;
		
		System.out.printf("Diameter is %d, Circumference is %f and Area is %f", diameter, circumference, area);

	}


}