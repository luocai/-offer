package offer;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Merge_16 {
	
	 public ListNode Merge(ListNode list1,ListNode list2) {
	        ListNode res = null;
	        ListNode realres = res;
	        
	        
	        while(list1 != null && list2 != null){
	        	if(list1.val < list2.val){
	        		if(res == null){
	        			res = list1;
	        			list1 = list1.next;
	        			realres = res;
	        		}	
	        		else{
	        			res.next = list1;
	        			res = res.next;
	        			list1 = list1.next;
	        		}
	        	}else{
	        		if(res == null){
	        			res = list2;
	        			list2 = list2.next;
	        			realres = res;
	        		}
	        		else{
	        			res.next = list2;
	        			res = res.next;
	        			list2 = list2.next;
	        		}
	        	}
	        }
	        if(res == null){
	        	if(list1 != null)
	        		return list1;
	        	else
	        		return list2;
	        }
	        if(list1 != null){
	        	res.next =list1;
	        }
	        if(list2 != null){
	        	res.next =list2;
	        }
	        
	        return realres;
	 }
	 
	 public ListNode Merge1(ListNode list1,ListNode list2) {
	       if(list1 == null){
	    	   return list2;
	       }
	       if(list2 == null){
	    	   return list1;
	       }
	       
	       ListNode res = null;
	       if(list1.val < list2.val){
	    	   res = list1;
	    	   list1 = list1.next;
	       }else{
	    	   res = list2;
	    	   list2 = list2.next;
	       }
	       res.next = Merge1(list1,list2);
	       return res;
	 }


}
