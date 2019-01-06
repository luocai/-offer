package offer;

public class Find_1 {
	
	public boolean Find(int target, int [][] array) {

		if(array == null || array.length == 0)
			return false;
		int j = array[0].length - 1;
		int i = 0;
		
		while(j >= 0 && i < array.length){
			if(array[i][j] < target){
				i++;
			}else if(array[i][j] > target){
				j--;
			}else{
				return true;
			}
		}
		
		return false;
    }
 //7,  [[1,2,8,9],
//	    [2,4,9,12],
//	    [4,7,10,13],
//	    [6,8,11,15]]
	
	// 1 2 4 5
	// 2 3 5 6
	// 3 4 6 7
	// 4 5 7 8
//	5,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
	public static void main(String[] args) {
		int[][] a = {{1,2,8,9},
		     	    {2,4,9,12},
		     	    {4,7,10,13},
		     	    {6,8,11,15}};
		
		Find_1 f = new Find_1();
		System.out.println(f.Find(5, a));
	}

}
