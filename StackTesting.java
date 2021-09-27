import org.junit.Test;
import org.junit.Assert;

public class StackTesting {
	@Test
	public void contentTest() {
		Stack s = new Stack(1);
		
		s.push(2);
		s.push(3);
		s.push(4);
		
		s.pop();
		
		s.print();
		
		Assert.assertEquals(3, s.peek());
	}
}
