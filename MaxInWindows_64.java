package offer;

import java.util.ArrayList;

public class MaxInWindows_64 {
	
	public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
		ArrayList<Integer> res = new ArrayList<>();
		
		if(size > num.length)
			return res;
		
        if(num.length < size)
        	return res;
        
		int prem = num[0];
		
		for(int i = 1 ; i< size-1; i++){
			if(prem < num[i]){
				prem = num[i];
			}
		}
//		System.out.println("prem:" + prem); //{2,3,4,2,6,2,5,1}
		for(int i = size-1; i < num.length ;i++){
			
			if(prem < num[i]){
				res.add(num[i]);
				prem = num[i];
			}else{
				if(i-size >= 0 &&num[i-size] == prem){
					prem = max(num, i-size+1, i);
				}
				res.add(prem);
			}
//			System.out.println("prem:" + prem);
		}
		
		return res;
    }
	
	public static int max(int[] num, int i, int j){
		int m = num[i];
		
		while(i <= j){
			if(m < num[i]){
				m = num[i];
			}
			i++;
		}
		return m;
	}
	
	//{2,3,4,2,6,2,5,1}
	
	public static void main(String[] args) {
		
		int[] a = {2,4,3,2,6,2,5,1};
		
		System.out.println(maxInWindows(a, 3));
	}

}
