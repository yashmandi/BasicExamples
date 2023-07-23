// Check if a given number is prime or not

package Examples;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
	
	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i ++) {
				if (number % 1 == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
