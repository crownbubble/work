package problem19;


public class Solution2 {
	public static void main(String[] args) {
		BinaryTreeNode rootA=new BinaryTreeNode(8);
		BinaryTreeNode nodeA1=new BinaryTreeNode(6);
		BinaryTreeNode nodeA2=new BinaryTreeNode(6);
		BinaryTreeNode nodeA3=new BinaryTreeNode(5);
		BinaryTreeNode nodeA4=new BinaryTreeNode(7);
		BinaryTreeNode nodeA5=new BinaryTreeNode(7);
		BinaryTreeNode nodeA6=new BinaryTreeNode(5);
		rootA.left=nodeA1;
		rootA.right=nodeA2;
		nodeA1.left=nodeA3;
		nodeA1.right=nodeA4;
		nodeA2.left=nodeA5;
		nodeA2.right=nodeA6;
		Solution2 s2=new Solution2();
		System.out.println(s2.isSymmetrical(rootA));
	}

	public boolean isSymmetrical(BinaryTreeNode rootA) {
		return isSymmetrical(rootA,rootA);
	}

	private boolean isSymmetrical(BinaryTreeNode root1, BinaryTreeNode root2) {
		if(root1==null && root2==null)
			return true;
		if(root1==null ||root2==null)
			return false;
		if(root1.val!=root2.val)
			return false;
		return isSymmetrical(root1.left, root1.right)&& isSymmetrical(root1.right,root2.left);
	}
}
