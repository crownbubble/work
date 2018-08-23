package problem25;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		BinaryTreeNode root=new BinaryTreeNode(10);
		BinaryTreeNode node1=new BinaryTreeNode(5);
		BinaryTreeNode node2=new BinaryTreeNode(12);
		BinaryTreeNode node3=new BinaryTreeNode(4);
		BinaryTreeNode node4=new BinaryTreeNode(7);
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		Solution s=new Solution();
		System.out.println(s.SumPath(root,0));
	}

	public ArrayList<ArrayList<Integer>> SumPath(BinaryTreeNode root, int sum) {
		if(root==null)
			return null;
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		Stack<Integer> s=new Stack<Integer>();
		SumPath(root,s, sum,result);
		return result;
		
	}
	/**
	 * 递归实现方法
	 * @param root
	 * @param s
	 * @param sum
	 * @param result
	 */
	private void SumPath(BinaryTreeNode root, Stack<Integer> s, int sum, ArrayList<ArrayList<Integer>> result) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		if(root.left==null && root.right==null) {
			if(root.val==sum) {
				System.out.print("找到了一条路径:");
				System.out.println();
				for (int i : s) {
					list.add(new Integer(i));
				}
				list.add(new Integer(root.val));
				result.add(list);
				}
			}
		else {
			s.push(root.val);
			SumPath(root.left, s, sum-root.val,result);
			SumPath(root.right, s, sum-root.val, result);
			s.pop();
		}		
	}
}
