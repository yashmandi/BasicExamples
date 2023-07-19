// Password checker

package Examples;

import java.util.Scanner;

public class Ex6 {
	
	public static final int PASSWORD_LEN = 8;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print(
				"1. A password must have eight characters.\n" + 
				"2. A passwords consists of only letters and digits.\n" +
				"3. A password must contain alteast two digits.\n" +
				"Enter a password: ");
		String str = sc.nextLine();
		
		if (isValidPassword(str)) {
			System.out.println("Password is valid.");
		} else {
			System.out.println("Not a valid password.");
		}
	}
	
	public static boolean isValidPassword(String password) {
		
		if (password.length() < PASSWORD_LEN) 
			return false;
		
		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i ++) {
			
			char ch = password.charAt(i);
			
			if (isNumeric(ch)) numCount++;
			else if (isLetter(ch)) charCount ++;
			else return false;
		}
		
		return (charCount >= 2 && numCount >= 2);
		}
	
	public static boolean isLetter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}
	
	public static boolean isNumeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}
}
