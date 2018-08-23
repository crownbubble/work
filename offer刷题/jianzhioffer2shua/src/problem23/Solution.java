package problem23;

import java.util.ArrayList;


/**
 * 23(1)二叉树的层序遍历：借助队列先入先出的思想
 * @author Administrator
 *
 */
public class Solution {
	static ArrayList<Integer> listAll=new ArrayList<Integer>();
	public static void main(String[] args) {
		BinaryTreeNode root=new BinaryTreeNode(8);
		BinaryTreeNode node1=new BinaryTreeNode(6);
		BinaryTreeNode node2=new BinaryTreeNode(10);
		BinaryTreeNode node3=new BinaryTreeNode(5);
		BinaryTreeNode node4=new BinaryTreeNode(7);
		BinaryTreeNode node5=new BinaryTreeNode(9);
		BinaryTreeNode node6=new BinaryTreeNode(11);
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.left=node5;
		node2.right=node6;
		Solution s=new Solution();
		listAll=s.levelOreder(root);
		for (Integer i:listAll) {
			System.out.print(i+" ");
		}
}
	public ArrayList<Integer> levelOreder(BinaryTreeNode root) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<BinaryTreeNode> queue=new ArrayList<BinaryTreeNode>();
		if(root==null)
			return null;
		queue.add(root);
		while(queue.size()!=0) {
			BinaryTreeNode t=queue.remove(0);
			if(t.left!=null) 
				queue.add(t.left);
			if(t.right!=null)
				queue.add(t.right);
			list.add(t.val);
		}
		return list;
	}
}
