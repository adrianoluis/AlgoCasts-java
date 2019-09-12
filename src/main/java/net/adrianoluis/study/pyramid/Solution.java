package net.adrianoluis.study.pyramid;

import net.adrianoluis.study.shared.Loggable;

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a pyramid shape
// with N levels using the # character.  Make sure the
// pyramid has spaces on both the left *and* right hand sides
// --- Examples
//   pyramid(1)
//       '#'
//   pyramid(2)
//       ' # '
//       '###'
//   pyramid(3)
//       '  #  '
//       ' ### '
//       '#####'
public class Solution extends Loggable {

	public String pyramid(int n) {
		return pyramid(n, 0, "");
	}

	private String pyramid(int n, int row, String level) {
		if (row == n) {
			return "";
		}

		if (level.length() == 2 * n - 1) {
			log(level);
			return pyramid(n, row + 1, "");
		}

		double midpoint = Math.floor((2 * n - 1) / 2.0);
		String add;
		if (((midpoint - row) <= level.length()) && ((midpoint + row) >= level.length())) {
			add = "#";
		} else {
			add = " ";
		}
		return pyramid(n, row, level + add);
	}
}
