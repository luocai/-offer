package offer;

import java.util.LinkedHashMap;

public class FirstAppearingOnce {
	
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
	
    public void Insert(char ch)
    {
        if(map.containsKey(ch)){
        	map.put(ch, map.get(ch)+1);
        }else{
        	map.put(ch, 1);
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	for(Character ch : map.keySet()){
    		if(map.get(ch) == 1)
    			return ch;
    	}
    	return '#';
    }

}
