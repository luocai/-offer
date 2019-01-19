package offer;

import java.util.ArrayList;

public class FindNumbersWithSum_42 {
	
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> res = new ArrayList<>();
		int l = 0, h = array.length - 1;
		
		while(l < h){
			if(array[l] + array[h] < sum){
				l++;
			}else if(array[l] + array[h] > sum){
				h--;
			}else{
				
				
				res.add(array[l]);
				res.add(array[h]);
				return res;
			}
		}
		
		
		return res;
    }

	public static void main(String[] args) {
		FindNumbersWithSum_42 f = new FindNumbersWithSum_42();
		
		
	}
}
