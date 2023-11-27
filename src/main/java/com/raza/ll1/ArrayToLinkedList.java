package com.raza.ll1;

import com.raza.Node;
import com.raza.NodeUtils;

public class ArrayToLinkedList {

	public static Node convertToLinkedList(int[] arr, int index) {
		if (index == arr.length)
			return null;
		Node node = new Node(arr[index++]);
		node.setNext(convertToLinkedList(arr, index));
		return node;

	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		Node node = convertToLinkedList(arr, 0);
		NodeUtils.print(node);
		System.out.println();
		System.out.println(NodeUtils.length(node));
		
		System.out.println(NodeUtils.search(node,3));
	}
}
