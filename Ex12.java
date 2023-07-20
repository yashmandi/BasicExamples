package Examples;
import java.util.Arrays;

public class Ex12 {

	public static void main(String[] args) {
		int[] arr1 = {20, 50, 90, 15, 150, 105, 1, 8};
		System.out.println("Original Array : " + Arrays.toString(arr1));
		
		// Removing the second element of the array
		int remIndex = 1;
		
		for (int i = remIndex; i < arr1.length - 1; i ++) {
			arr1[i] = arr1[i + 1];
		}
		
		System.out.println("After removing the second element: " + Arrays.toString(arr1));
	}
}
