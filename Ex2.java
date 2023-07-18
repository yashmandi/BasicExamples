// Count number of vowels

package Examples;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		
		System.out.println("Number of vowels in given string are: " + countVowels(str));
	}
	
	public static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				{
					count ++;
				}
		}
		return count;
	}

}
