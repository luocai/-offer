package offer;

public class ReverseSentence_44 {
	
	public String ReverseSentence(String str) {
        String[] strs = str.split(" ");
        int l = 0, r = strs.length-1;
        
        while(l < r){
        	String temp = strs[l];
        	strs[l++] = strs[r];
        	strs[r--] = temp;
        }
        
        String res = "";
        for(int i = 0; i < strs.length;i++){
        	res += "" + strs[i];
        }
        
        return res;
    }

}
