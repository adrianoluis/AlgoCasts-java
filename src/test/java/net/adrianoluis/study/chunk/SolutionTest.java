package net.adrianoluis.study.chunk;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}

	@Test
	public void test1() throws Throwable {
		final Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		final Integer[][] chunked = solution.chunk(2, arr);
		final Integer[][] expected = new Integer[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

		assertArrayEquals("chunk divides an array of 10 elements with chunk size 2", expected, chunked);
	}

	@Test
	public void test2() throws Throwable {
		final Integer[] arr = {1, 2, 3};
		final Integer[][] chunked = solution.chunk(1, arr);
		final Integer[][] expected = new Integer[][]{{1}, {2}, {3}};

		assertArrayEquals("chunk divides an array of 3 elements with chunk size 1", expected, chunked);
	}

	@Test
	public void test3() throws Throwable {
		final Integer[] arr = {1, 2, 3, 4, 5};
		final Integer[][] chunked = solution.chunk(3, arr);
		final Integer[][] expected = new Integer[][]{{1, 2, 3}, {4, 5}};

		assertArrayEquals("chunk divides an array of 5 elements with chunk size 3", expected, chunked);
	}

	@Test
	public void test4() throws Throwable {
		final Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		final Integer[][] chunked = solution.chunk(5, arr);
		final Integer[][] expected = new Integer[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13}};

		assertArrayEquals("chunk divides an array of 13 elements with chunk size 5", expected, chunked);
	}
}
