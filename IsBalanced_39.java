package offer;

public class IsBalanced_39 {
	
	boolean res = true;
	public boolean IsBalanced_Solution(TreeNode root) {
        
		if(root == null)
			return true;
		
		IsBalanced_Solution(root.left);
		IsBalanced_Solution(root.right);
		
		int lenl = getLen(root.left);
		int lenr = getLen(root.right);
		
		return res && Math.abs(lenr - lenl) <= 1;
    }
	
	public int getLen(TreeNode root){
		if(root == null)
			return 0;
		
		return Math.max(getLen(root.left), getLen(root.right)) + 1;
	}
	
	public boolean IsBalanced_Solution2(TreeNode root) {
		return getDepth(root) != -1;
	}
	
	public int getDepth(TreeNode root){
		if(root == null)
			return 0;
		int left = getDepth(root.left);
		if(left == -1)
			return -1;
		int right = getDepth(root.right);
		if(right == -1)
			return -1;
		
		return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
	}

}
