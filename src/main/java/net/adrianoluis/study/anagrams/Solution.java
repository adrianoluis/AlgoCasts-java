package net.adrianoluis.study.anagrams;

import java.util.Arrays;

// --- Directions
// Check to see if two provided strings are anagrams of eachother.
// One string is an anagram of another if it uses the same characters
// in the same quantity. Only consider characters, not spaces
// or punctuation.  Consider capital letters to be the same as lower case
// --- Examples
//   anagrams('rail safety', 'fairy tales') --> True
//   anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//   anagrams('Hi there', 'Bye there') --> False
public class Solution {

	public boolean anagrams(String first, String second) {
		return Arrays.equals(clear(first), clear(second));
	}

	public char[] clear(String str) {
		char[] tmp = str.replaceAll("\\W+", "").toLowerCase().toCharArray();
		Arrays.sort(tmp);
		return tmp;
	}

//	public boolean anagrams(String first, String second) {
//		final Map<Character, Integer> firstCharMap = buildCharMap(first);
//		final Map<Character, Integer> secondCharMap = buildCharMap(second);
//
//		return firstCharMap.equals(secondCharMap);
//	}
//
//	private Map<Character, Integer> buildCharMap(String str) {
//		str = str.replaceAll("\\W+", "").toLowerCase();
//		final Map<Character, Integer> charMap = new HashMap<>();
//		for (int i = 0; i < str.length(); i++) {
//			final Character chr = str.charAt(i);
//			if (!charMap.containsKey(chr)) {
//				charMap.put(chr, 1);
//			} else {
//				Integer count = charMap.get(chr);
//				charMap.put(chr, ++count);
//			}
//		}
//		return charMap;
//	}

//	private Map<Character, Integer> buildCharMap(String str) {
//		final Map<Character, Integer> charMap = new HashMap<>();
//		str.replaceAll("\\W+", "").toLowerCase().chars().forEach(i -> {
//			final Character chr = (char) i;
//			if (!charMap.containsKey(chr)) {
//				charMap.put(chr, 1);
//			} else {
//				Integer count = charMap.get(chr);
//				charMap.put(chr, ++count);
//			}
//		});
//		return charMap;
//	}

//	public boolean anagrams(String first, String second) {
//		first = first.replaceAll("\\W+", "").toLowerCase();
//		second = second.replaceAll("\\W+", "").toLowerCase();
//
//		if (first.length() != second.length()) {
//			return false;
//		}
//
//		final Map<Character, Integer> firstCharCount = new HashMap<>();
//		final Map<Character, Integer> secondCharCount = new HashMap<>();
//
//		for (int i = 0; i < first.length(); i++) {
//			addToMap(firstCharCount, first.charAt(i));
//			addToMap(secondCharCount, second.charAt(i));
//		}
//
//		return firstCharCount.equals(secondCharCount);
//	}

//	private void addToMap(Map<Character, Integer> charCount, Character chr) {
//		if (!charCount.containsKey(chr)) {
//			charCount.put(chr, 1);
//		} else {
//			Integer count = charCount.get(chr);
//			charCount.put(chr, ++count);
//		}
//	}
}
