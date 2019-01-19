package offer;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence_41 {
	
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	    
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for(int i = 1; i < sum  ; i++){
			int s = 0;
			ArrayList<Integer> tres = new ArrayList<>();
			for(int j = i; j < sum  ; j++){
				s += j;
				tres.add(j);
				if(s == sum){
					res.add(tres);
					break;
				}else if(s > sum){
					break;
				}
			}
			
		}
		return res;
    }
	
	public ArrayList<ArrayList<Integer> > FindContinuousSequence2(int sum) {
	    
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int pl = 1, ph = 2;
		
		while(ph < sum){
			
			int cur = (pl + ph)*(ph - pl + 1) / 2;
			
			if(cur == sum){
				ArrayList<Integer> tres = new ArrayList<>();
				for(int i = pl; i <= ph; i++)
					tres.add(i);
				res.add(tres);
				pl++;
			}else if(cur < sum){
				ph++;
			}else if(cur > sum){
				pl++;
			}
			
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		
		FindContinuousSequence_41 f = new FindContinuousSequence_41();
		
		System.out.println(f.FindContinuousSequence2(3));
	}
	

}
