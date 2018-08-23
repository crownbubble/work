package problem65;
/**
 * 65.二叉搜索树的第K个结点
 * @author Administrator
 *
 */
public class Solution {
	int index=0;
	public static void main(String[] args) {
		BinaryTreeNode root=new BinaryTreeNode(5);
		BinaryTreeNode node1=new BinaryTreeNode(3);
		BinaryTreeNode node2=new BinaryTreeNode(7);
		BinaryTreeNode node3=new BinaryTreeNode(2);
		BinaryTreeNode node4=new BinaryTreeNode(4);
		BinaryTreeNode node5=new BinaryTreeNode(6);
		BinaryTreeNode node6=new BinaryTreeNode(8);
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.left=node5;
		node2.right=node6;
		Solution s=new Solution();
		BinaryTreeNode result=s.KthBinaryTreeNode(root,3);
		System.out.println("第3个结点的值为:"+result.val);
	}

	private BinaryTreeNode KthBinaryTreeNode(BinaryTreeNode root,int k) {
		if(root!=null) {//中序遍历寻找第K个节点
			BinaryTreeNode node=KthBinaryTreeNode(root.left,k);
			if(node!=null)
				return node;
			index++;
			if(index==k)
				return root;
			node=KthBinaryTreeNode(root.right,k);
			if(node!=null)
				return node;
		}
		return null;
	}
}
