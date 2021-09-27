
public class Stack {
	private LinkedList content;
	
	public Stack(int item) {
		this.content = new LinkedList(item);
	}
	
	public int peek() {
		return this.content.getLast().getItem();
	}
	
	public void push(int item) {
		this.content.addToLast(item);
	}
	
	public void pop() {
		this.content.removeLast();
	}
	
	public void print() {
		int l = this.content.getLength();
		
		int[] array = new int[l];
		
		Node current = this.content.getHead();
		
		for(int i = 0; i < l; i++) {
			array[i] = current.getItem();
			current = current.getNext();
		}
		
		for(int i = l - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}
