package io.mk.algorithm.sort;

public class MergeSort {

	private static void merge(int st, int ed, int[] a, int[] b) {
		if (ed <= st) {
			System.out.println(st + ", " + ", " + ed);
			return;
		}
		int mid = (st + ed) / 2;
		System.out.println(st + ", " + mid + ", " + ed);
		merge(st, mid, a, b);
		merge(mid + 1, ed, a, b);
		swap(a,b, st, mid + 1, ed);
	}

	/*
	 * 1 3 8 , 2 5 
	 * 1 2 3 8 5
	 */
	private static void swap(int[] a, int[] b, int st, int mid, int ed) {
		System.out.print("swap " + st + "," + mid + ", " + ed);
		System.out.println();
		while (st <= ed && mid <= ed) {
			if (a[st] > a[mid]) {
				int t = a[st];
				a[st] = a[mid];
				a[mid] = t;
				mid++;
			}else {
			st++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	/**
	 * 1 3 8 , 2 5 1 2
	 * 
	 */
	public static void main(String[] args) {
		int a[] = { 3, 1, 8, 2, 5, 4, 9, 6, 7 };
		int b[] = new int[a.length];
		merge(0, a.length - 1, a, b);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
