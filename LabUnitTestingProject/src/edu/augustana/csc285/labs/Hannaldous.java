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
	/**
	 * Checks each password in the passwordList (from back to front) and counts the passwords
	 * that have a length less than passwordLength or the password itself is equal to "y"
	 * 
	 * @param passwordLength - Length of desired password
	 * @param passwordList - String[] of passwords
	 * @return - number of passwords that are less than desired length or are equal to "y"
	 */
	public static int passwordLengthCheck(int passwordLength, String[] passwordList) {
		int passwordListIndex = passwordList.length - 1;
		int count = 0;
		//passwordLength = passwordListIndex;
		for (int i = 0; i < passwordList.length; i = i + 1) 
		{
			if (passwordList[passwordListIndex].length() < passwordLength || charactersInAlphabet(passwordList[passwordListIndex]).equals("y"))
				count++;
			passwordListIndex--;  
		}
		return count;
						}
	
	/**
	 * Checks if password contains all characters in the alphabet or contains at least one 
	 * character that is not in the alphabet.
	 * 
	 * @param password - String password input
	 * @return - Indicates if a non-alphabetic character is in the password or not
	 */
	static String charactersInAlphabet(String password) 
	{
		int index = -1;
		while (index++ < password.length() - 1) {
			char ch = password.charAt(index); 
			
			if (! (ch >= 'a' && ch <='z'|| ch >='A' && ch <= 'Z')) 
				return "Password contains at least one character not in alphabet"; 
			}
		return "Password contains characters all in alphabet";
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(charactersInAlphabet("bigmoose$"));
		System.out.println(charactersInAlphabet("emusareawesome"));
		System.out.println(charactersInAlphabet("17"));
		System.out.println(charactersInAlphabet("123goodbye"));
		System.out.println(charactersInAlphabet("ok&y"));
		System.out.println(charactersInAlphabet("cat"));

		//String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		String[] passwords = new String[] { "big moose$", "emus are awesome", "123 goodbye", "ok&y ", "17", " cat", "y"};
		System.out.println(passwordLengthCheck(8,passwords));
	}

}
