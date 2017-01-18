package multiplicationTablePkg;



public class Multiplication_Table {
	
	private static final int FIRST_NUMBER = 1;
	private static final int LAST_NUMBER = 9;
	
	int a,b;

	public static void main(String[] args) {
		
		System.out.println("   ");
		
		
		for(int a = FIRST_NUMBER; a <= LAST_NUMBER; a++ ){
			
			System.out.println("");
			
			for(int b = FIRST_NUMBER; b <= LAST_NUMBER; b++){
			
				System.out.print("   " + a*b + "   ");
			}
			System.out.println("    ");
		}

	}

}
