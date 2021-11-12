package edu.augustana.csc285.labs;

public class NumberUtils {

	/**
	 * @param a - a number to compare
	 * @param b - a number to compare
	 * @param c - a number to compare
	 * @return the largest of the three numbers
	 */                            //3,1,2
	public static int maxOfThree(int a, int b, int c) {
		if (a > b) {
			return c > a ? c : a;
		} else {
			return c > b ? c : b;
		}
	}
	
	public static void main(String[] args) {
		// NOTE: There's a bug in maxOfThree above... can we find it? 
		System.out.println(maxOfThree(10,20,30) + " should be 30");
		System.out.println(maxOfThree(17,9,2) + " should be 17");
		System.out.println(maxOfThree(1,9,1) + " should be 9");		
		System.out.println(maxOfThree(10,9,10) + " should be 10");
		System.out.println(maxOfThree(1,2,3) + " should be 3");
		System.out.println(maxOfThree(1,3,2) + " should be 3");
		System.out.println(maxOfThree(2,1,3) + " should be 3");
		System.out.println(maxOfThree(2,3,1) + " should be 3");
		System.out.println(maxOfThree(3,1,2) + " should be 3");
		System.out.println(maxOfThree(3,2,1) + " should be 3");
		
	}

}
