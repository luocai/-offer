package offer;

import java.util.ArrayList;

public class GetLeastNumbers_29 {
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        
		ArrayList<Integer> res = new ArrayList<>();
		
		if(k > input.length)
			return res;
		
		for(int i = input.length ;input.length - i < k; i--){
			
			for(int j = 0; j < i-1; j++){
				if(input[j] < input[j+1]){
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
				
			}
			res.add(input[i-1]);
		}
		
//		for(int i = 0; i < input.length ;i++){
//			System.out.print(input[i] + " ");
//		}
		return res;
    }
	
	public static void main(String[] args) {
		
		GetLeastNumbers_29 g = new GetLeastNumbers_29();
		int[] a  = {3,5,2,7,5,9};
		System.out.println(g.GetLeastNumbers_Solution(a, 7).size());
	}

}
