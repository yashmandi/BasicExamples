// Finding the maximum element in an array

package Examples;

public class Ex28 {

	public static void main(String[] args) {
		int [] array = {1, 0, 90, 10, 900, 35464, 2};
		int max = findMax(array);
		System.out.println("Maximum element: " + max);
	}
	
	private static int findMax(int[] arr) {
		int max = arr[0]; 		// Assuming that the first element is 0
		for (int i = 1; i < arr.length; i ++) {
			if (arr[i] > max) {
				max = arr[i];	// If the current element is greater than current max, update the max
			}
		}
		return max;
	}
}
