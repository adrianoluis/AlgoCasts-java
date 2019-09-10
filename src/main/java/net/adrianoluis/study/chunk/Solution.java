package net.adrianoluis.study.chunk;

import java.util.Arrays;

public class Solution {

	public Integer[][] chunk(Integer size, Integer... arr) {
		int chunks = arr.length / size;
		if (arr.length % size != 0) chunks++;
		final Integer[][] result = new Integer[chunks][];
		int i = 0, chunk = 0;
		while (i < arr.length) {
			int to = i + size;
			if (to > arr.length) to = arr.length;
			result[chunk++] = Arrays.copyOfRange(arr, i, to);
			i += size;
		}
		return result;
	}

//	public Integer[][] chunk(Integer size, Integer... arr) {
//		int chunks = arr.length / size;
//		if (arr.length % size != 0) chunks++;
//		final Integer[][] result = new Integer[chunks][];
//		List<Integer> chunk = new ArrayList<>();
//		int j = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (chunk.size() > 0 && chunk.size() % size == 0) {
//				result[j++] = chunk.toArray(new Integer[]{});
//				chunk = new ArrayList<>();
//			}
//			chunk.add(arr[i]);
//		}
//		result[j] = chunk.toArray(new Integer[]{});
//		return result;
//	}

//	public Integer[][] chunk(Integer size, Integer... arr) {
//		final List<List<Integer>> result = new ArrayList<>();
//		List<Integer> chunk = null;
//		for (int i = 0; i < arr.length; i++) {
//			if (i % size == 0) {
//				chunk = new ArrayList<>();
//				result.add(chunk);
//			}
//			chunk.add(arr[i]);
//		}
//		return result.stream()
//				.map(l -> l.stream().toArray(Integer[]::new))
//				.toArray(Integer[][]::new);
//	}

//	public Integer[][] chunk(Integer size, Integer... arr) {
//		int chunks = arr.length / size;
//		if (arr.length % size != 0) chunks++;
//		final Integer[][] result = new Integer[chunks][];
//
//		for (int i = 0; i < chunks; i++) {
//			int to = (i + 1) * size;
//			int from = to - size;
//			if (i == (chunks - 1)) {
//				to = arr.length;
//			}
//			result[i] = Arrays.copyOfRange(arr, from, to);
//		}
//
//		return result;
//	}
}
