package problem16;
/**
 * 反转链表
 * @author Administrator
 *
 */
public class Solution {
	public static void main(String[] args) {
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode three=new ListNode();
		ListNode four=new ListNode();
		ListNode five=new ListNode();
		ListNode six=new ListNode();
		head.val=1;
		second.val=2;
		three.val=3;
		four.val=4;
		five.val=5;
		six.val=6;
		head.next=second;
		second.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		Solution s=new Solution();
		System.out.println(s.reverseListNode(head).val);
	}
	private ListNode reverseListNode(ListNode head) {
		ListNode preListNode=null;
		ListNode nowListNode=head;
		ListNode reverseHead=null;
		if(head==null)
			return null;
		while(nowListNode!=null) {
			ListNode nextListNode=nowListNode.next;
			if(nextListNode==null)//那么nowListNode反转之后就是翻转链表的头结点
				reverseHead=nowListNode;
			nowListNode.next=preListNode;
			preListNode=nowListNode;
			nowListNode=nextListNode;
		}
		return reverseHead;
	}
}
