package offer;

public class StrToInt_49 {
	
	public int StrToInt(String str) {
        
		int res = 0;
		int flag = 1;
		for(int i = 0; i < str.length() ;i++){
			if(i == 0 && !isLea(str.charAt(i))){
				if(str.charAt(i) == '+')
					continue;
				else if(str.charAt(i) == '-'){
					flag = 0;
					continue;
				}
			}
			if(isLea(str.charAt(i))){
				res = res * 10 + str.charAt(i) - '0';
			}else{
				return 0;
			}
		}
		
		return flag == 1? res : res*(-1);
		
    }
	
	public boolean isLea(char c){
		if( c >= '0' && c <= '9')
			return true;
		return false;
	}

}
