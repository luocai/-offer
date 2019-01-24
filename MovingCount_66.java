package offer;

public class MovingCount_66 {
	
	public int movingCount(int threshold, int rows, int cols)
    {
		boolean[][] visited = new boolean[rows][cols];
		
		return travel(0,0,rows, cols, threshold, visited);
		
    }
	
	public int travel(int m, int n, int rows, int cols, int k, boolean[][] visited){
		
		
		if(m >= rows || m < 0 || n < 0|| n >= cols || visited[m][n] == true || getS(m) + getS(n) > k){
			return 0;
		}
		visited[m][n] = true;
		return travel(m+1,n,rows, cols, k, visited) + travel(m-1,n,rows, cols, k, visited)
		+ travel(m,n+1,rows, cols, k, visited) + travel(m,n-1,rows, cols, k, visited) + 1;
		
	}
	
	public int getS(int a){
		
		int res = 0;
		
		while(a != 0){
			res += a % 10;
			a /= 10;
		}
		return res;
		
	}

}
