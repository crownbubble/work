package problem15;



/**
 * 求链表中的倒数第K个结点
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
		System.out.println(s.inverseKNode(head,7).val);
	}
	private ListNode inverseKNode(ListNode head,int k) {
		ListNode pStart=head;
		ListNode pBehind=null;
		if(head==null||k==0)
			return null;
		for(int i=1;i<k;i++) {
			if(pStart.next!=null)
				pStart=pStart.next;
			else
				return null;
		}
		pBehind=head;
		while(pStart.next!=null) {
			pStart=pStart.next;
			pBehind=pBehind.next;
		}
		return pBehind;
	}
}

