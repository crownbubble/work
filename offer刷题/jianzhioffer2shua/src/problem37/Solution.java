package problem37;
/**
 * 找出两个链表的第一个公共结点
 * 有公共结点的两个链表一定是形状是Y的，肯定不会形状是X
 * @author Administrator
 *
 */
public class Solution {

	public static void main(String[] args) {
		//定义两个链表
		ListNode pHead1=new ListNode(1);
		ListNode pHead1Node1=new ListNode(2);
		ListNode pHead1Node2=new ListNode(3);
		ListNode pHead1Node3=new ListNode(6);
		ListNode pHead1Node4=new ListNode(7);
		pHead1.next=pHead1Node1;
		pHead1Node1.next=pHead1Node2;
		pHead1Node2.next=pHead1Node3;
		pHead1Node3.next=pHead1Node4;
		ListNode pHead2=new ListNode(4);
		ListNode pHead2Node1=new ListNode(5);
		ListNode pHead2Node2=new ListNode(6);
		ListNode pHead2Node3=new ListNode(7);
		pHead2.next=pHead2Node1;
		pHead2Node1.next=pHead2Node2;
		pHead2Node2.next=pHead2Node3;
		Solution s=new Solution();
		ListNode result=s.firstCommonListNode(pHead1, pHead2);
		System.out.println(result.val);
	}
	public ListNode firstCommonListNode(ListNode pHead1,ListNode pHead2) {
		ListNode current1=pHead1;
		ListNode current2=pHead2;
		if (pHead1==null || pHead2==null) {
			return null;
		}
		int len1=getListNodeLength(current1);
		int len2=getListNodeLength(current2);
		//如果链表1的长度大于链表2的长度
		if(len1>=len2) {
			int len=len1-len2;
			//先遍历链表1,遍历长度为两链表的长度差
			while(len>0) {
				current1=current1.next;
				len--;
			}
		}
		//如果链表1的长度小于链表2的长度
		else if(len1<len2) {
			int len=len2-len1;
			//先遍历链表2，遍历长度是两链表的长度差
			while(len>0) {
				current2=current2.next;
				len--;
			}
		}
		//从开头开始齐头并进
		while(current1!=null && current2!=null && current1.val!=current2.val) {
			current1=current1.next;
			current2=current2.next;
		}
		return current1;
	} 
	//定义方法,获取链表的长度
	public int getListNodeLength(ListNode head) {
		int count=0;
		ListNode current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
}
