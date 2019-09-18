package net.adrianoluis.study.steps;

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
		solution.steps(1);

		assertEquals("#", logs.get(0));
		assertEquals(1, logs.size());
	}

	@Test
	public void test2() throws Throwable {
		solution.steps(2);

		assertEquals("# ", logs.get(0));
		assertEquals("##", logs.get(1));
		assertEquals(2, logs.size());
	}

	@Test
	public void test3() throws Throwable {
		solution.steps(3);

		assertEquals("#  ", logs.get(0));
		assertEquals("## ", logs.get(1));
		assertEquals("###", logs.get(2));
		assertEquals(3, logs.size());
	}
}
