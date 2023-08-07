// To print the elements of an array present at even positions

package Examples;

public class Ex33 {

	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 4, 5};
		printEven(myArray);
	}
	
	private static void printEven(int[] arr) {
		for (int i = 1; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}
}

// To print odd positions, change "i = 1" to "i = 0"