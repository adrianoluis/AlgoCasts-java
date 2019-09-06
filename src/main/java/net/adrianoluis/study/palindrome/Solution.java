package net.adrianoluis.study.palindrome;

import java.util.stream.IntStream;

public class Solution {

	public boolean palindrome(String str) {
		return IntStream.range(0, str.length() / 2)
				.allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
	}

//	public boolean palindrome(String str) {
//		StringBuilder rev = new StringBuilder(str).reverse();
//		return (rev.toString()).equals(str);
//	}
}
