package offer;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
public class Clone_25 {

	
	public RandomListNode Clone(RandomListNode pHead)
    {
		if(pHead == null)
			return null;
		RandomListNode current = pHead;
		// 复制节点，保存关系
		while(current != null){
			RandomListNode head = new RandomListNode(current.label);
			head.next = current.next;
			current.next = head;
			current = head.next;
		}
        
	
		current = pHead;
		// 置 random 节点
		while(current != null){
			RandomListNode temp = current.random;
			if(temp != null)
				current.next.random = temp.next;
			current = current.next.next;
		}
	
		
		current = pHead;
		RandomListNode res = pHead.next;
		
		// 拆分链表
		while(current != null){
			RandomListNode cloneNode = current.next;
			current.next = cloneNode.next;
			current = current.next;
			cloneNode.next = current == null ? null : current.next;
			cloneNode = cloneNode.next;
		}
		return res;
    }
	
	public static void main(String[] args) {
		
		RandomListNode r1 = new RandomListNode(1);
		RandomListNode r2 = new RandomListNode(2);
		RandomListNode r3 = new RandomListNode(3);
		r1.next = r2;
		r1.random = r3;
		r2.next = r3;
		r2.random = r2;
		
		Clone_25 c = new Clone_25();
		
		System.out.println(c.Clone(r1));
		
	}
	
	
}
