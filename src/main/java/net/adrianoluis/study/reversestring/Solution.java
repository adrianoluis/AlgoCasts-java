package net.adrianoluis.study.reversestring;

// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'
public class Solution {

	public String reverse(String str) {
		final StringBuilder rev = new StringBuilder();
		for (int i = (str.length() - 1); i >= 0; i--) {
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}

//    public String reverse(String str) {
//        return Arrays.stream(str.split(""))
//                .reduce("", (rev, chr) -> chr.concat(rev));
//    }

//    public String reverse(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }

//    public String reverse(String str) {
//        final StringBuilder rev = new StringBuilder();
//        Arrays.stream(str.split(""))
//                .sorted(reverseOrder())
//                .forEach(rev::append);
//        return rev.toString();
//    }
}
