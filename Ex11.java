package Examples;

public class Ex11 {

	public static void main(String[] args) {
		int[] arr1 = {
				1234, 5678, 9101, 1121, 2001, 2014, 2020, 2021, 2023};
		System.out.println(contains(arr1, 2020));
		System.out.println(contains(arr1, 1999));
	}
	
	public static boolean contains (int[] arr, int item) {
		for (int n : arr) {
			if (item == n) {
				return true;
			}
		}
		return false;
	}

}