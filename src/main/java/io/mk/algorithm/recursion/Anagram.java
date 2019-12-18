package io.mk.algorithm.recursion;

public class Anagram {

	private static void doAnagram(String left, String val) {
		for (int i = 1; i <= val.length(); i++) {
			String letter = val.substring(i - 1, i);
			String pre = val.substring(0, i - 1);
			String rem = val.substring(i);
			if ((rem + pre).isEmpty())
				System.out.println(left + letter + pre + rem);
			doAnagram(left + letter, pre + rem);
		}
	}

	public static void main(String[] args) {
		String val = "manoj";
		doAnagram("", val);
	}
}
