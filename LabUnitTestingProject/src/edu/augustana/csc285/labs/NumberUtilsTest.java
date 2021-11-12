package edu.augustana.csc285.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static edu.augustana.csc285.labs.NumberUtils.*;


class NumberUtilsTest {

	@Test
	void testSmallestFirst() {
		assertEquals(3, maxOfThree(1,2,3));
		assertEquals(3, maxOfThree(1,3,2));
	}
	
	@Test
	void testMiddleNumFirst() {
		assertEquals(3, maxOfThree(2,1,3));
		assertEquals(3, maxOfThree(2,3,1));
	}
	
	@Test
	void testLargestNumFirst() {
		assertEquals(3, maxOfThree(3,1,2));
		assertEquals(3, maxOfThree(3,2,1));
	}	

	@Test
	void testNegatives() {
		assertEquals(-12, maxOfThree(-300,-12,-75));
	}


}
