// Sorting numerical and string array

package Examples;
import java.util.Arrays;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		int [] array1 = {646, 5, 86, 654, 32, 999};
		String [] array2 = {"kjn", "eiut", "zzz", "aaa"};
		
		System.out.println("Original numeric arry: " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted numeric array: " + Arrays.toString(array1));
		
		System.out.println("Original String array: " + Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("Sorted string array: " + Arrays.toString(array2));
		
		
	}

}
