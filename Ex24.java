// Reverse a string without using built-in functions or libraries

package Examples;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String rev = revString(str);
		
		System.out.println("Reversed string : " + rev);
	}
	
	private static String revString (String str) {
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i --) {
			rev += rev.charAt(i);
		}
		
		return rev;
	}

}
