package net.adrianoluis.study.reverseint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}

	@Test
	public void test1() throws Throwable {
		assertEquals("ReverseInt handles 0 as an input", 0, solution.reverse(0));
	}

	@Test
	public void test2() throws Throwable {
		assertEquals("ReverseInt flips a positive number", 5, solution.reverse(5));
		assertEquals("ReverseInt flips a positive number", 51, solution.reverse(15));
		assertEquals("ReverseInt flips a positive number", 9, solution.reverse(90));
		assertEquals("ReverseInt flips a positive number", 9532, solution.reverse(2359));
	}

	@Test
	public void test3() throws Throwable {
		assertEquals("ReverseInt flips a negative number", -5, solution.reverse(-5));
		assertEquals("ReverseInt flips a negative number", -51, solution.reverse(-15));
		assertEquals("ReverseInt flips a negative number", -9, solution.reverse(-90));
		assertEquals("ReverseInt flips a negative number", -9532, solution.reverse(-2359));
	}
}
