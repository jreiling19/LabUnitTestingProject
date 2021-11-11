package edu.augustana.csc285.labs;

// Supervisor's note: Here's the smelly code that Hannaldous left us...
//
// In this order, please:
//  First, try to figure out what each method DOES by reading the code 
//     and methodically testing each method (from main).
//  Second, create a HannaldousTest class with a series of unit tests
//     that carefully test ALL the methods inside Hannaldous
//     that test the full range of behavior (including corner cases)
//  Third, refactor this code to make it as elegant as possible!
//      After each change, run your suite of unit tests to make sure
//      that all tests still pass!
//  Fourth, include a proper Javadoc comment for the public method 
//         (see Skrien appendix B, pp 318-331)
//   
//  NOTE: You should leave the class name (Hannaldous) the same, 
//       but methods should be renamed, parameters improved, etc...
//
//  HINT: the post-increment operator (e.g. i++) is weirder than you knew
//         (read Skrien appendix B, pp 318-331)

public class Hannaldous {
	
	// method one to do the thing for Monday's meeting 
	public static int howbad(int n, String[] input) {
		int j = input.length - 1;
		int ret = 0;
		n = n; // n = ? 
		for (int i = 0; i < input.length; i = i + 1) 
		{
		if (input[j].length() < n || Help(input[j]).equals("y"))
			ret++;
	j--;  }
		return ret;
						}
	// method two helps, and i wrote it at 11:58 p.m. on sunday... 
	// couldn't find it on stack overflow, so I rolled my pwn. 
	static String Help(String input) 
	{		
		int index = -1;
		while (index++ < input.length() - 1) {
			char ch /*PoKeMoN babee*/ = input.charAt(index); 
			
			if (! (ch >= 'a' && ch <='z'|| ch >='A' && ch <= 'Z')) return "Character is in the alphabet"; }
		return "Character not within the alphabet";
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Help("bigmoose$"));
		System.out.println(Help("emusareawesome"));
		System.out.println(Help("17"));

		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		System.out.println(howbad(8,passwords));
	}

}
