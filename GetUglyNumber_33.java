package offer;

public class GetUglyNumber_33 {
	
	public int GetUglyNumber_Solution(int index) {
		
		if(index <1)
			return 0;
		
		int[] res = new int[index];
		
		res[0]  = 1;
		
		int t1 = 0, t2 = 0 , t3 = 0;
		
		for(int i = 1; i < index;i++){
			res[i] = Math.min(Math.min(res[t1]*2, res[t2]*3), res[t3]*5);
			
			if(res[i] == res[t1]*2)
				t1++;
			if(res[i] == res[t2]*3)
				t2++;
			if(res[i] == res[t3]*5)
				t3++;
		}
        return res[index-1];
    }

}
