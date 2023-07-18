// Count all the words in string

package Examples;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Number of words in given string: " + countWords(str));
	}
		public static int countWords(String str) {
				int count = 1;
			
				for (int i = 0; i < str.length() -1; i ++) 
				{
					if ( (str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ') )
					{
						count ++;
					}
				}
				return count;
		}
		
		
	}

 