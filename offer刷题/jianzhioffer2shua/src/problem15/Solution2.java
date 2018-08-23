package problem15;
/**
 * 求链表的中间节点
 * @author Administrator
 *
 */
public class Solution2 {
	public static void main(String[] args) {
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode three=new ListNode();
		ListNode four=new ListNode();
		ListNode five=new ListNode();
		ListNode six=new ListNode();
		ListNode seven=new ListNode();
		head.val=1;
		second.val=2;
		three.val=3;
		four.val=4;
		five.val=5;
		six.val=6;
		seven.val=7;
		head.next=second;
		second.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		six.next=seven;
		Solution2 s2=new Solution2();
		System.out.println(s2.middleListNode(head).val);
	}

	private ListNode middleListNode(ListNode head) {
		if(head==null)
			return null;
		ListNode lowNode=head;
		ListNode fastNode=head;
		while(fastNode.next!=null&&fastNode.next.next!=null) {
				fastNode=fastNode.next.next;
				lowNode=lowNode.next;
			}
		return lowNode;
	}
}
