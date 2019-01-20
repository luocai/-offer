package offer;

public class Sum_Solution_47 {
	
	//利用短路原理
	public int Sum_Solution(int n) {
        
		int ans = n;
		boolean flag = (n > 0) && ((ans += Sum_Solution(--n)) > 0);
		return ans;
    }

}
