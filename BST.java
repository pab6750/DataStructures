
public class BST {
	private BSTNode root;
	private int n;
	
	public BST(int item) {
		this.root = new BSTNode(item);
		n = 1;
	}
	
	public void insert(int item) {
		this.insertRecursive(item, this.root);
	}
	
	public boolean search(int item) {
		return this.searchRecursive(item, this.root);
	}
	
	//getters

	public BSTNode getRoot() {
		return root;
	}

	public int getN() {
		return n;
	}
	
	//private methods
	private void insertRecursive(int item, BSTNode node) {
		if(item < node.getItem()) {
			if(node.getLeft() == null) {
				BSTNode left = new BSTNode(item);
				node.setLeft(left);
			} else {
				this.insertRecursive(item, node.getLeft());
			}
		} else if(item >= node.getItem()) {
			if(node.getRight() == null) {
				BSTNode right = new BSTNode(item);
				node.setRight(right);
			} else {
				this.insertRecursive(item, node.getRight());
			}
		}
	}
	
	private boolean searchRecursive(int item, BSTNode node) {
		
		if(item == node.getItem()) {
			return true;
		}
		
		if(item < node.getItem()) {
			if(node.getLeft() == null) {
				return false;
			} else {
				return this.searchRecursive(item, node.getLeft());
			}
		} else {
			if(node.getRight() == null) {
				return false;
			} else {
				return this.searchRecursive(item, node.getRight());
			}
		}
	}
}
