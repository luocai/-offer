package offer;

public class ReOrderArray_13 {
	
	public void reOrderArray(int [] array) {
        
		int[] helperO = new int[array.length];
		int[] helperQ = new int[array.length];
		int m = 0;
		int n = 0;
		for(int i = 0; i < array.length;i++){
			if(array[i] % 2 == 0){
				helperO[m++] = array[i];
			}else{
				helperQ[n++] = array[i];
			}
		}
		for(int i = 0; i < n; i++){
			array[i] = helperQ[i];
		}
		for(int i = n; i < n+m;i++){
			array[i] = helperO[i-n];
		}
    }
	
	//类冒泡排序
	public void reOrderArray2(int [] array) {
        
		for(int i = array.length; i > 0; i--){
			for(int j = 1; j < i; j++){
				if(array[j] % 2 == 1 && array[j-1] % 2 == 0){
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
    }

}
