package net.adrianoluis.study.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

	private Solution solution;

	private List<Object> logs;

	@Before
	public void setUp() {
		logs = new ArrayList<>();
		solution = new Solution() {
			@Override
			public void log(Object obj) {
				logs.add(obj);
			}
		};
	}

	@Test
	public void test1() throws Throwable {
		solution.fizzBuzz(5);

		assertEquals("Calling fizzbuzz with `5` prints out 5 statements", 5, logs.size());
	}

	@Test
	public void test2() throws Throwable {
		solution.fizzBuzz(15);

		assertEquals(1, logs.get(0));
		assertEquals(2, logs.get(1));
		assertEquals("fizz", logs.get(2));
		assertEquals(4, logs.get(3));
		assertEquals("buzz", logs.get(4));
		assertEquals("fizz", logs.get(5));
		assertEquals(7, logs.get(6));
		assertEquals(8, logs.get(7));
		assertEquals("fizz", logs.get(8));
		assertEquals("buzz", logs.get(9));
		assertEquals(11, logs.get(10));
		assertEquals("fizz", logs.get(11));
		assertEquals(13, logs.get(12));
		assertEquals(14, logs.get(13));
		assertEquals("fizzbuzz", logs.get(14));
	}
}
