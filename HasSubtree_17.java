package offer;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
    
public class HasSubtree_17 {
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)
        	return false;
        return solution(root1,root2) || solution(root1.left,root2) || solution(root1.right,root2);
       
    }
	
	public boolean solution(TreeNode root1,TreeNode root2){

		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.val != root2.val){
			return false;
		}
		return solution(root1.left,root2.left) && solution(root1.right,root2.right);
		
	}
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		t1.left = t2;
		t1.right =t3;
		t2.left = t4;
		t2.right = t5;
		t4.left = t7;
		t3.left = t6;
//		t3.right = t7;
		
		TreeNode v2 = new TreeNode(2);
		TreeNode v4 = new TreeNode(4);
		TreeNode v5 = new TreeNode(5);
		v2.left = v4;
		v2.right = v5;
		
		HasSubtree_17 h = new HasSubtree_17();
		
		System.out.println(h.HasSubtree(t1, v2));
		
	}

}
