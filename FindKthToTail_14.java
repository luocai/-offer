package offer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindKthToTail_14 {
	
	// 先 走 k-1 步  ， 另一个再开始走
	public ListNode FindKthToTail(ListNode head,int k) {

		ListNode f = head, s = head;
		
		int c = 1;
		while(c != k && f != null){
			c++;
			f = f.next;
		}
		
		if(f == null)
			return null;
		
		while(f != null){
			
			f = f.next;
			if(f!=null)
				s = s.next;
		}
		
		return s;
    }
	
	public static void main(String[] args) {
		
		FindKthToTail_14 f = new FindKthToTail_14();
		
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		
		System.out.println(f.FindKthToTail(l1, 2));
	}
	//笨办法
//	public ListNode FindKthToTail(ListNode head,int k) {
//
//		int c = 1;
//		
//		ListNode p = head;
//		while(p!= null){
//			c++;
//			p = p.next;
//		}
//		int t = 1;
//		while(head != null){
//			if(t == c - k){
//				return head;
//			}
//			t++;
//			head = head.next;
//		}
//		
//		return null;
//    }

}
