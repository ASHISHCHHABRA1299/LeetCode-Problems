package leetcode;

import java.util.HashMap;

public class LRUCache {

	private class Node {
		int key;
		int val;
		Node prev;
		Node next;
	}

	Node head = new Node();
	Node tail = new Node();
	int capacity;
	HashMap<Integer, Node> map;

	public LRUCache(int capacity) {
		map = new HashMap<Integer, Node>(capacity);
		this.capacity = capacity;
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		int result = -1;
		Node node = map.get(key);
		if (node != null) {
			result = node.val;
			remove(node);
			add(node);
		}
		return result;
	}

	public void put(int key, int value) {

		Node node = map.get(key);
		if (node != null) {
			remove(node);
			node.val = value;
			add(node);
		} else {
			if (map.size() == this.capacity) {
				map.remove(tail.prev.key);
				remove(tail.prev);
			}
			Node new_node = new Node();
			new_node.key = key;
			new_node.val = value;
			map.put(key, new_node);
			add(new_node);
		}
	}

	public void add(Node node) {
		Node head_next = head.next;
		head.next = node;
		node.prev = head;
		node.next = head_next;
		head_next.prev = node;

	}

	public void remove(Node node) {
		Node next_node = node.next;
		Node prev_node = node.prev;
		prev_node.next = next_node;
		next_node.prev = prev_node;
	}
}
