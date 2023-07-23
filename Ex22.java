// Reverse a string without using any built-in functions or libraries

package Examples;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		
		String rev = revString(input);
		
		System.out.println("Reversed String: " + rev);
		
	}
	
	private static String revString (String input) {
		
		// Create an empty string to store the reversed string
		String rev = "";
		
		for (int i = input.length() - 1; i >= 0; i --) {
			// Append the characters in reverse order
			rev += input.charAt(i);
		}
		
		return rev;
	}

}
