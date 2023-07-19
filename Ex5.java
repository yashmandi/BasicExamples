// Leap year or not 

package Examples;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a year: ");
			int year = sc.nextInt();
			System.out.println(leapYear(year));
		}
	
	public static boolean leapYear(int y) {
		
		
		boolean a = (y % 4) == 0;
		boolean b = (y % 100) != 0;
		boolean c = ((y % 100 == 0) && (y % 400 == 0));
		
		return a && (b || c);
	}
}
