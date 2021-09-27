import org.junit.Test;
import org.junit.Assert;

public class QueueTesting {
	@Test
	public void enqueueTesting() {
		Queue q = new Queue(1);
		
		q.enqueue(2);
		q.enqueue(3);
		
		Assert.assertEquals(1, q.front());
	}
	
	@Test
	public void dequeueTesting() {
		Queue q = new Queue(1);
		
		q.enqueue(2);
		q.enqueue(3);
		
		Assert.assertEquals(1, q.dequeue());
	}
	
	@Test
	public void isEmptyTesting() {
		Queue q = new Queue(1);
		
		q.dequeue();
		
		Assert.assertEquals(true, q.isEmpty());
	}
}
