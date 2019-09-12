package net.adrianoluis.study.worddistance;

import java.util.List;

/**
 * Solution finder = new Solution(Arrays.asList("the", "quick", "brown", "fox", "quick"));
 * <p>
 * assert(finder.distance("fox","the") == 3);
 * <p>
 * assert(finder.distance("quick", "fox") == 1);
 */
public class Solution {

	private final List<String> words;

	public Solution(List<String> words) {
		this.words = words;
	}

	public int distance(String wordOne, String wordTwo) {
		int n = words.size();

		// assume total length of the string as
		// minimum distance
		int minDistance = n + 1;

		// Find the first occurrence of any of the two
		// numbers (wordOne or wordTwo) and store the index of
		// this occurrence in prev
		int prev = 0, i = 0;
		for (i = 0; i < n; i++) {
			if (words.get(i).equals(wordOne) || words.get(i).equals(wordTwo)) {
				prev = i;
				break;
			}
		}

		// Traverse after the first occurrence
		while (i < n) {
			if (words.get(i).equals(wordOne) || words.get(i).equals(wordTwo)) {
				// If the current element matches with
				// any of the two then check if current
				// element and prev element are different
				// Also check if this value is smaller than
				// minimum distance so far
				if ((!words.get(prev).equals(words.get(i))) && (i - prev) < minDistance) {
					minDistance = i - prev;
					prev = i;
				} else {
					prev = i;
				}
			}

			i += 1;
		}

		return minDistance;
	}

//	public int distance(String wordOne, String wordTwo) {
//		int minDistance = words.size() - 1;
//
//		for (int i = 0; i < words.size(); i++) {
//			if (words.get(i).equals(wordOne)) {
//				for (int search = 0; search < words.size(); search++) {
//					if (words.get(search).equals(wordTwo)) {
//						int curr = Math.abs(i - search);
//						if (curr < minDistance) {
//							minDistance = curr;
//						}
//					}
//				}
//			}
//		}
//
//		return minDistance;
//	}
}
