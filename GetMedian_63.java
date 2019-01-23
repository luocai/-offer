package offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GetMedian_63 {
	
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(15,new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o2  - o1;
		}
		
		
	});
	int  count = 0;
	
	// 保证所有小顶堆 的数 大于大顶堆的，满足了排序
	//  由于是奇 偶划分，数目平分
	public void Insert(Integer num) {
		
		if(count % 2 ==1){ // 偶数
			minHeap.offer(num);
			int min = minHeap.poll();
			
			maxHeap.offer(min);
		}else{
			maxHeap.offer(num);
			
			int max = maxHeap.poll();
			minHeap.offer(max);
		}
		count++;
	    
    }

    public Double GetMedian() {
   
        if(count % 2 == 0) {
        	return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }else{
        	return minHeap.peek() / 1.0;
        }
    }
    
    public static void main(String[] args) {
		
    	int[] a = {5,2,3,4,1,6,7,0,8 };
    	GetMedian_63 g = new GetMedian_63();
    	for(int i = 0; i < a.length ;i++){
    		g.Insert(a[i]);
    		System.out.println(g.GetMedian());
    	}
    	
    	
	}

}
