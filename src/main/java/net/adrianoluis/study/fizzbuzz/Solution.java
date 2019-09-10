package net.adrianoluis.study.fizzbuzz;

// --- Directions
// Write a program that console logs the numbers
// from 1 to n. But for multiples of three print
// “fizz” instead of the number and for the multiples
// of five print “buzz”. For numbers which are multiples
// of both three and five print “fizzbuzz”.
// --- Example
//   fizzBuzz(5);
//   1
//   2
//   fizz
//   4
//   buzz
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
