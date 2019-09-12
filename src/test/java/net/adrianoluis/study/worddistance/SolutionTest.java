package net.adrianoluis.study.worddistance;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution(Arrays.asList("the", "quick", "brown", "fox", "jumps", "quick", "over", "the", "lazy",
				"brown", "dog"));
	}

	@Test
	public void test1() throws Throwable {
		assertEquals(3, solution.distance("fox", "the"));
	}

	@Test
	public void test2() throws Throwable {
		assertEquals(2, solution.distance("quick", "fox"));
	}

	@Test
	public void test3() throws Throwable {
		assertEquals(1, solution.distance("brown", "quick"));
	}
}
