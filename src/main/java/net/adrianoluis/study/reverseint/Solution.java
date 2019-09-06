package net.adrianoluis.study.reverseint;

public class Solution {

	public long reverse(long n) {
		return Long.parseLong(new StringBuffer(Long.toString(Math.abs(n))).reverse().toString())
				* (long) Math.signum(n);
	}
}
