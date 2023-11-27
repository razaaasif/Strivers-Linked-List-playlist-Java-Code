package com.raza.main;

import com.raza.Node;
import com.raza.NodeUtils;

public class LinkdedListMainL1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		Node node = NodeUtils.convertToLinkedList(arr, 0);
		NodeUtils.print(node);
		System.out.println();
		System.out.println(NodeUtils.length(node));
		System.out.println(NodeUtils.search(node, 3));
	}
}
