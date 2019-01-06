package offer;

public class MinNumberInRotateArray_6 {
	
	public int minNumberInRotateArray(int [] array) {
	   
		if(array.length == 0)
			return 0;
		
		for(int i = 1; i < array.length ;i++){
			if(array[i] < array[i-1])
				return array[i];
		}
		return array[0];
    }

}
