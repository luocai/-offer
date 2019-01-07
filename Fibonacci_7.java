package offer;

public class Fibonacci_7 {
	
//	public int Fibonacci(int n) {
//		if(n == 0)
//			return 0;
//		if(n == 1)
//			return 1;
//		
//		
//		return Fibonacci(n-1) + Fibonacci(n-2);
//    }
	
	public int Fibonacci(int n) {
	
		if(n == 0)
			return 0;
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i < dp.length;i++){
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
    }
	
	public static void main(String[] args) {
		
		Fibonacci_7 f = new Fibonacci_7();
		System.out.println(f.Fibonacci(0));
	}
	
	

}
