package com.example.main;

//Java Program to find the largest
//nodes in doubly linked list
class LargestNode {

	
	static class Node {
		int data;
		Node next;
		Node prev;
	};

	
	static Node push(Node head_ref, int new_data)
	{
		
		Node new_node = new Node();

		
		new_node.data = new_data;

		new_node.prev = null;

		new_node.next = (head_ref);

		if ((head_ref) != null)
			(head_ref).prev = new_node;

		(head_ref) = new_node;
		return head_ref;
	}

	static int LargestInDLL(Node head_ref)
	{
		Node max, temp;

		temp = max = head_ref;

		while (temp != null) {

			if (temp.data > max.data)
				max = temp;

			temp = temp.next;
		}
		return max.data;
	}

	public static void main(String args[])
	{
		Node head = null;

		head = push(head, 20);
		head = push(head, 14);
		head = push(head, 181);
		head = push(head, 100);

		System.out.printf("%d", LargestInDLL(head));
	}
}


