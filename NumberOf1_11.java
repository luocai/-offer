package offer;

public class NumberOf1_11 {
	
	public int NumberOf1(int n) {
		
		int res = 0;
		while(n != 0){
			res++;
			n = n & (n-1);
		}
		return res;
    }
	
	// 1010000
	// 1001111
	
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		NumberOf1_11 m = new NumberOf1_11();
		System.out.println(m.NumberOf1(-2147483648));
	}

}
