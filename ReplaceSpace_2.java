package offer;

public class ReplaceSpace_2 {
	
	public String replaceSpace(StringBuffer str) {
    	
		String res = "";
		
		for(int i = 0; i < str.length() ;i++){
			if(str.charAt(i) != ' '){
				res += str.charAt(i);
			}else{
				res += "%20";
			}
		}
		
		return res;
    }
	
	public static void main(String[] args) {
		ReplaceSpace_2 r = new ReplaceSpace_2();
		StringBuffer s = new StringBuffer("ss dd d");
		System.out.println(r.replaceSpace(s));
	}
}
