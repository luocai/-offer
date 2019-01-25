package offer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class EntryNodeOfLoop_55 {
	
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead, slow = pHead;
        
        while(fast != null && fast.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        	if(slow.val == fast.val){
        		slow = pHead;
        		while(slow.val != fast.val){
        			slow = slow.next;
        			fast = fast.next;
        		}
        		return slow;
        	}
        }
        
        return null;
    }

}
