package net.adrianoluis.study.capitalize;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class  SolutionTest {

	private Solution solution;

	@Before
	public void setUp() {
		solution = new  Solution();
	}

	@Test
	public void test1() throws Throwable {
		assertEquals("capitalizes the first letter of every word in a sentence",
				"Hi There, How Is It Going?",
				solution.capitalize("hi there, how is it going?"));
	}

	@Test
	public void test2() throws Throwable {
		assertEquals("capitalizes the first letter",
				"I Love Breakfast At Bill Miller Bbq",
				solution.capitalize("i love breakfast at bill miller bbq"));
	}
}
