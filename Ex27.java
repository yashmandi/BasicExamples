// Reversing a STRING

package Examples;

public class Ex27 {
	
	public static void main(String[] args) {
		String str = "yash123";
		String reversed = reverseString(str);
		
		System.out.println(reversed);
	}
	
	private static String reverseString (String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i --) {
			sb.append(str.charAt(i)); // Appends each character in reverse order
		}
		
		return sb.toString(); // Returns teh reversed String
	}

}
