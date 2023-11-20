import java.util.Scanner;

public class PerimeterOfATriangle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the first edges of a triangle: ");
		double side1 = in.nextDouble();
		System.out.print("Enter the second edges of a triangle: ");
		double side2 = in.nextDouble();
		System.out.print("Enter the third edges of a triangle: ");
		double side3 = in.nextDouble();

		double perimeter = side1 + side2 + side3;
		

		if (side1 + side2 > side3
		  &&side1 + side3 > side2
		  &&side2 + side3 > side1)
		System.out.print("The perimeter is " + perimeter);
		
		if (side1 + side2 < side3
		  ||side1 + side3 < side2
		  ||side2 + side3 < side1)
		System.out.print("The input is invalid");

	}


}