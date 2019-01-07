package offer;

import java.util.Arrays;

public class JumpFloorII_9 {

		public int JumpFloorII(int target) {
	        if(target == 0)
	        	return 0;
	        int[] memo = new int[target+1];
	        Arrays.fill(memo, -1);
	        return solutionSearch(target, memo);
//			return solution(target);
	    }
		
		//28ms  递归
		public int solution(int target){
			
			if(target == 1 || target == 0)
				return 1;
			
			int res = 0;
			for(int i = 0; i < target; i++){
				res += solution(i);
			}
			return res;
		}
		
		// 18 ms 记忆化搜索
		public int solutionSearch(int target, int[] memo){
			
			if(memo[target] != -1)
				return memo[target];
			
			if(target == 1 || target == 0)
				return 1;
			
			int res = 0;
			for(int i = 0; i < target; i++){
				res += solutionSearch(i,memo);
			}
			memo[target] = res;
			return res;
		}
		
		//dp
		public int solutionDp(int target){
			
			if(target == 0)
				return 0;
			
			int[] dp = new int[target+1];
			dp[0] = 1;
			dp[1] = 1;
			
			for(int i = 2; i < dp.length ; i++){
				dp[i] = 0;
				for(int j = 0; j < i; j++){
					dp[i] += dp[j];
				}
			}
			
			return dp[target];
		}
		
		public static void main(String[] args) {
			JumpFloorII_9  j = new JumpFloorII_9();
			
			System.out.println(j.JumpFloorII(6));
		}
}
