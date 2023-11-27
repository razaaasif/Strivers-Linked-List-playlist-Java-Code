package com.raza;

public class NodeUtils {
	public static void print(Node node) {
		if (node == null)
			return;
		System.out.print(node.getData());
		if (node.getNext() != null) {
			System.out.print("->");
			print(node.getNext());
		}

	}

	public static int length(Node node) {
		if (node == null)
			return 0;
		return length(node.getNext()) + 1;
	}

	public static boolean search(Node node, int key) {
		if (node == null)
			return false;
		if (node.getData() == key)
			return true;
		return search(node.getNext(), key);
	}
	
	public static Node convertToLinkedList(int[] arr, int index) {
		if (index == arr.length)
			return null;
		Node node = new Node(arr[index++]);
		node.setNext(convertToLinkedList(arr, index));
		return node;

	}
}
