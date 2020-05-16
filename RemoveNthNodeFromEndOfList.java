package leetcode;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		/*
		 * ListNode slow=head; ListNode fast=head; for(int i=0;i<n;i++) {
		 * fast=fast.next; } while(fast!=null&&fast.next!=null) { slow=slow.next;
		 * fast=fast.next; } if(slow.next==null) head=null; else
		 * slow.next=slow.next.next;
		 * 
		 * return head;
		 */
		// PASSED SOLUTION
		/*
		 * ListNode dummy=head; ListNode temp=head; int count=1; while(dummy.next!=null)
		 * { count++; dummy=dummy.next; } if(count-n==0) return head.next; for(int
		 * i=0;i<count-n-1;i++) { temp=temp.next; }
		 * 
		 * if(temp.next==null) head=null; else temp.next=temp.next.next;
		 * 
		 * return head;
		 */
		// two pointer with a dummy node and same process as above mentioned
	   /*
	    * public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
}
	    */
	 }

}
