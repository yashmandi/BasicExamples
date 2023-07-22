// Printing the grid using method

package Examples;

public class Ex16 {

	public static void main(String[] args) {
		int rows = 10; 
		int cols = 10;
		
		printGrid(rows, cols);

	}
	
	public static void printGrid(int rows, int cols) {
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < cols; j ++) {
				System.out.print("- ");
			}
			
			System.out.println();
		}
	}

}
