package net.adrianoluis.study.streamchecker;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	private final Set<Character> lastCharacters = new HashSet<>();

	public Solution(String[] words) {
		for (String word : words) {
			if (word.length() == 1) {
				lastCharacters.add(word.charAt(0));
			} else {
				lastCharacters.add(word.charAt(word.length() - 1));
			}
		}
	}

	public boolean check(char letter) {
		return lastCharacters.contains(letter);
	}
}
