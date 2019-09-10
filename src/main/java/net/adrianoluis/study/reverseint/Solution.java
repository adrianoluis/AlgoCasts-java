package net.adrianoluis.study.reverseint;

// --- Directions
// Given an integer, return an integer that is the reverse
// ordering of numbers.
// --- Examples
//   reverseInt(15) === 51
//   reverseInt(981) === 189
//   reverseInt(500) === 5
//   reverseInt(-15) === -51
//   reverseInt(-90) === -9
public class Solution {

	public long reverse(long n) {
		return Long.parseLong(new StringBuffer(Long.toString(Math.abs(n))).reverse().toString())
				* (long) Math.signum(n);
	}
}
