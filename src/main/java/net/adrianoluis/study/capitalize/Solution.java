package net.adrianoluis.study.capitalize;

// --- Directions
// Write a function that accepts a string.  The function should
// capitalize the first letter of each word in the string then
// return the capitalized string.
// --- Examples
//   capitalize('a short sentence') --> 'A Short Sentence'
//   capitalize('a lazy fox') --> 'A Lazy Fox'
//   capitalize('look, it is working!') --> 'Look, It Is Working!'
public class Solution {

	public String capitalize(String str) {
		final String[] words = str.split("\\s");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].substring(0, 1).toUpperCase()
					.concat(words[i].substring(1));
		}
		return String.join(" ", words);
	}

//	public String capitalize(String str) {
//		return Arrays.stream(str.split("\\s"))
//				.flatMap(s -> Stream.of(s.substring(0, 1).toUpperCase().concat(s.substring(1))))
//				.collect(Collectors.joining(" "));
//	}
}
