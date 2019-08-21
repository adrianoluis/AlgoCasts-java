package net.adrianoluis.study.reversestring;

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
		assertEquals("Reverse reverses a string", "dcba", solution.reverse("abcd"));
	}

	@Test
	public void test2() throws Throwable {
		assertEquals("Reverse reverses a string", "dcba  ", solution.reverse("  abcd"));
	}
}
