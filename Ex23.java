// Calculate the sum of all numbers from 1 to a given number

package Examples;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int sum = calculateSum(n);
		
		System.out.println(sum);
	}
	
	private static int calculateSum(int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i ++) {
			sum += i;
		}
		
		return sum;
	}
}
