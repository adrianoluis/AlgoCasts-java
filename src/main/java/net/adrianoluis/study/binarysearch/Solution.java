package net.adrianoluis.study.binarysearch;

public class Solution {

	public int binarySearch(int[] sortedData, int subject) {
		return binarySearch(sortedData, 0, sortedData.length, subject);
	}

	public int binarySearch(int[] sortedData, int left, int right, int subject) {
		if (right > left) {
			int mid = left + (right - left) / 2;

			// If the element is present at the middle
			// itself
			if (sortedData[mid] == subject)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (sortedData[mid] > subject)
				return binarySearch(sortedData, left, mid - 1, subject);

			// Else the element can only be present
			// in right subarray
			return binarySearch(sortedData, mid + 1, right, subject);
		}
		return -1;
	}
}
