
public class BSTNode {
	private BSTNode left;
	private BSTNode right;
	private int item;
	
	public BSTNode(int item) {
		this.item = item;
		this.left = null;
		this.right = null;
	}
	
	//setters and getters

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
}
