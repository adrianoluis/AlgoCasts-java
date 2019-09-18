package net.adrianoluis.study.steps;

import net.adrianoluis.study.shared.Loggable;

// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'
public class Solution extends Loggable {

	public void steps(int n) {
		steps(n, 0, "");
	}

	public void steps(int n, int r, String str) {
		if (n == r) {
			return;
		}

		if (n == str.length()) {
			log(str);
			steps(n, r + 1, "");
			return;
		}

		if (str.length() <= r) {
			str += "#";
		} else {
			str += " ";
		}

		steps(n, r, str);
	}

//	public void steps(int n) {
//		StringBuffer chr = new StringBuffer();
//		for (int i = 1; i <= n; i++) {
//			chr.append("#");
//			log(format("%-" + n +"s", chr));
//		}
//	}
}
