package problem39;

public class Solution {
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
		Solution s=new Solution();
		int result=s.depthOfBinaryTreeNode(root);
		System.out.println("二叉树的深度为:"+result);
	}

	private int depthOfBinaryTreeNode(BinaryTreeNode root) {
		if(root==null)
			return 0;
		int nLeft=depthOfBinaryTreeNode(root.left);
		int nRight=depthOfBinaryTreeNode(root.right);
		return (nLeft>nRight)? (nLeft+1):(nRight+1);
	}

	
}
