package net.adrianoluis.study.maxchar;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class Solution {

	public char maxchar(String str) {
		final AtomicReference<Integer> count = new AtomicReference<>(0);
		final AtomicReference<Character> maxChar = new AtomicReference<>();
		final Map<Character, Integer> weights = new HashMap<>();
		IntStream.range(0, str.length()).forEach(i -> {
			final Character chr = str.charAt(i);
			final Integer value = weights.containsKey(chr) ? weights.get(chr) + 1 : 1;
			weights.put(chr, value);
			if (value > count.get()) {
				maxChar.set(chr);
				count.set(value);
			}
		});
		return maxChar.get();
	}
}
