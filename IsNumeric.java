package offer;

public class IsNumeric {
	
	public boolean isNumeric(char[] str) {
        
		boolean sign = false, point = false, hasE = false;
		
		for(int i = 0; i < str.length ;i++){
			if(str[i] == '+' || str[i] == '-'){
				
				if(sign == true && str[i-1] != 'e' && str[i-1] != 'E')
					return false;
				
				if(sign != true && i > 0 &&  str[i-1] != 'e' && str[i-1] != 'E')
					return false;
				
				sign = true;
			}else if(str[i] == 'e' || str[i] == 'E'){
				// 出现两次 或者 是最后一位
				if(hasE || i == str.length-1){
					return false;
				}
				hasE = true;
			}else if(str[i] == '.'){
				//出现两次 或者在开始 或者 在e后
				if(point || i == 0 || hasE)
					return false;
				
				point = true;
			}else if(str[i] < '0' || str[i] > '9'){
				return false;
			}
		}
		
		return true;
    }

}
