// Check if a number is Prime or not

package Examples;

public class Ex31 {

	public static void main(String[] args) {
		int number = 10;
		boolean isPrime = isPrimeNum(number);
		System.out.println(number + " is prime?: " + isPrime);
	}
	
	private static boolean isPrimeNum(int num) {
		
		// Numbers less than or equal to 1 are not prime
		if (num <= 1) {
			return false;
		}
		
		
		// If the remainder is 0, it means that 'num' is divisible by i, 
		// which indicates that num is not a prime number.
		for (int i = 2; i < num; i ++) {
			if (num % i == 0) { 	// If the number is divisible between 2 and any number between itself, it is not prime
				return false;
			}
		}
		
		return true; // If the number is not divisible between 2 and itself, it is a prime number
	}

}
