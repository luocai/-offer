package offer;

public class FindNumsAppearOnce_40 {

	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length == 0)
        	return;
		
		num1[0] = 0;
		num2[0] = 0;
		int sum = 0;
		
		for(int i = 0; i < array.length ;i++)
			sum ^= array[i];
		
		//找到第一个不同的位
		int index = getIndex(sum);
		

		for(int i = 0;i < array.length ;i++){
			if(isBit(array[i], index)){
				num1[0] ^= array[i];
			}else{
				num2[0] ^= array[i];
			}
		}
		
		
    }
	
	public int getIndex(int sum){
		int index = 0;
		
		while((sum & 1) != 1 && index < 32){
			sum = sum >> 1;
			index++;
		}
		return index;
	}
	
	public boolean isBit(int num, int index){
		num >>= index;
		return (num & 1) == 1;
	}

}
