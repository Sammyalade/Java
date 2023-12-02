public class TriangleInvertedTwo{
	public static void main(String[] args){

		for (int asterisks = 1; asterisks <= 10; asterisks ++){
				
			for (int asterisks2 = 10; asterisks2 >= asterisks; asterisks2--){
				System.out.print("  ");
			}	
			for (int asterisks3 = 1; asterisks3 <= asterisks; asterisks3++){
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}

		

	}



}