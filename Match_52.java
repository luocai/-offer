package offer;

public class Match_52 {
	
	public static boolean match(char[] str, char[] pattern)
    {
        int i = 0, j  = 0;
        
        while(i < str.length && j < pattern.length){
        	if(str[i] == pattern[j] || pattern[j] == '.'){
        		i++;
        		j++;
        	}else{
        		
        		if(pattern[j] == '*'){
        			while( i +1< str.length && str[i+1] == str[i] ){
        				i++;
        			}
        			i++;
        			j++;
        			continue;
        		}
        		if( j+1 < pattern.length && pattern[j+1] == '*'){
        			j += 2;
        		
        		}
        		if(j+1 < pattern.length)
        			return false;
        	}
        }
        if(i == str.length && j== pattern.length)
        	return true;
        return false;
    }
	
	public static void main(String[] args) {
		char[] str = {'a','a','a'};
		char[] p = {'a','a','b','*','a'};
		
		System.out.println(match(str, p));
	}

}
