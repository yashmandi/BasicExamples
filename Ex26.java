// Remove duplicates from an array of integers

package Examples;
import java.util.Scanner;
import java.util.Arrays;

public class Ex26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] array = new int [size];
		System.out.println("Enter the elements of arrya: ");
		
		for (int i = 0; i < size; i ++) {
			array[i] = sc.nextInt();
		}
		
		removeDuplicates(array);
	}
	
	private static void removeDuplicates(int[] array) {
		System.out.println("Original Array: " + Arrays.toString(array));
		
		for (int i = 0; i < array.length; i ++) {
			for (int j = i + 1; j < array.length; j ++) {
				if (array[i] == array[j]) {
					array[j] = array[array.length - 1];
					array = Arrays.copyOf(array, array.length - 1);
					j --;
				}
			}
		}
			
		System.out.println("Arrays with duplicates removed: " + Arrays.toString(array));
	}
	
}
