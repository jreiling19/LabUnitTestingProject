package edu.augustana.csc285.labs;

import static org.junit.Assert.*;

import org.junit.Test;

public class HannaldousTest {

	@Test
	public void testPasswordLengthCheck() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat", "y"};
		assertEquals(4, Hannaldous.passwordLengthCheck(8,passwords));
		assertEquals(2, Hannaldous.passwordLengthCheck(3,passwords));
		assertEquals(0, Hannaldous.passwordLengthCheck(0,passwords));
		assertEquals(1, Hannaldous.passwordLengthCheck(1,passwords));
		assertEquals(0, Hannaldous.passwordLengthCheck(10,passwords));
	}
	
	@Test
	public void testPasswordLengthWithSpacesCheck() {
		String[] passwords = new String[] { "big moose$", "emus are awesome", "123 goodbye", "ok&y ", "17", " cat", "y"};
		assertEquals(4, Hannaldous.passwordLengthCheck(8,passwords));
		assertEquals(2, Hannaldous.passwordLengthCheck(3,passwords));
		assertEquals(0, Hannaldous.passwordLengthCheck(0,passwords));
		assertEquals(0, Hannaldous.passwordLengthCheck(1,passwords));
		assertEquals(4, Hannaldous.passwordLengthCheck(10,passwords));
	}
	

}
