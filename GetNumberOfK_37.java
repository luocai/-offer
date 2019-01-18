package offer;

public class GetNumberOfK_37 {

	public int GetNumberOfK(int [] array , int k) {
	    
		if(array.length == 0)
			return 0;
		int l = 0, r = array.length-1;
		
		while(l <= r){
			int mid = (l +r) /2;
			if(k > array[mid]){
				l = mid +1;
			}else if(k < array[mid]){
				r = mid - 1;
			}else{
				int t = mid+1;
				int resl = 0;
				int resr = 0;
				while(t <= r && k == array[t]){
					resr++;
					t++;
				}
				while(mid >= l && k == array[mid]){
					resl++;
					mid--;
				}
				return resl + resr ;
			}
		}
		
		return 0;
    }
	
	public static void main(String[] args) {
		
		GetNumberOfK_37 g = new GetNumberOfK_37();
		
//		int[] a = {1,1,2,3,3,3,3,3,4,4,4,5};
		int[] a = {2};
		System.out.println(g.GetNumberOfK(a, 2));
	}
}
