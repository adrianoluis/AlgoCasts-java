package net.adrianoluis.study.maxchar;

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
		assertEquals("Finds the most frequently used char", 'a', solution.maxchar("a"));
		assertEquals("Finds the most frequently used char", 'a', solution.maxchar("abcdefghijklmnaaaaa"));
	}

	@Test
	public void test2() throws Throwable {
		assertEquals("Works with numbers in the string", '1', solution.maxchar("ab1c1d1e1f1g1"));
	}

	@Test
	public void test3() throws Throwable {
		assertEquals('e', solution.maxchar("Hello there!"));
	}
}
