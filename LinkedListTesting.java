import org.junit.Test;
import org.junit.Assert;

public class LinkedListTesting {
	@Test
	public void additionTest() {
		LinkedList l = new LinkedList(1);
		l.addToLast(2);
		l.addToLast(3);
		
		Assert.assertEquals(1, l.getItemAtIndex(0));
		Assert.assertEquals(2, l.getItemAtIndex(1));
		Assert.assertEquals(3, l.getItemAtIndex(2));
	}
	
	@Test
	public void addBeforeHeadTest() {
		LinkedList l = new LinkedList(1);
		l.addToLast(2);
		l.addToLast(3);
		l.addBeforeHead(5);
		
		Assert.assertEquals(5, l.getItemAtIndex(0));
	}
	
	@Test
	public void addAfterTest() {
		LinkedList l = new LinkedList(1);
		l.addToLast(2);
		l.addToLast(3);
		
		l.addAfter(5, 1);
		
		Assert.assertEquals(5, l.getItemAtIndex(2));
	}
	
	@Test
	public void removeLastTest() {
		LinkedList l = new LinkedList(1);
		l.addToLast(2);
		l.addToLast(3);
		
		l.removeLast();
		
		Assert.assertEquals(2, l.getLength());
	}
}
