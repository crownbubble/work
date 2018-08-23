package problem23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
	static ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
	static ArrayList<Integer> listRow=new ArrayList<Integer>();
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
		Solution2 s2=new Solution2();
		list=s2.printBinaryTreeByrow(root);
		for (ArrayList<Integer> i:list) {
			for (Integer j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}	
	}

	public ArrayList<ArrayList<Integer>> printBinaryTreeByrow(BinaryTreeNode root) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		if(root==null)
			return result;
		Queue<BinaryTreeNode> layer=new LinkedList<BinaryTreeNode>();
		ArrayList<Integer> layerList=new ArrayList<Integer>();
		layer.add(root);
		int start=0;
		int end=1;
		while(!layer.isEmpty()) {
			BinaryTreeNode t=layer.remove();
			layerList.add(t.val);
			start++;
			if(t.left!=null) 
				layer.add(t.left);
			if (t.right!=null) 
				layer.add(t.right);
			if(start==end) {
				end=layer.size();
				start=0;
				result.add(layerList);
				layerList=new ArrayList<Integer>();
			}
		}
		return result;
	}
}
