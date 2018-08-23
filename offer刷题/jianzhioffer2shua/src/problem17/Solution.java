package problem17;


public class Solution {
	public static void main(String[] args) {
		ListNode head1=new ListNode();
		ListNode second1=new ListNode();
		ListNode three1=new ListNode();
		ListNode four1=new ListNode();
		head1.val=1;
		second1.val=3;
		three1.val=5;
		four1.val=7;
		head1.next=second1;
		second1.next=three1;
		three1.next=four1;
		ListNode head2=new ListNode();
		ListNode second2=new ListNode();
		ListNode three2=new ListNode();
		ListNode four2=new ListNode();
		head2.val=2;
		second2.val=4;
		three2.val=6;
		four2.val=8;
		head2.next=second2;
		second2.next=three2;
		three2.next=four2;
		Solution s=new Solution();
		ListNode mergeListNode=s.mergeListNode(head1,head2);
		System.out.println(mergeListNode.val);
		System.out.println(mergeListNode.next.val);
		System.out.println(mergeListNode.next.next.val);
		System.out.println(mergeListNode.next.next.next.val);
		System.out.println(mergeListNode.next.next.next.next.val);
		System.out.println(mergeListNode.next.next.next.next.next.val);
		System.out.println(mergeListNode.next.next.next.next.next.next.val);
		System.out.println(mergeListNode.next.next.next.next.next.next.next.val);
	}

	private ListNode mergeListNode(ListNode head1, ListNode head2) {
		if(head1==null) 
			return head2;
		if(head2==null)
			return head1;
		ListNode mergeHead=null;
		if(head1.val>head2.val) {
			mergeHead=head2;
			mergeHead.next=mergeListNode(head1, head2.next);
		}
		else {
			mergeHead=head1;
			mergeHead.next=mergeListNode(head1.next, head2);
		}
		return mergeHead;	
	}
}
