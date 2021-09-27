import org.junit.Test;
import org.junit.Assert;

public class DynamicArrayTesting {
	@Test
	public void additionTest() {
		DynamicArray d = new DynamicArray();
		
		Assert.assertEquals(2, d.getLength());
		
		d.addElement(5);
		d.addElement(5);
		d.addElement(5);
		
		Assert.assertEquals(4, d.getLength());
	}
	
	@Test
	public void removalTest() {
		DynamicArray d = new DynamicArray();
		
		d.addElement(5);
		d.addElement(5);
		d.addElement(5);
		
		d.removeLastElement();
		
		Assert.assertEquals(1, d.getLastIndex());
		Assert.assertEquals(2, d.getLength());
	}
	
	@Test
	public void getInTest() {
		DynamicArray d = new DynamicArray();
		
		d.addElement(1);
		d.addElement(2);
		d.addElement(3);
		
		Assert.assertEquals(2, d.getElemAt(1));
	}
}
