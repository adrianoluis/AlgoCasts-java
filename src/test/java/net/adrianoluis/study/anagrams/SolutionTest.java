package net.adrianoluis.study.anagrams;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class  SolutionTest {

	private Solution solution;

	@Before
	public void setUp() {
		solution = new  Solution();
	}

	@Test
	public void test1() throws Throwable {
		assertTrue("\"hello\" is an anagram of \"llohe\"", solution.anagrams("hello", "llohe"));
	}

	@Test
	public void test2() throws Throwable {
		assertTrue("\"Whoa! Hi!\" is an anagram of \"Hi! Whoa!\"",
				solution.anagrams("Hi! Whoa!", "Whoa! Hi!"));
	}

	@Test
	public void test3() throws Throwable {
		assertFalse("\"One One\" is not an anagram of \"Two two two\"",
				solution.anagrams("Two two two", "One One"));
	}

	@Test
	public void test4() throws Throwable {
		assertFalse("\"One one\" is not an anagram of \"One one c\"",
				solution.anagrams("One one c", "One one"));
	}

	@Test
	public void test5() throws Throwable {
		assertFalse("\"A tree, a life, a bench\" is not an anagram of \"A tree, a fence, a yard\"",
				solution.anagrams("A tree, a fence, a yard", "A tree, a life, a bench"));
	}
}
