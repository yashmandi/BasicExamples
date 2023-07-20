// Check all the characters in a string are vowels or not

package Examples;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			System.out.println("Checking  weather all the characters in the strings are vowels or not.");
			System.out.println(test(str));
	}
	
	public static boolean test(String input) {
		String strVow = "aeiou";
		String phrase = input.toLowerCase();
		for (int i = 0; i < phrase.length(); i ++) {
			if (strVow.indexOf(phrase.charAt(i)) == -1)
				return false;
		}
		return true;
	}

}
