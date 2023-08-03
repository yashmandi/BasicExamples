// Reverse an INTEGER

package Examples;

public class Ex29 {

	public static void main(String[] args) {
		int number = 12345;
		int reversed = reverseInt(number);
		System.out.println("Reversed Number: " + reversed);
	}
	
	private static int reverseInt(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10; 				// Getting the rightmost digit of the number
			reversed = reversed * 10 + digit; 	// Appending the digit to the reversed number
			num = num / 10;						// Removing the rightmost number from the original number
		}
		return reversed;
	}

}