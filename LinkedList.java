
public class LinkedList {
	private Node head;
	private Node last;
	private int length;
	
	public LinkedList() {
		this.head = new Node();
		this.last = head;
		this.length = 1;
	}
	
	public LinkedList(int firstItem) {
		this.head = new Node(firstItem);
		this.last = head;
		this.length = 1;
	}
	
	public void addToLast(int item) {
		Node newNode = new Node(item);
		this.last.setNext(newNode);
		this.last = this.last.getNext();
		this.length++;
	}
	
	public void addBeforeHead(int item) {
		Node newNode = new Node(item);
		newNode.setNext(this.head);
		this.head = newNode;
		this.length++;
	}
	
	public void addAfter(int item, int index) {
		Node n = this.traverseUntil(index);
		Node oldNext = n.getNext();
		
		Node newNode = new Node(item);
		
		n.setNext(newNode);
		newNode.setNext(oldNext);
		
		if(index == length - 1) {
			this.last = newNode;
		}
		
		this.length++;
	}
	
	public void removeLast() {
		Node n = this.traverseUntil(length - 2);
		n.setNext(null);
		this.last = n;
		this.length--;
	}
	
	public void print() {
		Node current = this.head;
		
		while(current != null) {
			System.out.println(current.getItem());
			current = current.getNext();
		}
	}
	
	public int getItemAtIndex(int index) {
		if(index < length) {
			Node current = this.head;
			
			for(int i = 1; i <= index; i++) {
				current = current.getNext();
			}
			
			return current.getItem();
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	//setters and getters

	public Node getHead() {
		return head;
	}

	public Node getLast() {
		return last;
	}

	public int getLength() {
		return length;
	}
	
	//private methods
	
	private Node traverseUntil(int index) {
		if(index < length) {
			Node current = this.head;
			
			for(int i = 1; i <= index; i++) {
				current = current.getNext();
			}
			
			return current;
		} 
		
		return null;
	}
	
}
