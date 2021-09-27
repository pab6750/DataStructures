/*
 * This class is a possible implementation of a dynamic array of integers with a modifiable length.
 */
public class DynamicArray {
	private int[] array;
	private int capacity;
	private int lastIndex;
	
	public DynamicArray() {
		this.lastIndex = -1;
		this.capacity = 2;
		this.array = new int[this.capacity];
	}
	
	public DynamicArray(int capacity) {
		if(capacity > 1) {
			this.lastIndex = -1;
			this.capacity = capacity;
			this.array = new int[this.capacity];
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * This method adds an element to the end of the array. If the array is full, it will double its length.
	 * @param newElement the new item to be inserted.
	 */
	public void addElement(int newElement) {
		if(this.lastIndex == this.capacity - 1) {
			this.increaseCapacity();
		}
		
		this.array[this.lastIndex + 1] = newElement;
		this.lastIndex++;
	}
	
	/**
	 * This method removes the last element of the array. If the length of the array is less than half of the capacity,
	 * it will half the capacity.
	 */
	
	public void removeLastElement() {
		if(!this.isEmpty()) {
			this.array[this.lastIndex] = 0;
			this.lastIndex--;
			
			if(this.lastIndex <= this.capacity - 1) {
				this.decreaseCapacity();
			}
		}
	}
	
	public boolean isEmpty() {
		return (this.lastIndex == -1);
	}
	
	public int getElemAt(int index) {
		return this.array[index];
	}
	
	//setters and getters
	public int getLength() {
		return this.array.length;
	}
	
	public int getLastIndex() {
		return this.lastIndex;
	}
	
	//private methods
	/**
	 * This method doubles the length of the array when the array is full.
	 * It copies every element from the old array to the new array, so it has a complexity of O(N)
	 */
	private void increaseCapacity() {
		int[] largeArray = new int[this.capacity * 2];
		
		for(int i = 0; i < this.array.length; i++) {
			largeArray[i] = this.array[i];
		}
		
		this.array = largeArray;
		this.capacity *= 2;
	}
	
	/**
	 * This method halves the length of the array.
	 * It copies every element from the old array to the new array, so it has a complexity of O(N)
	 */
	private void decreaseCapacity() {
		int[] smallArray = new int[this.capacity / 2];
		
		for(int i = 0; i < smallArray.length; i++) {
			smallArray[i] = this.array[i];
		}
		
		this.array = smallArray;
		this.capacity /= 2;
	}
}
