// Find the factorial of a given number using recursion

package Examples;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int fact = findFact(num);
		System.out.println(fact);
	}
	
	private static int findFact(int n) {
		if (n == 0) {
			return 1; // Factorial of 0 is 1		
			} else {
				return n * findFact (n - 1);
			}
	}

}
