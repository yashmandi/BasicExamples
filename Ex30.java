// Check if two strings are Anagrams

package Examples;

import java.util.Arrays;

public class Ex30 {

	public static void main(String[] args) {
		String str1 = "Silent";
		String str2 = "Listen";
		boolean areAnagrams = anagrams(str1, str2);
		System.out.println(str1 + " and " + str2 + " are Anagrams?: " + areAnagrams);
	}

	private static boolean anagrams(String str1, String str2) {
		
		// Converting both the strings to lowercase to ignore case sensitivity
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// Checking if the strings have the same lengths
		if (str1.length() == str2.length()) {
			return true;
		}
		
		// Converting the strings into character array and sorting them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		// Comparing the sorted character arrays
		return Arrays.equals(charArray1, charArray2);
		
	}
	
}
