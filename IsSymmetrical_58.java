package offer;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class IsSymmetrical_58 {

	
	boolean isSymmetrical(TreeNode pRoot)
    {
		if(pRoot == null)
			return true;
		return judge(pRoot.left,pRoot.right);
		
    }
	
	public boolean judge(TreeNode r1,TreeNode r2){
		
		if(r1 == null || r2 == null){
			if(r1 == r2)
				return true;
			else
				return false;
		}
		boolean res = true;
		
		if(r1.val == r2.val){
			res = judge(r1.left, r2.right) && judge(r1.right,r2.left);
		}else
			return false;
		return res;
	}
	
	public TreeNode mrror(TreeNode root){
		
		if(root == null)
			return null;
		TreeNode temp = root.right;
		root.left = mrror(root.right);
		root.right = mrror(temp);
		return root;
		
	}
}
