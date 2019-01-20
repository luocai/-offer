package offer;

public class Add_48 {
	
	public int Add(int num1,int num2) {
        
		// 进位为 0 终止
		while(num2 != 0){
			// 算不包括进位的和
			int sum = num1 ^ num2;  // 异或 
			//计算进位
			int carry = (num1 & num2) << 1;  // 相于 左移
			num1 = sum;
			num2 = carry;
		}
		return num1;
    }

}
