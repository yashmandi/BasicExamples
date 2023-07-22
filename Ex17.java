// Sum values of an array by taking user input

package Examples;

public class Ex17 {

	public static void main(String[] args) {
		
		int[] arr = {5, 6, 1, 4, 2, 10};
		int sum = calculateSum(arr);
		System.out.println("Sum = " + sum);
}
	
	public static int calculateSum(int[] arr) {
		int sum = 0; 
		for (int num : arr) {
			sum += num;
		}
		
		return sum;
}
}
