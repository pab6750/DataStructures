
public class Queue {
	private LinkedList content;
	
	public Queue(int item) {
		this.content = new LinkedList(item);
	}
	
	public void enqueue(int item) {
		this.content.addBeforeHead(item);;
	}
	
	public int dequeue() {
		int n = this.content.getLast().getItem();
		this.content.removeLast();
		return n;
	}
	
	public boolean isEmpty() {
		return this.content.getLength() == 0;
	}
	
	public int length() {
		return this.content.getLength();
	}
	
	public int front() {
		return this.content.getLast().getItem();
	}
}
