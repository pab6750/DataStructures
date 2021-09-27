import org.junit.Test;
import org.junit.Assert;

public class BSTTesting {
	@Test
	public void searchTesting() {
		BST bst = new BST(5);
		
		bst.insert(1);
		bst.insert(7);
		bst.insert(3);
		bst.insert(4);
		bst.insert(2);
		bst.insert(6);
		
		Assert.assertEquals(true, bst.search(2));
		Assert.assertEquals(false, bst.search(8));
	}
}
