import org.junit.Test;
import org.junit.Assert;

public class HeapTesting {
	
	@Test
	public void heapConstructionTest() {
		Integer[] a = {5, 1, 2, 7 , 3 , 5, 6, 6, 2, 9, 11, 4};
		
		Heap h = new Heap(a, Heap.MIN_HEAP_MODE);
		
		Integer[] result = h.getData();
		Integer[] expectedResult = {1, 2, 2, 3, 5, 4, 6, 7, 6, 9, 11, 5};
		
		boolean isEqual = true;
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] != expectedResult[i]) {
				isEqual = false;
			}
		}
		
		Assert.assertEquals(true, isEqual);
	}
	
	@Test
	public void heapSortingTest() {
		Integer[] a = {5, 1, 2, 7 , 3 , 5, 6, 6, 2, 9, 11, 4};
		
		Heap h = new Heap(a, Heap.MIN_HEAP_MODE);
		
		Integer[] result = h.sort();
		Integer[] expectedResult = {1, 2, 2, 3, 4, 5, 5, 6, 6, 7, 9, 11};
		
		boolean isEqual = true;
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] != expectedResult[i]) {
				isEqual = false;
			}
		}
		
		Assert.assertEquals(true, isEqual);
	}
}
