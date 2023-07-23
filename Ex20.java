// Calculate sum of all numbers from 1 to a given integer

package Examples;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = calculateSum(n);
		
		System.out.println("The sum of numbers from 1 to " + n + " is " + sum);

	}
	
	private static int calculateSum(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i ++) {
			sum += i;
		}
		
		return sum;
	}

}
