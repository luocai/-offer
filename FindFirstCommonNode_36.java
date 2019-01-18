package offer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    
public class FindFirstCommonNode_36 {
	
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		
		while(p1 != p2){
			p1 = (p1 == null ? pHead2 : p1.next);
			p2 = (p2 == null ? pHead1 : p2.next);
		}
		return p1;
    }
	
	public ListNode FindFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
		
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		
		int len1 = getLength(p1);
		int len2 = getLength(p2);
		
		if(len1 > len2){
			int x = len1 - len2;
			while(x>0){
				p1 = p1.next;
				x--;
			}
		}else{
			int x = len2 - len2;
			while(x >0){
				p2 = p2.next;
				x--;
			}
		}
		
		while(p1 != null){
			if(p1 == p2)
				return p1;
			p1 = p1.next;
			p2 = p2.next;
		}
		return null;
    }
	
	public int getLength(ListNode node){
		int res = 0;
		while(node != null){
			node = node.next;
			res++;
		}
		return res;
	}


}
