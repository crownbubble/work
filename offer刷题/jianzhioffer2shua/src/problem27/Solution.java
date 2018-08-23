package problem27;
/**
 * 28.序列化二叉树
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 * @author Administrator
 *
 */
public class Solution {
	int index=-1;
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode node1=new TreeNode(2);
		TreeNode node2=new TreeNode(3);
		TreeNode node3=new TreeNode(4);
		TreeNode node4=new TreeNode(5);
		TreeNode node5=new TreeNode(6);
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node2.left=node4;
		node2.right=node5;
		Solution s=new Solution();
		System.out.println(s.Serialize(root));
		String str= "1,2,4,#,#,#,3,5,#,#,6,#,#";
		System.out.println(s.Deserialize(str).left.val);
	}
	public String Serialize(TreeNode root) {
		StringBuffer sb=new StringBuffer();
		if(root==null) {
			sb.append("#,");
			return sb.toString();
		}
		sb.append(root.val+",");
		sb.append(Serialize(root.left));
		sb.append(Serialize(root.right));
		return sb.toString();
	}
	public TreeNode Deserialize(String str) {
		index++;
		int len=str.length();
		if(index>=len)
			return null;
		String[] str1=str.split(",");
		TreeNode root=null;
		if(!str1[index].equals("#")) {
			root=new TreeNode(Integer.valueOf(str1[index]));
			root.left=Deserialize(str);
			root.right=Deserialize(str);
		}
		return root;
	}
}
