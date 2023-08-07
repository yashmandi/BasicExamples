// To find the largest element in an array

package Examples;

public class Ex35 {

	public static void main(String[] args) {
		int[] array = {1, 5, 6, 3, 10, 11};
		System.out.println("Largest number is " + findMax(array));
	}
	
	private static int findMax(int[] arr) {
		int max = arr[0];			// Assuming that largest number is first element
		for (int i = 1; i < arr.length; i ++) {
			if (arr[i] > max) {		// Comparing current element with max
				max = arr[i]; 		// If curent element is greater than max, update max
			}
		}
		return max;
	}

}
