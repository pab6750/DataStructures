
public class Node {
	private int item;
	private Node next;
	
	public Node() {
		this.item = 0;
		this.next = null;
	}
	
	public Node(int item) {
		this.item = item;
		this.next = null;
	}
	
	public Node(int item, Node next) {
		this.item = item;
		this.next = next;
	}
	
	//setters and getters

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
