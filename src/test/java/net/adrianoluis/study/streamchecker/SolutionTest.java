package net.adrianoluis.study.streamchecker;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//["StreamChecker","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query","query"]
//		[[["ab","ba","aaab","abab","baa"]],["a"]a,["a"],["a"],["a"],["a"],["b"],["a"],["b"],["a"],["b"],["b"],["b"],["a"],["b"],["a"],["b"],["b"],["b"],["b"],["a"],["b"],["a"],["b"],["a"],["a"],["a"],["b"],["a"],["a"],["a"]]

public class  SolutionTest {

	private Solution solution;

	@Test
	public void test1() throws Throwable {
		solution = new  Solution(new String[] {"cd","f","kl"});
		assertFalse(solution.check('a'));
		assertFalse(solution.check('b'));
		assertFalse(solution.check('c'));
		assertTrue(solution.check('d'));
		assertFalse(solution.check('e'));
		assertTrue(solution.check('f'));
		assertFalse(solution.check('g'));
		assertFalse(solution.check('h'));
		assertFalse(solution.check('i'));
		assertFalse(solution.check('j'));
		assertFalse(solution.check('k'));
		assertTrue(solution.check('l'));
	}

	@Test
	public void test2() throws Throwable {
		solution = new  Solution(new String[] {"ab","ba","aaab","abab","baa"});
		assertFalse(solution.check('a'));
		assertFalse(solution.check('a'));
		assertFalse(solution.check('a'));
		assertFalse(solution.check('a'));
		assertFalse(solution.check('a'));
		assertTrue(solution.check('b'));
		assertTrue(solution.check('a'));
		assertTrue(solution.check('b'));
		assertTrue(solution.check('a'));
		assertTrue(solution.check('b'));
		assertFalse(solution.check('b'));
		assertFalse(solution.check('b'));
		assertTrue(solution.check('a'));
		assertTrue(solution.check('b'));
		assertTrue(solution.check('a'));
		assertTrue(solution.check('b'));
		assertFalse(solution.check('b'));
		assertFalse(solution.check('b'));
		assertFalse(solution.check('b'));
		assertTrue(solution.check('a'));
		assertTrue(solution.check('b'));
		assertTrue(solution.check('a'));
		assertTrue(solution.check('b'));
		assertTrue(solution.check('a'));
		assertTrue(solution.check('a'));
		assertFalse(solution.check('a'));
		assertTrue(solution.check('b'));
		assertTrue(solution.check('a'));
		assertTrue(solution.check('a'));
		assertFalse(solution.check('a'));
	}
}
