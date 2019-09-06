package net.adrianoluis.study.fizzbuzz;

import static java.util.stream.IntStream.rangeClosed;

public class Solution {

	private static int FIZZ = 3;
	private static int BUZZ = 5;
	private static int FIZZ_BUZZ = FIZZ * BUZZ;

	public void fizzBuzz(Integer n) {
		for (int i = 1; i <= n; i++) {
			if (i % FIZZ_BUZZ == 0) {
				log("fizzbuzz");
			} else if (i % BUZZ == 0) {
				log("buzz");
			} else if (i % FIZZ == 0) {
				log("fizz");
			} else {
				log(i);
			}
		}
	}

//	public void fizzBuzz(Integer n) {
//		rangeClosed(1, n).forEach(i -> {
//			if (i % FIZZ_BUZZ == 0) {
//				log("fizzbuzz");
//			} else if (i % BUZZ == 0) {
//				log("buzz");
//			} else if (i % FIZZ == 0) {
//				log("fizz");
//			} else {
//				log(i);
//			}
//		});
//	}

	/**
	 * Wrapper to System.out which can be overwritten in Test file.
	 *
	 * @param obj
	 */
	public void log(Object obj) {
		System.out.println(obj);
	}
}
