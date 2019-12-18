package io.mk.algorithm.search;

public class LinkedSet {

	class Node {
		int value;
		Node next;
	}

	private Node node;

	public void add(int value) {
		if (node == null) {
			node = new Node();
			node.value = value;
			return;
		}
		Node head = node;
		while (node.next != null) {
			node = node.next;
		}
		Node newnode = new Node();
		newnode.value = value;
		node.next = newnode;
		node = head;
	}

	public void print() {
		Node head = node;
		while (node != null) {
			System.out.print(node.value + " ");
			node = node.next;
		}
		node = head;
		System.out.println("[" + size() + "]");
	}

	public int size() {
		int cnt = 0;
		Node head = node;
		while (node != null) {
			cnt++;
			node = node.next;
		}
		node = head;
		return cnt;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		list.print();
		list.removeIndex(3);
		list.removeValue(2);
		list.print();
	}
}
