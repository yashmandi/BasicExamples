// Calculate the average and sum of array elements

package Examples;

public class Ex14 {

	public static void main(String[] args) {
		
		// Create an array
		int[] arr1 = {1, 5, 60, 90, 20, 8, 10, 52};
		
		// Getting array length
		int len = arr1.length;
		
		// Default sum value
		int sum = 0;
		
		// Sum of all values in array using for loop
		for (int i = 0; i < len; i ++) {
			sum = sum + arr1[i];
		}
		
		double avg = sum / len;
		
		System.out.println("Average of given array is: " + avg);
		System.out.println("Sum of array: " + sum);
		}

}
