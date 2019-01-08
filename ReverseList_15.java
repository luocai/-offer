package offer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseList_15 {
	
	public ListNode ReverseList(ListNode head) {
		
		ListNode p = null;
		ListNode q = head;
		
		while(q != null){
			ListNode temp = q.next;
			q.next = p;
			p = q;
			q = temp;
		}
		
		return p;
    }

}
