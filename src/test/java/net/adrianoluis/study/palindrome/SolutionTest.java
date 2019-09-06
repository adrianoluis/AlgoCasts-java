package net.adrianoluis.study.palindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() throws Throwable {
		assertTrue("\"aba\" is a palindrome", solution.palindrome("aba"));
    }

    @Test
    public void test2() throws Throwable {
		assertFalse("\" aba\" is not a palindrome", solution.palindrome(" aba"));
    }

    @Test
    public void test3() throws Throwable {
		assertFalse("\"aba \" is not a palindrome", solution.palindrome("aba "));
    }

    @Test
    public void test4() throws Throwable {
		assertFalse("\"greetings\" is not a palindrome", solution.palindrome("greetings"));
    }

    @Test
    public void test5() throws Throwable {
		assertTrue("\"1000000001\" a palindrome", solution.palindrome("1000000001"));
    }

    @Test
    public void test6() throws Throwable {
		assertFalse("\"Fish hsif\" is not a palindrome", solution.palindrome("Fish hsif"));
    }

    @Test
    public void test7() throws Throwable {
		assertTrue("\"pennep\" a palindrome", solution.palindrome("pennep"));
    }
}
