package problem39;

public class Solution2 {
	private boolean isBalanced=false;
	public static void main(String[] args) {
		BinaryTreeNode root=new BinaryTreeNode(1);
		BinaryTreeNode node1=new BinaryTreeNode(2);
		BinaryTreeNode node2=new BinaryTreeNode(3);
		BinaryTreeNode node3=new BinaryTreeNode(4);
		BinaryTreeNode node4=new BinaryTreeNode(5);
		BinaryTreeNode node5=new BinaryTreeNode(6);
		BinaryTreeNode node6=new BinaryTreeNode(7);
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.right=node5;
		node4.right=node6;
		Solution2 s2=new Solution2();
		boolean result=s2.isBalanced(root);
		System.out.println("二叉树是不是平衡二叉树:"+result);
	}

	private boolean isBalanced(BinaryTreeNode root) {
		getDepth(root);
		return isBalanced;
	}

	private int getDepth(BinaryTreeNode root) {
		if(root==null) {
			isBalanced=true;
			return 0;
		}
		int left=getDepth(root.left);//左子树
		int right=getDepth(root.right);//右子树
		int depth=(left>right ?left:right)+1;
		if(Math.abs(left-right)<=1) {
			isBalanced=true;
		}
		else {
			isBalanced=false;
		}
		return depth;	
	}
}
