package com.blbr.stream;

import java.util.Scanner;

public class stock<E> {
	public Node<E> head;
	public Node<E> last;
	public Node<E> prev;

	public Node<E> returnHead() {
		return head;
	}

	public void add(E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		if (isEmpty()) {
			node.next = null;
			head = node;
		} else {
			Node<E> n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			last = node;
		}
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	public void remove(String data) {
		boolean flag = false;
		Node<E> n = head;
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
						Node<E> x = n.next;
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
		Node<E> n = head;
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

	public static void main(String[] args) {
		String a = null;
//		do {
		int ch;
		System.out.println();
		System.out.println("1.open a stock protofolio");
		System.out.println("2.add items to stock protofolio");
		System.out.println("3.exit");
		System.out.println("your choice ");
		ch = sc.nextInt();
	}

}
