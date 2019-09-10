package net.adrianoluis.study.palindrome;

import java.util.stream.IntStream;

// --- Directions
// Given a string, return true if the string is a palindrome
// or false if it is not.  Palindromes are strings that
// form the same word if it is reversed. *Do* include spaces
// and punctuation in determining if the string is a palindrome.
// --- Examples:
//   palindrome("abba") === true
//   palindrome("abcdefg") === false
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
