package day19;

public class MyArray {
	private Node head;
	
	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	
	public void add(int element) {
		if(head == null) {
			head = new Node(element);
			return;
		}
		
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		// 반복문이 끝나면 curr에는 마지막 노드가 들어있다
		curr.next = new Node(element);
	}
	
	public void show() {
		System.out.print("[");
		Node curr = head;
		while(curr != null) {
			System.out.print(" " + curr.value + " ");
			curr = curr.next;
		}
		System.out.println("]");
	}
	
}
