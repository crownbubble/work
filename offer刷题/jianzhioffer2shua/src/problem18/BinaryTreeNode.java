package problem18;

public class BinaryTreeNode {
	int val;
	BinaryTreeNode left;
	BinaryTreeNode right;
	public BinaryTreeNode(int n) {
		this.val=n;
	}
	
	
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}
	public BinaryTreeNode getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}
	
}
