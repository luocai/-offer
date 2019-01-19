package offer;

public class LeftRotateString_43 {


		 /**
		     * 思路：
		     * 1.先翻转前半部分
		     * 2.再翻转后半部分
		     * 3.再对字符串整个进行翻转
		     *
		     * 考点：不使用库对字符串进行灵活的翻转
		     */
	public String LeftRotateString(String str,int n) {
       
		if(str.length() < n)
			return "";
		
		String s1 = reverse(str.substring(0,n));
		System.out.println("jieguo1:" + s1);
		String s2 = reverse(str.substring(n,str.length()));
		System.out.println("jieguo2:" + s2);
		
		return reverse(s1+s2);
		
    }
	
	public String reverse(String str){
		System.out.print(str);
		StringBuffer s = new StringBuffer(str);
		int l = 0, r = s.length() -1;
		
		while(l < r){
			char temp = s.charAt(l);
			
			s.setCharAt(l++, s.charAt(r));
			s.setCharAt(r--, temp);
			System.out.println(l + " " + r);
			
		}
		return s.toString();
	}
	
	public static void main(String[] args) {
		LeftRotateString_43 l = new LeftRotateString_43();
		
		System.out.println(l.LeftRotateString("abcdefg", 2));
	}

}
