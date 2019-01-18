package offer;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar_34 {
	
	public int FirstNotRepeatingChar(String str) {
		
		if(str.length() == 0)
			return -1;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++){
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i), 1);
		}
		
		for(int i = 0;i < str.length() ;i++){
			if(map.get(str.charAt(i)) == 1){
				return i;
			}
		}
//		for(Character in : map.keySet()){
//			if(map.get(in) == 1)
//				return map.get(in);
//		}
		
        return -1;
    }

}
