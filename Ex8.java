// To find the sum of an array

package Examples;

public class Ex8 {

	public static void main(String[] args) {
		int arr [] = {1, 2, 3, 4, 5, 6};
		int sum = 0;
		
		for (int i : arr)
			sum = sum + i;
		System.out.println(sum);
		
		
	}
}

