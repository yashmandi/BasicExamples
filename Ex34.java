// To print the elements of an array present at even positions

package Examples;

public class Ex34 {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		
		printOdd(array1);
	}
	
	private static void printOdd(int[] arr) {
		for (int i = 0; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}
}
