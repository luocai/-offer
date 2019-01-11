package offer;

public class FindGreatestSumOfSubArray_30 {
	
	public int FindGreatestSumOfSubArray(int[] array) {
        
		
		return solution(array, 0);
    }
	
	public int solution(int[] array, int index){
		
		int res = 0;
		for(int i = index; i< array.length ;i++){
			int tsum = 0;
			for(int j = index; j<= i; j++){
				tsum += array[j];
			}
			res = Math.max(res, Math.max(tsum, solution(array, i+1)));
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		FindGreatestSumOfSubArray_30 f = new FindGreatestSumOfSubArray_30();
		int[] a = {6,-3,-2,7,-15,1,2,2};
		System.out.println(f.FindGreatestSumOfSubArray(a));
	}

}
