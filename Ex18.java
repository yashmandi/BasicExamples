// Pyramid Pattern

package Examples;

public class Ex18 {

    public static void main(String[] args) {
        int rows = 10;
        printPyramid(rows);
    }

    public static void printPyramid(int rows) {
        for (int i = 0; i < rows; i ++) {
        	for (int j = 0; j < rows - i - 1; j ++) {	
        	System.out.print(" ");
        }
        	
        	for (int k = 0; k <= i; k ++) {
        		System.out.print("* ");
        	}
        	
        	System.out.println();
    }
}
}