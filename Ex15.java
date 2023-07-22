// Calculate the average sum of array elements entered by user

package Examples;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// Setting array size from user
		System.out.println("Enter size of an array: ");
		int size = sc.nextInt();
		
		// Creating an array
		int[] arr = new int [size];
		
		//Taking values from user
		System.out.println("Enter array values: ");
		for (int i = 0; i < size; i ++) {
			int value = sc.nextInt();
			arr[i] = value;
		}
		
		// Getting array length
		int len = arr.length;
		
		// Default sum value
		int sum = 0;
		
		// Sum of all values in the array using for loop
		for (int i = 0; i < len; i ++) {
			sum = sum + arr[i];
		}
		
		double avg = sum / len;
		
		System.out.println("Average of array: " + avg);
		System.out.println("Sum of array: " + sum);

	}

}
