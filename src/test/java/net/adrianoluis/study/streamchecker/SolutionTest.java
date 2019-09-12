package net.adrianoluis.study.streamchecker;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

	private Solution solution;

	@Test
	public void test1() throws Throwable {
		solution = new Solution(new String[]{"cd", "f", "kl"});
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('c'));
		assertTrue(solution.query('d'));
		assertFalse(solution.query('e'));
		assertTrue(solution.query('f'));
		assertFalse(solution.query('g'));
		assertFalse(solution.query('h'));
		assertFalse(solution.query('i'));
		assertFalse(solution.query('j'));
		assertFalse(solution.query('k'));
		assertTrue(solution.query('l'));
	}

	@Test
	public void test2() throws Throwable {
		solution = new Solution(new String[]{"ab", "ba", "aaab", "abab", "baa"});
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertFalse(solution.query('a'));
	}

	@Test
	public void test3() throws Throwable {
		solution = new Solution(new String[]{"abaa", "abaab", "aabbb", "bab", "ab"});
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
	}

	@Test
	public void test4() throws Throwable {
		solution = new Solution(new String[]{"aaa", "abb", "aaaab", "abaa", "baab"});
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('a'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('a'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('a'));
		assertTrue(solution.query('a'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('a'));
		assertTrue(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('b'));
		assertFalse(solution.query('a'));
		assertFalse(solution.query('b'));
		assertTrue(solution.query('b'));
	}

	@Test
	public void test5() throws Throwable {
		solution = new Solution(new String[]{"acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss",
				"fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss",
				"mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss",
				"tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss",
				"acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss",
				"hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss",
				"ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss",
				"vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss",
				"ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss",
				"jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss",
				"qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss",
				"xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss",
				"echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss",
				"lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss",
				"scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss",
				"zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss",
				"gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss",
				"ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss",
				"ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss",
				"bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss",
				"icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss",
				"pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss",
				"wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss",
				"dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss",
				"kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss",
				"rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss",
				"ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss",
				"fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss",
				"mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss",
				"tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss",
				"acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss",
				"hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss",
				"ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss",
				"vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss",
				"ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss",
				"jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss",
				"qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss",
				"xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss",
				"echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss",
				"lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss",
				"scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss",
				"zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss",
				"gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss",
				"ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss",
				"ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss",
				"bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss",
				"icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss",
				"pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss",
				"wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss",
				"dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss",
				"kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss",
				"rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss",
				"ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss",
				"fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss",
				"mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss",
				"tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss",
				"acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss",
				"hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss",
				"ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss",
				"vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss",
				"ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss",
				"jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss",
				"qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss",
				"xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss",
				"echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss",
				"lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss",
				"scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss",
				"zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss",
				"gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss",
				"ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss",
				"ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss",
				"bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss",
				"icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss",
				"pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss",
				"wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss",
				"dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss",
				"kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss",
				"rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss",
				"ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss",
				"fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss",
				"mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss",
				"tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss",
				"acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss",
				"hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss",
				"ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss",
				"vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss",
				"ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss",
				"jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss",
				"qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss",
				"xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss",
				"echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss",
				"lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss",
				"scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss",
				"zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss",
				"gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss",
				"ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss",
				"ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss",
				"bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss",
				"icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss",
				"pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss",
				"wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss",
				"dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss",
				"kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss",
				"rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss",
				"ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss",
				"fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss",
				"mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss",
				"tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss",
				"acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss",
				"hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss",
				"ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss",
				"vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss",
				"ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss",
				"jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss",
				"qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss",
				"xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss",
				"echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss",
				"lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss",
				"scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss",
				"zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss",
				"gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss",
				"ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss",
				"ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss",
				"bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss",
				"icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss",
				"pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss",
				"wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss",
				"dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss",
				"kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss",
				"rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss",
				"ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss",
				"fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss",
				"mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss",
				"tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss",
				"acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss",
				"hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss",
				"ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss",
				"vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss",
				"ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss",
				"jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss",
				"qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss",
				"xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss",
				"echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss",
				"lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss",
				"scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss",
				"zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss", "acharleetss", "bcharleetss", "ccharleetss", "dcharleetss", "echarleetss", "fcharleetss", "gcharleetss", "hcharleetss", "icharleetss", "jcharleetss", "kcharleetss", "lcharleetss", "mcharleetss", "ncharleetss", "ocharleetss", "pcharleetss", "qcharleetss", "rcharleetss", "scharleetss", "tcharleetss", "ucharleetss", "vcharleetss", "wcharleetss", "xcharleetss", "ycharleetss", "zcharleetss"});
	}
}
