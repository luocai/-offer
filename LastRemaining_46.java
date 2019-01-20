package offer;

import java.util.ArrayList;
import java.util.List;

public class LastRemaining_46 {

	public int LastRemaining_Solution(int n, int m) {
		
		if(n == 0 || m == 0)
			return -1;
        
		List<Integer> stu = new ArrayList<>();
		for(int i = 0;i < n; i++){
			stu.add(i);
		}
		
		int index  = 0;
		while(stu.size() > 1){
			index = (index + m -1)% stu.size();
			
			stu.remove(index);
		}
		
		
		return stu.get(0);
    }
	
	public static void main(String[] args) {
		LastRemaining_46 l = new LastRemaining_46();
		
		System.out.println(l.LastRemaining_Solution(5, 3));
	}
}
