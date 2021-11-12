package edu.augustana.csc285.labs;

import static org.junit.Assert.*;

import org.junit.Test;

public class HannaldousTest {

	@Test
	public void testPasswordLengthCheck() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat", "y"};
		assertEquals(4, Hannaldous.passwordLengthCheck(8,passwords));
		assertEquals(2, Hannaldous.passwordLengthCheck(3,passwords)); 
		assertEquals(1, Hannaldous.passwordLengthCheck(0,passwords));
		assertEquals(1, Hannaldous.passwordLengthCheck(1,passwords));
		assertEquals(5, Hannaldous.passwordLengthCheck(10,passwords));
	}
	
	@Test
	public void testPasswordLengthWithSpacesCheck() {
		String[] passwords = new String[] { "big moose$", "emus are awesome", "123 goodbye", "ok&y ", "17", " cat", "y"};
		assertEquals(4, Hannaldous.passwordLengthCheck(8,passwords));
		assertEquals(2, Hannaldous.passwordLengthCheck(3,passwords));
		assertEquals(1, Hannaldous.passwordLengthCheck(0,passwords));
		assertEquals(1, Hannaldous.passwordLengthCheck(1,passwords));
		assertEquals(4, Hannaldous.passwordLengthCheck(10,passwords));
	}
	
	@Test
	public void testPasswordLengthWithOneElement() {
		String[] password = new String[] {"Y"};
		assertEquals(1, Hannaldous.passwordLengthCheck(2,password));
	}
	
	@Test
	public void testCharacersInAlphabet() {
		assertEquals("Password contains at least one character not in alphabet", Hannaldous.charactersInAlphabet("bigmoose$"));
		assertEquals("Password contains at least one character not in alphabet", Hannaldous.charactersInAlphabet("17"));
		assertEquals("Password contains at least one character not in alphabet", Hannaldous.charactersInAlphabet("123goodbye"));
		assertEquals("Password contains at least one character not in alphabet", Hannaldous.charactersInAlphabet("ok&y"));
		assertEquals("Password contains characters all in alphabet", Hannaldous.charactersInAlphabet("emusareawesome"));
		assertEquals("Password contains characters all in alphabet", Hannaldous.charactersInAlphabet("cat"));
		assertEquals("Password contains characters all in alphabet", Hannaldous.charactersInAlphabet("APPLE"));
		assertEquals("Password contains characters all in alphabet", Hannaldous.charactersInAlphabet("PiNeAPPle"));
		assertEquals("Password contains characters all in alphabet", Hannaldous.charactersInAlphabet("AUGustaANa"));
		assertEquals("Password contains characters all in alphabet", Hannaldous.charactersInAlphabet("MathDepartment"));
		assertEquals("Password contains characters all in alphabet", Hannaldous.charactersInAlphabet("q"));
	}
}
