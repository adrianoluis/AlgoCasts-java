package net.adrianoluis.study.streamchecker;

import java.util.*;

public class Solution {

	private final char[][] words;

	private final List<Character> letters = new ArrayList<>();

	public Solution(String[] words) {
		final Set<String> wordsSet = new HashSet<>(Arrays.asList(words));
		final String[] sortedWords = wordsSet.toArray(new String[0]);
		Arrays.sort(sortedWords, Comparator.comparingInt(String::length));
		this.words = new char[sortedWords.length][];
		for (int i = 0; i < sortedWords.length; i++) {
			this.words[i] = sortedWords[i].toCharArray();
		}
	}

	private boolean compareArrayValues(char[] a1, List<Character> a2) {
		if (a1.length != a2.size()) return false;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] == a2.get(i)) {
				continue;
			}
			return false;
		}
		return true;
	}

	public boolean query(char letter) {
		letters.add(letter);
		for (int i = 0; i < words.length; i++) {
			if (letters.size() < words[i].length) return false;
			final List<Character> endsWith = letters.subList(letters.size() - words[i].length, letters.size());
			if (compareArrayValues(words[i], endsWith)) return true;
		}
		return false;
	}
}
