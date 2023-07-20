// To reverse an array

package Examples;
import java.util.Arrays;

public class Ex13 {

	public static void main(String[] args) {
		int [] arr1 = { 1, 2, 60, 90, 120, 150, 99, 3};
		System.out.println("Original Array: " + Arrays.toString(arr1));
		for (int i = 0; i < arr1.length / 2; i ++) {
			int temp = arr1 [i];
			arr1[i] = arr1[arr1.length - i - 1];
			arr1[arr1.length - i - 1] = temp;
		}
		
		System.out.println("Reversed Array: " + Arrays.toString(arr1));

	}
}
