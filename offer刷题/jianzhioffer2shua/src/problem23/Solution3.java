package problem23;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 问题3：之字形打印二叉树
 * 思路：利用两个栈
 * @author Administrator
 *
 */
public class Solution3 {
	public static void main(String[] args) {
		BinaryTreeNode root=new BinaryTreeNode(1);
		BinaryTreeNode node1=new BinaryTreeNode(2);
		BinaryTreeNode node2=new BinaryTreeNode(3);
		BinaryTreeNode node3=new BinaryTreeNode(4);
		BinaryTreeNode node4=new BinaryTreeNode(5);
		BinaryTreeNode node5=new BinaryTreeNode(6);
		BinaryTreeNode node6=new BinaryTreeNode(7);
		BinaryTreeNode node7=new BinaryTreeNode(8);
		BinaryTreeNode node8=new BinaryTreeNode(9);
		BinaryTreeNode node9=new BinaryTreeNode(10);
		BinaryTreeNode node10=new BinaryTreeNode(11);
		BinaryTreeNode node11=new BinaryTreeNode(12);
		BinaryTreeNode node12=new BinaryTreeNode(13);
		BinaryTreeNode node13=new BinaryTreeNode(14);
		BinaryTreeNode node14=new BinaryTreeNode(15);
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.left=node5;
		node2.right=node6;
		node3.left=node7;
		node3.right=node8;
		node4.left=node9;
		node4.right=node10;
		node5.left=node11;
		node5.right=node12;
		node6.left=node13;
		node6.right=node14;
		Solution3 s3=new Solution3();
		s3.printTreeNode(root);
	}

	public ArrayList<ArrayList<Integer>> printTreeNode(BinaryTreeNode root) {
		int layer=1;
//		if(root==null)
//			return list;
		//s1存放奇数层节点
		Stack<BinaryTreeNode> s1=new Stack<BinaryTreeNode>();
		s1.push(root);
		//s2存放偶数层节点
		Stack<BinaryTreeNode> s2=new Stack<BinaryTreeNode>();
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		while(!s1.empty() ||!s2.empty()) {
			if(layer%2!=0) {//如果是奇数层
				ArrayList<Integer> t=new ArrayList<Integer>();
				while(!s1.empty()) {
					BinaryTreeNode node=s1.pop();
					if(node!=null) {
						t.add(node.val);
						System.out.print(node.val+" ");
						s2.push(node.left);
						s2.push(node.right);
					}
				}
				if(!t.isEmpty()) {
					list.add(t);
					layer++;
					System.out.println();
				}
			}
			else {//如果是偶数层
				ArrayList<Integer> t=new ArrayList<Integer>();
				while(!s2.empty()) {
					BinaryTreeNode node=s2.pop();
					if(node!=null) {
						t.add(node.val);
						System.out.print(node.val+" ");
						s1.push(node.right);
						s1.push(node.left);
					}
				}
				if(!t.isEmpty()) {
					list.add(t);
					layer++;
					System.out.println();
				}
			}
		}
		return list;
	}
}
