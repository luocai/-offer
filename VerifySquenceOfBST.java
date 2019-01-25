package offer;

public class VerifySquenceOfBST {
	
	public static boolean VerifySquenceOfBST(int [] sequence) {
		

		if(sequence.length == 0)
			return false;
		if(sequence.length == 1)
			return true;
		return judge(sequence, 0, sequence.length-1);
    }
	
	public static boolean judge(int[] sequence, int i , int j){
		
		if( i >= j)
			return true;
		
		int t = i;
		
		while(i< j && sequence[i] <= sequence[j]){
			i++;
		}
		
		while(i < j ){
			if(sequence[i] <= sequence[j]){
				return false;
			}
			i++;
		}
		
		return judge(sequence, t, i-1) && judge(sequence, i, j-1);
		
	}
	
	public static void main(String[] args) {
		int[] a = {3,4,2,6,7};
		System.out.println(VerifySquenceOfBST(a));
	}

}
