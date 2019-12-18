package io.mk.algorithm.search;

public class BinaryTree {

	class Node {
		Node left;
		Node right;
		int value;
	}

	private Node node;

	public void add(int value) {
		if (node == null) {
			node = new Node();
			node.value = value;
			return;
		}
		Node root = node;
		add(node, value);
		node = root;
	}

	private Node add(Node node, int value) {
		if (node == null) {
			Node newnode = new Node();
			newnode.value = value;
			return newnode;
		}
		if (value <= node.value) {
			Node add = add(node.left, value);
			if (add != null) {
				node.left = add;
			}
		} else {
			Node add = add(node.right, value);
			if (add != null) {
				node.right = add;
			}
		}
		return null;
	}

	private void printLRP(Node node) {
		if (node == null) {
			return;
		}
		printLRP(node.left);
		printLRP(node.right);
		System.out.print(node.value + " ");
	}

	public void printLRP() {
		Node root = node;
		printLRP(node);
		node = root;
		System.out.println();
	}

	private void printLPR(Node node) {
		if (node == null) {
			return;
		}
		printLPR(node.left);
		System.out.print(node.value + " ");
		printLPR(node.right);
	}

	public void printLPR() {
		Node root = node;
		printLPR(node);
		node = root;
		System.out.println();

	}

	private void printPLR(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value + " ");
		printPLR(node.left);
		printPLR(node.right);
	}

	public void printPLR() {
		Node root = node;
		printPLR(node);
		node = root;
		System.out.println();

	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.add(5);
		bt.add(3);
		bt.add(2);
		bt.add(4);
		bt.add(1);
		bt.add(6);
		bt.printPLR();
		bt.printLPR();
		bt.printLRP();
	}
}
