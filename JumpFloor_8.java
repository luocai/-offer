package offer;

import java.util.Arrays;

public class JumpFloor_8 {
	
	// 519ms 递归
//	public int JumpFloor(int target) {
//
//		if(target == 1)
//			return 1;
//		if(target == 2)
//			return 2;
//		
//		return JumpFloor(target -1) + JumpFloor(target - 2);
//    }
	
	
	//18ms 记忆化搜索
//	public int JumpFloor(int target) {
//
//		int[] memo = new int[target+1];
//		Arrays.fill(memo, -1);
//		
//		return soulution(target, memo);
//    }
//	public int soulution(int target,int[] memo){
//		if(memo[target] != -1)
//			return memo[target];
//		if(target == 1)
//			return 1;
//		if(target == 2)
//			return 2;
//		
//		memo[target] =  soulution(target -1,memo) + soulution(target - 2,memo);
//		
//		return memo[target];
//	}
	
	// 14ms dp
	public int JumpFloor(int target) {

	
		if(target == 1 || target == 2 || target == 0)
			return target;
		int[] dp = new int[target+1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i < dp.length ;i++){
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[target];
    }


}
