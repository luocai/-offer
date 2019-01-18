package offer;

public class InversePairs_35 {
	
	int res = 0;
	public int InversePairs(int [] array) {
        
		if(array != null)
			solutionHelper(array, 0, array.length-1);
		
		
		return res;
    }
	
	public void solutionHelper(int[] array, int l, int r){
		
		if(l < r){
			int m = (l +r)  /2;
			solutionHelper(array, l, m);
			solutionHelper(array, m+1, r);
			
			merge(array, l, m, r);
		}
	}
	
	public void merge(int[] array, int l,int m, int r){
		
		int i = l, j = m +1, k = 0;
		int[] helper = new int[r-l+1];
		while(i <= m && j <= r){
			
			if(array[i] <= array[j]){
				helper[k++] = array[i++];
			}else{
				helper[k++] = array[j++];
				res += m-i + 1;
				res %= 1000000007;
			}	
		}
		while( i <=m){
			helper[k++] = array[i++];
		}
		while( j <= r){
			helper[k++] = array[j++];
		}
		
		for(int x = 0; x < k; x++){
			array[x+l] = helper[x];
		}
		
	}

}
