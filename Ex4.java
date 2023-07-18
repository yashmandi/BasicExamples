// sum of integers of given interger

package Examples;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		System.out.println("Sum of given integers is : " + sumDigits(num));
	} 
	
	public static int sumDigits(long num) {
		int result = 0;
		
		while (num > 0) 
		{
			result += num % 10;
			num /= 10;
		}
		return result;
	}

}
