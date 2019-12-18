package io.mk.algorithm.recursion;

public class TowerOfHanoi {

	public static void moveDisc(int discs, String fromRod, String toRod, String auxRod) {
		if (discs == 0) {
			return;
		}
		moveDisc(discs - 1, fromRod, auxRod, toRod);
		System.out.println("Move Disc " + discs + " from " + fromRod + " to " + auxRod);
		moveDisc(discs - 1, toRod, fromRod, auxRod);
	}

	public static void main(String[] args) {
		moveDisc(4, "A", "B", "C");
	}
}
