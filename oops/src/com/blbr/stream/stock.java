package com.blbr.stream;

import java.util.List;
import java.util.Scanner;

public class stock {
	public static Node head;
	public static Node last;
	public Node prev;

	public Node returnHead() {
		return head;
	}

	public static void add(int stocks) {
		Node node = new Node();
		node.data = stocks;
		if (isEmpty()) {
			node.next = null;
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			last = node;
		}
	}

	public static boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	public void remove(String data) {
		boolean flag = false;
		Node n = head;
		if (isEmpty()) {
			System.out.println("List is empty!!!");
			flag = true;
		} else if (head.next == null && head.data == data) {
			System.out.println(data + " is deleted");
			head = null;
			flag = true;
		} else {

			for (int i = 0; i < size(); i++) {
				if (n.data.equals(data)) {
					if (n == head) {
						Node x = n.next;
						System.out.println(n.data + " is deleted");
						n = null;
						flag = true;
						head = x;
					} else if (n == last) {
						prev.next = null;
						last = prev;
						System.out.println(n.data + " is deleted");
						n = null;
						flag = true;
					} else {
						System.out.println(data + " is deleted");
						prev.next = n.next;
						n = null;
						flag = true;
					}
				}
				if (flag == true)
					break;
				if (n != null) {
					prev = n;
					n = n.next;
				}
				if (flag == true)
					break;
			}
		}
	}

	public int size() {
		Node n = head;
		int i = 0;
		if (head == null) {
			return 0;
		} else {
			while (n.next != null) {
				i++;
				n = n.next;
			}
			return i + 1;
		}

	}

	private static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String a = null;
		
		System.out.println("1.enter the company name");
		String name=sc.nextLine();
		System.out.println("2.add the number of stock holders");
		long num=sc.nextLong();
		List arr = null;
	for (int i=0;i<num;i++) {
		System.out.println("add the stock ");
		int stocks=sc.nextInt();
		
		arr.add(stocks);
		add(stocks);
	}
	Streams get=new Streams();
	get.getStream(arr);
	}

}
