package io.mk.algorithm.game;

public class Flames {

	public static void main(String[] args) {
		String n1 = "Rajan";
		String n2 = "Rani";
		int cnt = getFlamesCount(n1, n2);
		String resultChar = getFlamesResult("flames", 0, cnt);
		String result = null;
		if ("f".equals(resultChar)) {
			result = "FRIEND";
		} else if ("l".equals(resultChar)) {
			result = "LOVE";
		} else if ("a".equals(resultChar)) {
			result = "AFFECTION";
		} else if ("m".equals(resultChar)) {
			result = "MARRIAGE";
		} else if ("e".equals(resultChar)) {
			result = "ENEMY";
		} else if ("s".equals(resultChar)) {
			result = "SIBLING";
		}

		System.out.println(result);

//		for (int i = 1; i < 10; i++) {
//			System.out.println(i + ":" + getFlamesResult("flames", 0, i));
//		}
	}

	private static int getFlamesCount(String n1, String n2) {
		int n2Len = n2.length();
		char[] carr = n1.toCharArray();
		for (int i = 0; i < carr.length; i++) {
			Character chVal = carr[i];
			String chStr = String.valueOf(chVal);
			if (n2.contains(chStr)) {
				n2 = n2.replaceFirst(chStr, "");
			}
		}
		int postN2Len = n2.length();
		int remain = n2Len - postN2Len;
		int postN1Len = n1.length() - remain;
		int cnt = postN1Len + postN2Len;
		return cnt;
	}

	private static String getFlamesResult(String flames, int st, int cnt) {
		int len = flames.length();
		if (len == 2) {
			return flames.charAt((st + cnt) % 2) + "";
		}
		int del = cnt + st;
		if (del > len) {
			del = del % len;
		}
		del = del == 0 ? len : del;
		System.out.print(flames + " - " + flames.charAt(del - 1) + " = ");
		flames = flames.replace(flames.charAt(--del) + "", "");
		System.out.println(flames);
		return getFlamesResult(flames, del, cnt);
	}
}
