// To print the elements of an array in reverse order

package Examples;

public class Ex32 {

	public static void main(String[] args) {
		int[] myArray = {1, 2, 3, 6, 4};
		System.out.println("Reversed Order: ");
		printRev(myArray);
	}
	
	private static void printRev(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i --) {
			System.out.println(arr[i]);
		}
	}

}
