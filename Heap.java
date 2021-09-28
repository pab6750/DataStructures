/*
 * Arr[(i-1)/2]	Returns the parent node
   Arr[(2*i)+1]	Returns the left child node
   Arr[(2*i)+2]	Returns the right child node
 */


public class Heap {
	
	public static final int MIN_HEAP_MODE = 0;
	public static final int MAX_HEAP_MODE = 1;
	
	private Integer[] data;
	private int operationMode;
	
	public Heap(Integer[] array, int mode) {
		this.operationMode = mode;
		this.data = this.constructHeap(array);
	}

	public Integer[] sort() {
		Integer[] result = new Integer[this.data.length];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = this.extractRoot();
			this.data = this.balanceHeap(this.data, 0);
		}
		
		return result;
	}
	
	//getters
	public int getLength() {
		return this.data.length;
	}
	
	public Integer[] getData() {
		return this.data;
	}
	
	//private methods
	private Integer[] constructHeap(Integer[] array) {
		Integer[] result = new Integer[array.length];
		
		for(int i = 0; i < array.length; i++) {
			int freeSpotIndex = this.findFirstSpot(result);
			result[freeSpotIndex] = array[i];
			
			if(freeSpotIndex != 0) {
				result = this.swapHeapValues(result, freeSpotIndex);
			}
		}
		
		return result;
	}
	
	private int findFirstSpot(Integer[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == null) {
				return i;
			}
		}
		
		return 0;
	}
	
	private Integer[] swapHeapValues(Integer[] array, int index) {
		Integer item = array[index];
		
		int parentIndex = (index - 1) / 2;
		Integer parent = array[parentIndex];
		
		if(this.operationMode == MIN_HEAP_MODE) {
			if(item.intValue() < parent.intValue()) {
				array[parentIndex] = item;
				array[index] = parent;
			}
		} else if(this.operationMode == MAX_HEAP_MODE) {
			if(item.intValue() > parent.intValue()) {
				array[parentIndex] = item;
				array[index] = parent;
			}
		}
		
		if(parentIndex != 0) {
			array = this.swapHeapValues(array, parentIndex);
		}
		
		return array;
	}
	
	private Integer extractRoot() {
		Integer root = this.data[0];
		this.data[0] = null;
		return root;
	}
	
	private Integer[] balanceHeap(Integer[] heap, int index) {
		Integer item = heap[index];
		
		int leftChildIndex = (2 * index) + 1;
		int rightChildIndex = (2 * index) + 2;
		
		if(leftChildIndex >= this.data.length && rightChildIndex >= this.data.length) {
			return heap;
		}
		
		Integer leftChild = null;
		Integer rightChild = null;
		
		if(leftChildIndex < this.data.length) {
			leftChild = heap[leftChildIndex];
		}
		
		if(rightChildIndex < this.data.length) {
			rightChild = heap[rightChildIndex];
		}
		
		if(leftChild == null && rightChild == null) {
			return heap;
		}
		
		if(leftChild == null && rightChild != null) {
			heap[index] = rightChild;
			heap[rightChildIndex] = item;
			
			return this.balanceHeap(heap, rightChildIndex);
		}
		
		if(leftChild != null && rightChild == null) {
			heap[index] = leftChild;
			heap[leftChildIndex] = item;
			
			return this.balanceHeap(heap, leftChildIndex);
		}
		
		if(leftChild != null && rightChild != null) {
			if(this.operationMode == Heap.MIN_HEAP_MODE) {
				if(leftChild.intValue() < rightChild.intValue()) {
					heap[index] = leftChild;
					heap[leftChildIndex] = item;
					
					return this.balanceHeap(heap, leftChildIndex);
				} else {
					heap[index] = rightChild;
					heap[rightChildIndex] = item;
					
					return this.balanceHeap(heap, rightChildIndex);
				}
			} else if(this.operationMode == Heap.MAX_HEAP_MODE) {
				if(leftChild.intValue() > rightChild.intValue()) {
					heap[index] = leftChild;
					heap[leftChildIndex] = item;
					
					return this.balanceHeap(heap, leftChildIndex);
				} else {
					heap[index] = rightChild;
					heap[rightChildIndex] = item;
					
					return this.balanceHeap(heap, rightChildIndex);
				}
			}
		}
		
		return heap;
	}
}
