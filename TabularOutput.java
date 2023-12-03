public class TabularOutput{
	public static void main(String[] args){

		System.out.print("N \t N2 \t N3 \t N4\n\n");
		int multiplier1 = 2;
		int multiplier2 = 3;
		int multiplier3 = 4;
		for (int columns = 1; columns <= 5; columns++){
			System.out.printf("%d \t %d \t %d \t %d%n", columns, columns * columns, columns * columns * columns, columns * columns * columns * columns);
		}




	}


}