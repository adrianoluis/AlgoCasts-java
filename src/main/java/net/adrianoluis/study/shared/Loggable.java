package net.adrianoluis.study.shared;

public abstract class Loggable {

	/**
	 * Wrapper to System.out which can be overwritten in Test file.
	 *
	 * @param obj
	 */
	public void log(Object obj) {
		System.out.println(obj);
	}
}
