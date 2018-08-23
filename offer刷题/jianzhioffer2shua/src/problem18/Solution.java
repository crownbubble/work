package problem18;
/**
 * �ж�һ�ö�����A���Ƿ��ж�����B���ӽṹ
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		BinaryTreeNode rootB=new BinaryTreeNode(8);
		BinaryTreeNode nodeB1=new BinaryTreeNode(9);
		BinaryTreeNode nodeB2=new BinaryTreeNode(2);
		
		BinaryTreeNode rootA=new BinaryTreeNode(8);
		BinaryTreeNode nodeA1=new BinaryTreeNode(8);
		BinaryTreeNode nodeA2=new BinaryTreeNode(7);
		BinaryTreeNode nodeA3=new BinaryTreeNode(9);
		BinaryTreeNode nodeA4=new BinaryTreeNode(2);
		BinaryTreeNode nodeA5=new BinaryTreeNode(4);
		BinaryTreeNode nodeA6=new BinaryTreeNode(7);
		rootB.setLeft(nodeB1);
		rootB.setRight(nodeB2);
		
		rootA.setLeft(nodeA1);
		rootA.setRight(nodeA2);
		nodeA1.setLeft(nodeA3);
		nodeA1.setRight(nodeA4);
		nodeA4.setLeft(nodeA5);
		nodeA5.setRight(nodeA6);
		Solution s=new Solution();
		System.out.println(s.HasSubtree(rootA,rootB));
	}

	public boolean HasSubtree(BinaryTreeNode rootA, BinaryTreeNode rootB) {
		boolean result=false;
		if(rootA!=null && rootB!=null) {
//			if(Equals(rootA.val,rootB.val))
			if(rootA.val == rootB.val)
				result=checkAHasB(rootA, rootB);
			if(!result)
				result=HasSubtree(rootA.left, rootB);
			if(!result)
				result=HasSubtree(rootA.right, rootB);
		}
		return result;
	}

//	public boolean Equals(double num1, double num2) {
//		if((num1-num2)>-0.0000001 &&(num1-num2)<0.0000001)
//			return true;
//		return false;
//	}

	public boolean checkAHasB(BinaryTreeNode rootA, BinaryTreeNode rootB) {
		if(rootB==null)
			return true;
		if(rootA==null)//�����A���Ѿ��������ˣ�������û���ҵ�����ôһ�����ǲ�������
			return false;
//		if(!Equals(rootA.val, rootB.val))
		if(rootA.val != rootB.val)
			return false;
		return checkAHasB(rootA.left, rootB.left)&&checkAHasB(rootA.right, rootB.right);
	}
}
