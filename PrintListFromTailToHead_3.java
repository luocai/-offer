package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
public class PrintListFromTailToHead_3 {
	
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        
		 ArrayList<Integer> res = new ArrayList<>();
		 
		 LinkedList<Integer> stack = new LinkedList<>();
		 
		 while(listNode != null){
			 stack.addFirst(listNode.val);
			 listNode = listNode.next;
		 }
		 
		 while(!stack.isEmpty()){
			 res.add(stack.removeFirst());
		 }
		 return res;
		 
	 }
	 
//	 ArrayList<Integer> res = new ArrayList<>();
//	 public ArrayList<Integer> solution(ListNode listNode){
//		 
//		 if(listNode != null){
//			 solution
//		 }
//		 return null;
//	 }

}
