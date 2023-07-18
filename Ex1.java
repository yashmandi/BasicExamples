// Display the middle character of a string

package Examples;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string; ");
		String str = sc.next();
		System.out.println("Middle character: " + mid(str));
	}
	
		public static char mid (String str) {
			
			// Finding string length
			int len = str.length();
			
			// Finding middle index pf string
			int middle = len / 2;
			
			// Printing the middle character of the string
			return str.charAt(middle);
		}

}
