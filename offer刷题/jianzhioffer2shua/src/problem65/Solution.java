package problem65;
/**
 * 65.�����������ĵ�K�����
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
		System.out.println("��3������ֵΪ:"+result.val);
	}

	private BinaryTreeNode KthBinaryTreeNode(BinaryTreeNode root,int k) {
		if(root!=null) {//�������Ѱ�ҵ�K���ڵ�
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
